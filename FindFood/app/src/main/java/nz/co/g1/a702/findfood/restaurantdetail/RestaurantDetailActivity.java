package nz.co.g1.a702.findfood.restaurantdetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import nz.co.g1.a702.findfood.R;

import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ADDRESS;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_NAME;

public class RestaurantDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        String restaurantName = getIntent().getStringExtra(EXTRA_RESTAURANT_NAME);
        String restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);

        Toolbar toolbar = findViewById(R.id.detail_toolbar);
        toolbar.setTitle(restaurantName);

        TextView addressView = findViewById(R.id.detail_restaurant_address);
        addressView.setText(restaurantAddress);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
