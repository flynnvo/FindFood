package nz.co.g1.a702.findfood;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import nz.co.g1.a702.findfood.placesapi.Restaurant;

public class RestaurantListActivity extends AppCompatActivity {
    private static final int LOCATION_PERMISSION_REQUEST = 22;

    private RestaurantListAdapter restaurantListAdapter;
    private RestaurantListViewModel viewModel;
    private RecyclerView restaurantListView;
    private TextView emptyView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        checkGooglePlayServices();

        restaurantListView = findViewById(R.id.main_restaurant_list);
        emptyView = findViewById(R.id.main_empty_view);
        restaurantListView.setHasFixedSize(true);
        restaurantListView.setLayoutManager(new LinearLayoutManager(this));

        restaurantListAdapter = new RestaurantListAdapter(this);
        restaurantListView.setAdapter(restaurantListAdapter);
        viewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, LOCATION_PERMISSION_REQUEST);
        } else {
            loadRestaurants();
        }
    }

    private void checkGooglePlayServices() {
        int status = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
        if (status != ConnectionResult.SUCCESS) {
            Dialog errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
            errorDialog.setOnDismissListener(dialog -> finish());
            errorDialog.show();
        }
    }

    @SuppressLint("CheckResult")
    private void loadRestaurants() {
        viewModel.getRestaurants()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::setAdapterData,
                        Throwable::printStackTrace);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == LOCATION_PERMISSION_REQUEST && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            loadRestaurants();
        }
    }

    private void setAdapterData(List<Restaurant> restaurantList) {
        if (restaurantList == null || restaurantList.isEmpty()) {
            restaurantListView.setVisibility(View.GONE);
            emptyView.setVisibility(View.VISIBLE);
        } else {
            restaurantListView.setVisibility(View.VISIBLE);
            emptyView.setVisibility(View.GONE);
            restaurantListAdapter.setDistanceLocation(viewModel.getCurrentLocation());
            restaurantListAdapter.setItems(restaurantList);
        }
    }
}
