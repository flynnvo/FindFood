package nz.co.g1.a702.findfood.restaurantdetail;

import android.arch.lifecycle.ViewModelProviders;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import nz.co.g1.a702.findfood.R;

import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ADDRESS;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ID;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_NAME;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_PHOTO_URL;

public class RestaurantDetailActivity extends AppCompatActivity {
    private RestaurantDetailViewModel viewModel;

    private ImageView appBarBackground;
    private View appBarScrim;
    private TextView notesView;

    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);

        this.appBarBackground = findViewById(R.id.detail_app_bar_background);
        this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
        this.notesView = findViewById(R.id.detail_notes_view);

        String restaurantName = getIntent().getStringExtra(EXTRA_RESTAURANT_NAME);
        String placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
        String restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
        String photoUrl = getIntent().getStringExtra(EXTRA_RESTAURANT_PHOTO_URL);

        Toolbar toolbar = findViewById(R.id.detail_toolbar);
        toolbar.setTitle(restaurantName);

        TextView addressView = findViewById(R.id.detail_restaurant_address);
        addressView.setText(restaurantAddress);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewModel.setPlaceId(placeId);

        loadAppbarImage(photoUrl);
        loadNotes();
    }

    @Override
    protected void onDestroy() {
        if (disposable != null && !disposable.isDisposed()) disposable.dispose();
        super.onDestroy();
    }

    private void loadAppbarImage(String photoUrl) {
        if (photoUrl != null && !photoUrl.isEmpty()) {
            Glide.with(this)
                    .load(photoUrl)
                    .into(new SimpleTarget<Drawable>() {
                        @Override
                        public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                            appBarBackground.setBackgroundDrawable(resource);
                            appBarScrim.setVisibility(View.VISIBLE);
                        }
                    });
        }

    }

    private void loadNotes() {
        disposable = viewModel.getNotes()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(restaurantNote -> {
                            notesView.setText(restaurantNote.getNote());
                            viewModel.setCurrentNote(restaurantNote);
                        },
                        error -> notesView.setText(R.string.no_notes_entered));
    }

    public void editNotes(View view) {
        showNoteInputDialog();
    }

    private void showNoteInputDialog() {
        final View root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
        final EditText noteInput = root.findViewById(R.id.notes_dialog_text);
        noteInput.setText(viewModel.getCurrentNoteText());
        new AlertDialog.Builder(this)
                .setTitle(R.string.notes)
                .setView(root)
                .setPositiveButton(R.string.done, ((dialog, i) -> viewModel.editNote(noteInput.getText().toString())))
                .setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel())
                .show();
    }
}
