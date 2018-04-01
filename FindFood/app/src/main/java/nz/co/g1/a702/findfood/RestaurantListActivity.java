package nz.co.g1.a702.findfood;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RestaurantListActivity extends AppCompatActivity {
    private RestaurantListAdapter restaurantListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        RecyclerView restaurantListView = findViewById(R.id.main_restaurant_list);
        restaurantListView.setHasFixedSize(true);
        restaurantListView.setLayoutManager(new LinearLayoutManager(this));

        restaurantListAdapter = new RestaurantListAdapter();
        restaurantListView.setAdapter(restaurantListAdapter);

        RestaurantListViewModel viewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);

        viewModel.getRestaurants(0, 0)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(restaurantList -> restaurantListAdapter.setItems(restaurantList),
                        Throwable::printStackTrace);
    }
}
