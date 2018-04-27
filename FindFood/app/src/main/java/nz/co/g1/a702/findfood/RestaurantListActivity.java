package nz.co.g1.a702.findfood;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
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
import nz.co.g1.a702.findfood.restaurantdetail.RestaurantDetailActivity;

public class RestaurantListActivity extends AppCompatActivity {

    /**
     * Restaurant name intent extra
     */
    public static final String EXTRA_RESTAURANT_NAME = "name";

    /**
     * Google Places Restaurant ID intent extra
     */
    public static final String EXTRA_RESTAURANT_ID = "id";

    /**
     * Restaurant address intent extra
     */
    public static final String EXTRA_RESTAURANT_ADDRESS = "address";

    /**
     * Restaurant photo URL intent extra
     */
    public static final String EXTRA_RESTAURANT_PHOTO_URL = "photoUrl";

    /**
     * Location permission request code
     */
    private static final int LOCATION_PERMISSION_REQUEST = 22;

    /**
     * Adapter to use for the restaurant list
     */
    private RestaurantListAdapter restaurantListAdapter;

    /**
     * ViewModel to keep the restaurant list information in
     */
    private RestaurantListViewModel viewModel;

    /**
     * List to display restaurants in
     */
    private RecyclerView restaurantListView;

    /**
     * Text view to display when the restaurant list is empty
     */
    private TextView emptyView;

    /**
     * Swipe to refresh layout to listen for refreshes on
     */
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        checkGooglePlayServices();

        restaurantListView = findViewById(R.id.main_restaurant_list);
        emptyView = findViewById(R.id.main_empty_view);
        swipeRefreshLayout = findViewById(R.id.main_swipe_refresh);
        restaurantListView.setHasFixedSize(true);

        restaurantListAdapter = new RestaurantListAdapter(this);
        restaurantListAdapter.setOnItemClickListener(this::viewRestaurantDetail);
        restaurantListView.setAdapter(restaurantListAdapter);
        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
        viewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);

        swipeRefreshLayout.setOnRefreshListener(this::loadRestaurantsWithCheck);

        loadRestaurantsWithCheck();
    }

    /**
     * Launches the restaurant detail view activity
     *
     * @param restaurant the restaurant whose details to display
     */
    private void viewRestaurantDetail(Restaurant restaurant) {
        Intent intent = new Intent(this, RestaurantDetailActivity.class);
        intent.putExtra(EXTRA_RESTAURANT_NAME, restaurant.getName());
        intent.putExtra(EXTRA_RESTAURANT_ID, restaurant.getPlaceId());
        intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
        intent.putExtra(EXTRA_RESTAURANT_PHOTO_URL, restaurant.getImageUrl(1440, 1440));
        startActivity(intent);
    }

    /**
     * Checks the location permission and loads the restaurant list for the current location if available
     */
    private void loadRestaurantsWithCheck() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            showPermissionExplanationDialog();
        } else {
            loadRestaurants();
        }
    }

    private void showPermissionExplanationDialog() {
        new AlertDialog.Builder(this)
                .setMessage(R.string.permission_explanation)
                .setPositiveButton(R.string.ok, ((dialog, i) ->
                        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, LOCATION_PERMISSION_REQUEST)))
                .setNegativeButton(R.string.cancel, (dialog, i) -> setAdapterData(null))
                .show();
    }

    /**
     * Check the availability of Google Play Services on the devices
     * These are needed to retrieve the user's location
     */
    private void checkGooglePlayServices() {
        int status = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
        if (status != ConnectionResult.SUCCESS) {
            Dialog errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
            errorDialog.setOnDismissListener(dialog -> finish());
            errorDialog.show();
        }
    }

    /**
     * Loads the restaurant list for the current location
     */
    @SuppressLint("CheckResult")
    private void loadRestaurants() {
        viewModel.getRestaurants()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::setAdapterData, error -> this.setAdapterData(null));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == LOCATION_PERMISSION_REQUEST && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            loadRestaurants();
        }
    }

    /**
     * Sets the adapter's data if restaurants are found or displays a message
     *
     * @param restaurantList the list of restaurants to display
     */
    private void setAdapterData(List<Restaurant> restaurantList) {
        swipeRefreshLayout.setRefreshing(false);
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

    /**
     * LayoutManager used to disable auto-measure for the list
     */
    class FixedSizeLayoutManager extends LinearLayoutManager {

        FixedSizeLayoutManager(Context context) {
            super(context);
        }

        @Override
        public boolean isAutoMeasureEnabled() {
            return false;
        }
    }
}
