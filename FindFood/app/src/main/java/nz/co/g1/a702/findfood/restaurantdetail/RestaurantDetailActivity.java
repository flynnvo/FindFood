package nz.co.g1.a702.findfood.restaurantdetail;

import android.arch.lifecycle.ViewModelProviders;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import nz.co.g1.a702.findfood.R;
import nz.co.g1.a702.findfood.database.RestaurantNote;

import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ADDRESS;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ID;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_NAME;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_PHOTO_URL;

public class RestaurantDetailActivity extends AppCompatActivity {
    /**
     * ViewModel used for information related to the activity's views
     */
    private RestaurantDetailViewModel viewModel;

    /**
     * Background ImageView for the expanded AppBar
     */
    private ImageView appBarBackground;

    /**
     * Scrim overlay view for the expanded AppBar to increase legibility
     */
    private View appBarScrim;

    /**
     * TextView in which to display the user's notes
     */
    private TextView noNotesView;

    /**
     * View to display the list of notes in
     */
    private RecyclerView notesListView;

    /**
     * Adapter for the notes list view
     */
    private RestaurantNotesListAdapter listAdapter;

    /**
     * Holds the database {@link io.reactivex.Flowable} to dispose of it on activity destroy
     */
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);

        this.appBarBackground = findViewById(R.id.detail_app_bar_background);
        this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
        this.noNotesView = findViewById(R.id.detail_no_notes_view);
        this.notesListView = findViewById(R.id.detail_notes_list);

        listAdapter = new RestaurantNotesListAdapter();
        listAdapter.setOnItemClickListener(this::showNoteInputDialog);
        listAdapter.setOnItemLongClickListener(this::showNoteDeleteDialog);
        notesListView.setAdapter(listAdapter);
        notesListView.setLayoutManager(new LinearLayoutManager(this));

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
                            appBarBackground.setImageDrawable(resource);
                            appBarScrim.setVisibility(View.VISIBLE);
                        }
                    });
        }

    }

    /**
     * Loads the notes for this restaurant from the database or displays a message if none found
     */
    private void loadNotes() {
        disposable = viewModel.getNotes()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::setAdapterData,
                        error -> noNotesView.setText(R.string.no_notes_entered));
    }

    /**
     * Sets the adapter's data if notes are found or displays a message
     *
     * @param notes the list of notes to display
     */
    private void setAdapterData(List<RestaurantNote> notes) {
        if (notes == null || notes.isEmpty()) {
            notesListView.setVisibility(View.GONE);
            noNotesView.setVisibility(View.VISIBLE);
        } else {
            notesListView.setVisibility(View.VISIBLE);
            noNotesView.setVisibility(View.GONE);
            listAdapter.setItems(notes);
        }
    }

    /**
     * The method called to launch the editing of notes
     *
     * @param view the view that has been clicked
     */
    public void createNote(View view) {
        showNoteInputDialog(new RestaurantNote(0, viewModel.getPlaceId(), ""));
    }

    /**
     * Shows the dialog for entering a new note or editing an existing note
     */
    private void showNoteInputDialog(RestaurantNote note) {
        final View root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
        final EditText noteInput = root.findViewById(R.id.notes_dialog_text);
        noteInput.setText(note.getNote());

        new AlertDialog.Builder(this)
                .setTitle(R.string.notes)
                .setView(root)
                .setPositiveButton(R.string.done, ((dialog, i) -> {
                    note.setNote(noteInput.getText().toString());
                    viewModel.editNote(note);
                }))
                .setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel())
                .show();
    }

    private void showNoteDeleteDialog(RestaurantNote note) {
        new AlertDialog.Builder(this)
                .setTitle(R.string.notes)
                .setMessage(R.string.delete_item)
                .setPositiveButton(R.string.remove, ((dialog, i) -> viewModel.deleteNote(note)))
                .setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel())
                .show();
    }
}
