package nz.co.g1.a702.findfood.restaurantdetail;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import nz.co.g1.a702.findfood.R;

import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ADDRESS;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_NAME;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_PHOTO_URL;

public class RestaurantDetailActivity extends AppCompatActivity {
    private ImageView appBarBackground;
    private View appBarScrim;
    private TextView notesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        appBarBackground = findViewById(R.id.detail_app_bar_background);
        appBarScrim = findViewById(R.id.detail_app_bar_scrim);
        notesView = findViewById(R.id.detail_notes_view);

        String restaurantName = getIntent().getStringExtra(EXTRA_RESTAURANT_NAME);
        String restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
        String photoUrl = getIntent().getStringExtra(EXTRA_RESTAURANT_PHOTO_URL);

        Toolbar toolbar = findViewById(R.id.detail_toolbar);
        toolbar.setTitle(restaurantName);

        TextView addressView = findViewById(R.id.detail_restaurant_address);
        addressView.setText(restaurantAddress);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadAppbarImage(photoUrl);
        loadNotes();
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
        // TODO: Implement
    }

    public void editNotes(View view) {
        // TODO: Implement
    }
}
