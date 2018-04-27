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

    public static final String EXTRA_RESTAURANT_NAME = Decrypt.decrypt("NjFxc2F4ZHNvdGZvcW15b293dmVicnRocm5menNzbnFpZmZhd2JsYWZnc3B0dGNoaWRtbGhocWk=");

    public static final String EXTRA_RESTAURANT_ID = Decrypt.decrypt("ODNzbmVkcnVwemhmc25neGVxaGZxcmNkc2F0ZHZsa2hhc2V2dnFwcXd0ZHp6ZG91enN6ZHh3");

    public static final String EXTRA_RESTAURANT_ADDRESS = Decrypt.decrypt("OTFkdnJramdpZHNvdGZvcW15b293dmVicnRocm5menNzbnFpZmZhd2JsYWZnc3B0dGNoaWRtbGhocWk=");

    public static final String EXTRA_RESTAURANT_PHOTO_URL = Decrypt.decrypt("MTN6cnlkeUVidmVkcnVwemhmc25neGVxaGZxcmNkc2F0ZHZsa2hhc2V2dnFwcXd0ZHp6ZG91enN6ZHh3");

    private static final int LOCATION_PERMISSION_REQUEST = 22;

    private RestaurantListAdapter restaurantListAdapter;

    private RestaurantListViewModel viewModel;

    private RecyclerView restaurantListView;

    private TextView emptyView;

    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String switchOnThis = "೦০օ〇૦௦ჿ੦ዐｏჿჿ〇ዐℴ〇০೦ዐօ೦౦೦ዐ೦๐০ｏ๐оօჿ๐ⲟоⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 390, 425, 642, 663, 19, 537, 467, 271, 642, 530, 47, 446, 124, 89, 243, 607, 593, 152, 299, 572, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦০〇௦ⲟℴ໐ⲟዐ౦૦໐০ዐℴ၀০໐ዐ০૦౦၀ዐ০௦೦ｏ๐౦ⲟ౦౦೦၀ｏ":
                    if (OPAQUES[16] % OPAQUES[20] != OPAQUES[21]) {
                        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
                        switchOnThis = "ⲟⲟჿ౦૦о၀оዐ০೦ℴℴዐℴ೦๐၀ዐօⲟℴ໐ዐℴｏ௦೦օ౦૦૦оｏ౦౦";
                    } else {
                        swipeRefreshLayout = findViewById(R.id.main_swipe_refresh);
                        switchOnThis = "ⲟჿ໐၀၀о૦০ዐℴ௦০оዐℴ૦ჿ೦ዐօօ໐૦ዐо০ｏ၀๐੦০ℴ〇೦ჿ౦";
                    }
                    break;
                case "੦੦೦౦౦ｏ၀օዐ੦ℴ၀օዐℴ၀૦ჿዐ০၀၀০ዐ೦௦օ၀੦ℴⲟ૦օ၀૦၀":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        viewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);
                        switchOnThis = "੦௦੦၀০ℴ০ｏዐℴ௦〇օዐℴ໐օ๐ዐ০ℴ০೦ዐօ௦ჿ၀௦௦ℴ๐௦௦〇ⲟ";
                    } else {
                        swipeRefreshLayout = findViewById(R.id.main_swipe_refresh);
                        switchOnThis = "၀௦౦ჿ૦၀оℴዐ೦૦੦оዐℴ໐౦૦ዐօ๐૦օዐ௦০૦໐੦ℴ০೦౦ｏℴ೦";
                    }
                    break;
                case "၀౦о໐೦၀о౦ዐｏ೦〇০ዐℴｏօ〇ዐօо၀໐ዐ੦оｏ౦〇၀ჿｏ໐օｏ౦":
                    restaurantListAdapter.setOnItemClickListener(this::viewRestaurantDetail);
                    switchOnThis = "၀ｏჿჿℴ੦〇ｏዐℴ〇০ⲟዐℴ০օ੦ዐ੦๐օჿዐ૦ⲟо໐օ౦੦໐ℴ၀〇ｏ";
                    break;
                case "๐໐೦ჿо๐օ೦ዐ၀೦ჿ၀ዐℴ〇〇ｏዐ੦௦๐๐ዐ၀ⲟօ੦௦ℴⲟ〇০੦၀૦":
                    if (OPAQUES[13] % OPAQUES[22] != OPAQUES[20]) {
                        restaurantListView = findViewById(R.id.main_restaurant_list);
                        switchOnThis = "օ〇๐০оօｏ೦ዐჿ੦၀૦ዐℴ〇੦ℴዐ੦૦੦໐ዐ〇๐๐ⲟ໐໐ｏ೦௦௦ჿ〇";
                    } else {
                        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
                        switchOnThis = "ჿ૦໐௦ჿ૦၀ჿዐօ〇օ໐ዐℴჿ๐๐ዐ૦๐օ၀ዐჿ০ჿ੦০၀ჿ၀০ｏо๐";
                    }
                    break;
                case "০ⲟｏ௦০౦ооዐｏ௦о໐ዐℴ੦০໐ዐօ〇౦౦ዐℴ၀౦ⲟ၀๐๐၀໐ｏჿ౦":
                    if (OPAQUES[2] % OPAQUES[20] != OPAQUES[21]) {
                        setContentView(R.layout.activity_restaurant_list);
                        switchOnThis = "ｏ௦ⲟ੦໐౦੦૦ዐ౦௦໐௦ዐℴ၀၀௦ዐ੦ｏօ௦ዐо૦ჿօ૦૦оⲟ၀၀ჿ೦";
                    } else {
                        restaurantListAdapter = new RestaurantListAdapter(this);
                        switchOnThis = "၀օ૦౦໐ჿ〇၀ዐ໐ჿ౦๐ዐℴ๐੦੦ዐ૦੦੦౦ዐօ০ℴ০〇๐ⲟ૦০੦〇ⲟ";
                    }
                    break;
                case "ｏⲟჿⲟօｏ໐〇ዐ੦оｏ๐ዐℴｏ০০ዐ০౦໐ℴዐ೦০ｏ〇௦о๐๐௦૦ⲟ๐":
                    emptyView = findViewById(R.id.main_empty_view);
                    switchOnThis = "૦၀ⲟ௦ｏ૦໐ℴዐⲟօ௦〇ዐℴⲟ౦ⲟዐ੦о૦ｏዐօօ၀౦оℴօ၀оｏ๐๐";
                    break;
                case "೦օօ๐০๐๐၀ዐ໐০ⲟ໐ዐℴℴ০௦ዐ૦௦оℴዐ੦௦๐ჿ০〇ⲟ๐оｏ੦ⲟ":
                    emptyView = findViewById(R.id.main_empty_view);
                    switchOnThis = "௦໐〇૦૦౦〇੦ዐ〇໐ооዐℴჿⲟ౦ዐ૦০૦օዐｏ௦〇௦౦૦〇ｏ౦ｏⲟ၀";
                    break;
                case "௦௦ⲟօｏｏ၀૦ዐ૦ⲟ〇౦ዐℴօჿ໐ዐ০օ၀ჿዐℴ੦೦օ๐ｏ௦౦ｏօ௦օ":
                    super.onCreate(savedInstanceState);
                    switchOnThis = "೦〇ｏ౦૦օ౦ჿዐ௦๐ⲟоዐℴჿօ੦ዐ০ჿჿℴዐ௦໐೦໐໐ⲟ௦૦ｏ௦ჿ໐";
                    break;
                case "੦௦੦၀০ℴ০ｏዐℴ௦〇օዐℴ໐օ๐ዐ০ℴ০೦ዐօ௦ჿ၀௦௦ℴ๐௦௦〇ⲟ":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        restaurantListAdapter = new RestaurantListAdapter(this);
                        switchOnThis = "౦օჿ০ჿⲟⲟｏዐօ〇оօዐℴ૦௦оዐօჿⲟ೦ዐ૦ⲟ೦၀၀೦၀၀ჿ૦০၀";
                    } else {
                        swipeRefreshLayout.setOnRefreshListener(this::loadRestaurantsWithCheck);
                        switchOnThis = "оօ੦ჿℴℴօ೦ዐօօ౦ⲟዐℴ౦օ೦ዐ০оо೦ዐ౦০๐೦౦૦੦ჿℴℴ੦〇";
                    }
                    break;
                case "оօ੦ჿℴℴօ೦ዐօօ౦ⲟዐℴ౦օ೦ዐ০оо೦ዐ౦০๐೦౦૦੦ჿℴℴ੦〇":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        loadRestaurantsWithCheck();
                        switchOnThis = "〇೦૦૦օჿ໐၀ዐჿ၀໐оዐℴ੦೦౦ዐ੦੦૦௦ዐჿℴ〇ⲟ౦օ๐๐〇౦ℴ๐";
                    } else {
                        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
                        switchOnThis = "௦೦о໐੦ⲟ౦೦ዐ໐〇૦ℴዐℴ௦ჿ૦ዐ০௦〇๐ዐჿｏоჿо๐੦౦о૦ⲟ০";
                    }
                    break;
                case "໐໐໐ｏჿ౦ℴ০ዐ๐օℴоዐℴჿⲟ੦ዐ੦о૦ჿዐ၀০၀ჿ੦ჿ๐೦೦০০๐":
                    emptyView = findViewById(R.id.main_empty_view);
                    switchOnThis = "౦〇௦ℴ〇ℴ๐૦ዐ໐૦੦ｏዐℴჿ౦౦ዐ੦೦о೦ዐჿ〇օｏо౦၀౦๐ⲟ০ｏ";
                    break;
                case "ⲟჿ໐၀၀о૦০ዐℴ௦০оዐℴ૦ჿ೦ዐօօ໐૦ዐо০ｏ၀๐੦০ℴ〇೦ჿ౦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantListView.setHasFixedSize(true);
                        switchOnThis = "০ⲟｏ௦০౦ооዐｏ௦о໐ዐℴ੦০໐ዐօ〇౦౦ዐℴ၀౦ⲟ၀๐๐၀໐ｏჿ౦";
                    } else {
                        emptyView = findViewById(R.id.main_empty_view);
                        switchOnThis = "ℴ౦ℴｏ૦੦〇ჿዐ〇౦ჿоዐℴօ૦০ዐ૦ｏჿⲟዐ〇၀೦၀о၀ｏ〇০၀೦о";
                    }
                    break;
                case "૦౦໐૦ℴⲟо০ዐ੦ｏⲟ੦ዐℴ೦๐ℴዐ૦໐ჿ໐ዐ໐օℴ໐૦օ೦૦〇௦೦о":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantListView.setAdapter(restaurantListAdapter);
                        switchOnThis = "০௦〇੦௦૦০ℴዐ๐໐ჿ၀ዐℴ০ℴ๐ዐ૦ｏｏ௦ዐ໐೦〇౦օ၀౦ℴ০૦౦౦";
                    } else {
                        restaurantListAdapter = new RestaurantListAdapter(this);
                        switchOnThis = "о๐੦ℴｏ೦оჿዐ〇ℴ၀೦ዐℴ૦ჿ〇ዐ০૦օ০ዐ๐〇ⲟ໐੦໐௦〇о၀૦੦";
                    }
                    break;
                case "ⲟℴоℴօჿ၀౦ዐ౦ｏ౦০ዐℴоｏჿዐ০໐౦௦ዐⲟ〇০оⲟ೦౦ｏ౦௦〇੦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        setContentView(R.layout.activity_restaurant_list);
                        switchOnThis = "๐০օ௦౦੦೦০ዐ๐ⲟ౦౦ዐℴ౦০ℴዐ૦૦ℴ੦ዐ૦ℴ౦ℴ๐੦ჿჿｏоо๐";
                    } else {
                        setContentView(R.layout.activity_restaurant_list);
                        switchOnThis = "০ჿ௦〇၀о〇໐ዐ〇౦௦օዐℴ၀೦ｏዐ০〇օⲟዐ၀೦ｏ੦೦૦ｏоо੦૦౦";
                    }
                    break;
                case "օ〇๐০оօｏ೦ዐჿ੦၀૦ዐℴ〇੦ℴዐ੦૦੦໐ዐ〇๐๐ⲟ໐໐ｏ೦௦௦ჿ〇":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        swipeRefreshLayout = findViewById(R.id.main_swipe_refresh);
                        switchOnThis = "௦၀ⲟ၀೦౦ჿჿዐ၀ჿｏℴዐℴ၀〇౦ዐ੦о૦੦ዐо૦೦๐օ〇০ⲟ௦๐೦໐";
                    } else {
                        emptyView = findViewById(R.id.main_empty_view);
                        switchOnThis = "౦০〇௦ⲟℴ໐ⲟዐ౦૦໐০ዐℴ၀০໐ዐ০૦౦၀ዐ০௦೦ｏ๐౦ⲟ౦౦೦၀ｏ";
                    }
                    break;
                case "০௦〇੦௦૦০ℴዐ๐໐ჿ၀ዐℴ০ℴ๐ዐ૦ｏｏ௦ዐ໐೦〇౦օ၀౦ℴ০૦౦౦":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
                        switchOnThis = "੦੦೦౦౦ｏ၀օዐ੦ℴ၀օዐℴ၀૦ჿዐ০၀၀০ዐ೦௦օ၀੦ℴⲟ૦օ၀૦၀";
                    } else {
                        checkGooglePlayServices();
                        switchOnThis = "๐〇оჿ૦૦౦ℴዐ௦౦೦၀ዐℴⲟ၀੦ዐ੦ჿ〇օዐ〇ჿ๐၀০૦౦оօօ০੦";
                    }
                    break;
                case "๐০օ௦౦੦೦০ዐ๐ⲟ౦౦ዐℴ౦০ℴዐ૦૦ℴ੦ዐ૦ℴ౦ℴ๐੦ჿჿｏоо๐":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        checkGooglePlayServices();
                        switchOnThis = "๐໐೦ჿо๐օ೦ዐ၀೦ჿ၀ዐℴ〇〇ｏዐ੦௦๐๐ዐ၀ⲟօ੦௦ℴⲟ〇০੦၀૦";
                    } else {
                        restaurantListView.setHasFixedSize(true);
                        switchOnThis = "໐օｏჿоо০೦ዐ০௦ჿօዐℴℴ၀ⲟዐօ૦օ੦ዐ〇೦оօօ၀ⲟ၀໐૦೦ⲟ";
                    }
                    break;
                case "၀օ૦౦໐ჿ〇၀ዐ໐ჿ౦๐ዐℴ๐੦੦ዐ૦੦੦౦ዐօ০ℴ০〇๐ⲟ૦০੦〇ⲟ":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantListAdapter.setOnItemClickListener(this::viewRestaurantDetail);
                        switchOnThis = "૦౦໐૦ℴⲟо০ዐ੦ｏⲟ੦ዐℴ೦๐ℴዐ૦໐ჿ໐ዐ໐օℴ໐૦օ೦૦〇௦೦о";
                    } else {
                        checkGooglePlayServices();
                        switchOnThis = "ⲟ௦౦໐౦ჿ௦օዐℴ૦໐੦ዐℴо೦௦ዐ૦ⲟჿ੦ዐｏо০օ೦੦੦೦૦೦о௦";
                    }
                    break;
                case "໐๐໐ℴ໐௦০૦ዐ০ⲟ૦౦ዐℴⲟｏჿዐօ၀ჿ૦ዐ〇ⲟⲟо௦օⲟℴ೦೦〇૦":
                    super.onCreate(savedInstanceState);
                    switchOnThis = "૦໐օ〇௦〇০ℴዐ〇੦ｏ๐ዐℴ౦౦੦ዐօ၀੦௦ዐ௦ⲟⲟ၀〇оⲟ೦ⲟⲟ໐೦";
                    break;
                case "օ๐〇౦௦๐ｏｏዐօ౦ⲟｏዐℴ౦ℴ೦ዐ૦ｏ੦೦ዐо০ჿ၀о੦໐о〇၀໐໐":
                    viewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);
                    switchOnThis = "૦௦௦ⲟ௦๐౦౦ዐℴ೦ｏｏዐℴ੦੦ჿዐ૦ℴℴჿዐ૦౦ℴ௦၀〇օ၀〇օჿ໐";
                    break;
                case "೦০օ〇૦௦ჿ੦ዐｏჿჿ〇ዐℴ〇০೦ዐօ೦౦೦ዐ೦๐০ｏ๐оօჿ๐ⲟоⲟ":
                    if (OPAQUES[10] % OPAQUES[20] == OPAQUES[21]) {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "ⲟℴоℴօჿ၀౦ዐ౦ｏ౦০ዐℴоｏჿዐ০໐౦௦ዐⲟ〇০оⲟ೦౦ｏ౦௦〇੦";
                    } else {
                        restaurantListView.setAdapter(restaurantListAdapter);
                        switchOnThis = "௦၀૦௦ｏⲟ౦၀ዐօℴｏｏዐℴｏⲟоዐ૦ℴ〇ｏዐｏ౦০〇ｏ૦௦ℴоჿ০౦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void viewRestaurantDetail(Restaurant restaurant) {
        Intent intent = null;
        String switchOnThis = "೦੦໐၀௦ⲟооዐ๐๐ｏ๐ዐℴ〇੦౦ዐ০੦૦૦ዐ০օ੦ჿ೦〇ｏ๐၀ⲟ૦о";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 327, 523, 460, 453, 61, 194, 649, 502, 68, 166, 173, 586, 649, 460, 600, 159, 12, 131, 12, 201, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐໐օ౦ℴо౦౦ዐ๐၀౦օዐℴ૦໐೦ዐ૦ⲟ〇ჿዐ၀੦о〇০ℴｏօ๐૦໐௦":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        intent.putExtra(EXTRA_RESTAURANT_PHOTO_URL, restaurant.getImageUrl(1440, 1440));
                        switchOnThis = "օ〇ℴ໐০ჿჿｏዐ੦〇໐ჿዐℴ๐௦೦ዐ੦౦ჿｏዐ௦০੦௦〇੦ⲟ૦օօⲟ૦";
                    } else {
                        startActivity(intent);
                        switchOnThis = "о౦оօ௦ჿⲟჿዐｏｏ௦૦ዐℴｏჿｏዐօ౦ℴ๐ዐ໐၀૦๐໐০੦໐౦೦໐૦";
                    }
                    break;
                case "೦੦໐၀௦ⲟооዐ๐๐ｏ๐ዐℴ〇੦౦ዐ০੦૦૦ዐ০օ੦ჿ೦〇ｏ๐၀ⲟ૦о":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        intent = new Intent(this, RestaurantDetailActivity.class);
                        switchOnThis = "օ૦๐օℴ໐౦೦ዐℴоჿ౦ዐℴｏ〇ｏዐ০၀૦๐ዐ௦໐ⲟℴ๐ⲟ௦о๐օ໐੦";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
                        switchOnThis = "ⲟо০ⲟ๐௦๐໐ዐ၀օｏⲟዐℴℴჿⲟዐ੦೦ｏ௦ዐ๐੦໐о〇ｏｏ૦౦௦ჿⲟ";
                    }
                    break;
                case "໐ｏｏ০ｏ๐၀૦ዐｏ೦օ௦ዐℴօоℴዐ০ჿ௦၀ዐ๐০๐૦〇о〇๐ｏ೦〇օ":
                    intent.putExtra(EXTRA_RESTAURANT_ID, restaurant.getPlaceId());
                    switchOnThis = "ℴ੦о೦০ჿ〇օዐ〇೦௦ｏዐℴ〇০০ዐ০೦оօዐ໐ℴ໐೦ｏ೦০๐๐ჿⲟℴ";
                    break;
                case "೦ℴⲟ௦೦ｏｏ၀ዐ໐ⲟ੦〇ዐℴ০೦੦ዐ੦໐૦ℴዐჿ〇০໐၀੦๐ⲟօ໐೦໐":
                    if (OPAQUES[1] % OPAQUES[22] == OPAQUES[20]) {
                        intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
                        switchOnThis = "၀〇〇ℴ〇ｏ౦ჿዐⲟ๐〇೦ዐℴо౦ჿዐ૦০૦〇ዐ౦౦ჿ૦օｏоｏｏ໐೦ⲟ";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_ID, restaurant.getPlaceId());
                        switchOnThis = "ℴ੦౦օ၀၀օ০ዐｏⲟ૦೦ዐℴ໐౦௦ዐ૦оⲟօዐ၀૦૦੦ⲟ೦ჿჿჿ၀〇໐";
                    }
                    break;
                case "ჿоо০၀౦૦օዐօо૦೦ዐℴ໐๐оዐ০ⲟ೦௦ዐℴ೦೦ｏ၀〇౦၀օ၀ℴо":
                    intent.putExtra(EXTRA_RESTAURANT_PHOTO_URL, restaurant.getImageUrl(1440, 1440));
                    switchOnThis = "๐ℴо၀੦ჿ๐੦ዐ௦౦૦௦ዐℴ೦ℴ〇ዐօо௦೦ዐｏօℴ౦ｏｏ੦ℴℴ౦ჿ౦";
                    break;
                case "ℴ੦౦օ၀၀օ০ዐｏⲟ૦೦ዐℴ໐౦௦ዐ૦оⲟօዐ၀૦૦੦ⲟ೦ჿჿჿ၀〇໐":
                    if (OPAQUES[1] % OPAQUES[22] != OPAQUES[20]) {
                        intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
                        switchOnThis = "๐໐օ౦ℴо౦౦ዐ๐၀౦օዐℴ૦໐೦ዐ૦ⲟ〇ჿዐ၀੦о〇০ℴｏօ๐૦໐௦";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_PHOTO_URL, restaurant.getImageUrl(1440, 1440));
                        switchOnThis = "໐оჿо૦০օ౦ዐ౦੦੦օዐℴ೦੦〇ዐ੦໐૦౦ዐ০〇၀ｏ০੦௦໐੦ჿ૦ｏ";
                    }
                    break;
                case "օ૦๐օℴ໐౦೦ዐℴоჿ౦ዐℴｏ〇ｏዐ০၀૦๐ዐ௦໐ⲟℴ๐ⲟ௦о๐օ໐੦":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
                        switchOnThis = "๐ჿ౦౦оჿ၀೦ዐ০໐၀௦ዐℴჿｏ໐ዐօ০੦၀ዐℴօ੦૦օ၀ჿ๐о೦໐໐";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_NAME, restaurant.getName());
                        switchOnThis = "೦ℴⲟ௦೦ｏｏ၀ዐ໐ⲟ੦〇ዐℴ০೦੦ዐ੦໐૦ℴዐჿ〇০໐၀੦๐ⲟօ໐೦໐";
                    }
                    break;
                case "օ〇ℴ໐০ჿჿｏዐ੦〇໐ჿዐℴ๐௦೦ዐ੦౦ჿｏዐ௦০੦௦〇੦ⲟ૦օօⲟ૦":
                    if (OPAQUES[1] % OPAQUES[22] == OPAQUES[20]) {
                        intent.putExtra(EXTRA_RESTAURANT_PHOTO_URL, restaurant.getImageUrl(1440, 1440));
                        switchOnThis = "ჿℴ૦౦௦໐૦౦ዐ၀๐ⲟ໐ዐℴ〇၀օዐօ০〇оዐ๐೦ჿօℴ౦၀օｏ၀๐ｏ";
                    } else {
                        startActivity(intent);
                        switchOnThis = "၀໐౦๐ℴ๐౦০ዐჿ౦օ၀ዐℴ௦ℴ౦ዐ૦౦౦૦ዐჿ౦օ೦੦оｏ೦೦૦оօ";
                    }
                    break;
                case "੦ⲟ০੦௦ჿо໐ዐ੦০ｏｏዐℴ೦ⲟ೦ዐ੦০૦ⲟዐ੦ჿоℴ౦ｏ๐౦оⲟ〇օ":
                    startActivity(intent);
                    switchOnThis = "௦о૦ჿ໐੦о၀ዐ০૦੦ℴዐℴ၀੦૦ዐօｏｏⲟዐ๐၀๐ℴ၀௦ჿօ੦๐੦〇";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void loadRestaurantsWithCheck() {
        String switchOnThis = "০ⲟօ০ｏ௦о೦ዐօоℴ૦ዐℴ௦౦๐ዐօ௦೦੦ዐⲟ၀૦૦໐໐੦௦௦၀໐၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 621, 145, 320, 33, 439, 383, 103, 124, 89, 320, 124, 404, 61, 530, 341, 474, 467, 369, 215, 236, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০ⲟօ০ｏ௦о೦ዐօоℴ૦ዐℴ௦౦๐ዐօ௦೦੦ዐⲟ၀૦૦໐໐੦௦௦၀໐၀":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                            showPermissionExplanationDialog();
                        } else {
                            loadRestaurants();
                        }
                        switchOnThis = "ჿⲟ၀၀ℴⲟօⲟዐ໐օჿ૦ዐℴоℴჿዐ૦ℴ໐ｏዐ౦〇ⲟ〇௦օ০օօ໐ⲟ໐";
                    } else {
                        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                            showPermissionExplanationDialog();
                        } else {
                            loadRestaurants();
                        }
                        switchOnThis = "੦೦০௦໐о๐௦ዐо၀೦оዐℴо๐೦ዐ૦૦ჿ૦ዐ০໐ⲟ੦೦೦໐ⲟ০໐੦ⲟ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void showPermissionExplanationDialog() {
        String switchOnThis = "೦ⲟ೦௦૦๐੦০ዐⲟｏｏ௦ዐℴჿ૦๐ዐ০ｏⲟჿዐ੦౦০ჿօ੦ｏｏ၀ⲟօჿ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 285, 75, 299, 75, 418, 432, 481, 208, 306, 474, 89, 369, 96, 418, 558, 194, 250, 96, 474, 467, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦ⲟ೦௦૦๐੦০ዐⲟｏｏ௦ዐℴჿ૦๐ዐ০ｏⲟჿዐ੦౦০ჿօ੦ｏｏ၀ⲟօჿ":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        new AlertDialog.Builder(this).setMessage(R.string.permission_explanation).setPositiveButton(R.string.ok, ((dialog, i) -> ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.ACCESS_FINE_LOCATION }, LOCATION_PERMISSION_REQUEST))).setNegativeButton(R.string.cancel, (dialog, i) -> setAdapterData(null)).show();
                        switchOnThis = "օ၀໐๐০০၀๐ዐ〇ჿօ೦ዐℴоо౦ዐ૦〇০ჿዐ౦౦оჿ໐๐௦օ૦〇〇౦";
                    } else {
                        new AlertDialog.Builder(this).setMessage(R.string.permission_explanation).setPositiveButton(R.string.ok, ((dialog, i) -> ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.ACCESS_FINE_LOCATION }, LOCATION_PERMISSION_REQUEST))).setNegativeButton(R.string.cancel, (dialog, i) -> setAdapterData(null)).show();
                        switchOnThis = "໐૦౦ｏჿ੦о௦ዐ๐೦ℴ〇ዐℴⲟ໐оዐ੦೦၀оዐｏ০౦໐о౦о੦೦օ௦ｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void checkGooglePlayServices() {
        int status = 0;
        Dialog errorDialog = null;
        String switchOnThis = "ⲟ໐੦〇ჿⲟ০оዐ๐০ჿ๐ዐℴℴ௦ｏዐ૦ｏ〇ｏዐჿօ੦௦૦০๐ｏо૦ჿ੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 642, 558, 313, 271, 12, 635, 278, 404, 117, 110, 439, 278, 502, 544, 481, 103, 537, 523, 446, 607, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ⲟ໐੦〇ჿⲟ০оዐ๐০ჿ๐ዐℴℴ௦ｏዐ૦ｏ〇ｏዐჿօ੦௦૦০๐ｏо૦ჿ੦":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        status = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
                        switchOnThis = "೦౦օ૦໐๐〇ⲟዐ੦ℴ૦ⲟዐℴ౦၀оዐ੦௦๐ⲟዐ౦ｏℴ০ჿ〇੦ℴⲟо౦૦";
                    } else {
                        errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
                        switchOnThis = "೦ℴ〇〇ℴ੦ჿ〇ዐ੦ℴ೦ｏዐℴ౦о০ዐ૦၀၀૦ዐ০ⲟ૦၀໐ⲟ౦૦໐оⲟ၀";
                    }
                    break;
                case "೦౦օ૦໐๐〇ⲟዐ੦ℴ૦ⲟዐℴ౦၀оዐ੦௦๐ⲟዐ౦ｏℴ০ჿ〇੦ℴⲟо౦૦":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
                        switchOnThis = "၀ⲟ೦ჿоℴჿჿዐօჿ໐౦ዐℴ੦ооዐ૦੦੦௦ዐоօ૦૦໐૦օ૦௦੦ⲟ၀";
                    } else {
                        errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
                        switchOnThis = "ｏ೦௦оⲟ၀ｏ೦ዐ၀၀ℴℴዐℴ〇ჿ௦ዐ੦๐੦〇ዐჿ๐౦๐ჿℴоℴჿ০ｏ〇";
                    }
                    break;
                case "о০ℴօ၀೦օ০ዐ๐о੦೦ዐℴჿ੦၀ዐ੦ℴ௦ｏዐｏ௦၀օｏⲟ௦೦௦ⲟ౦ⲟ":
                    status = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
                    switchOnThis = "೦૦о〇о੦ჿ౦ዐ〇౦౦ჿዐℴ੦ℴ౦ዐօ၀ⲟ໐ዐ๐ⲟℴ၀၀໐ℴ๐၀੦ｏ౦";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @SuppressLint("CheckResult")
    private void loadRestaurants() {
        String switchOnThis = "ⲟоℴ໐০о၀೦ዐ๐೦ｏჿዐℴჿ੦оዐ০૦ⲟ௦ዐօ໐੦օ০ℴооⲟ੦о౦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 341, 341, 89, 173, 537, 299, 19, 278, 229, 432, 75, 425, 481, 663, 509, 432, 579, 278, 334, 264, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ⲟоℴ໐০о၀೦ዐ๐೦ｏჿዐℴჿ੦оዐ০૦ⲟ௦ዐօ໐੦օ০ℴооⲟ੦о౦":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        viewModel.getRestaurants().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> this.setAdapterData(null));
                        switchOnThis = "о೦၀ⲟоⲟ〇௦ዐ౦௦௦оዐℴℴ௦໐ዐօ೦০౦ዐ〇೦ⲟ૦〇ｏ၀၀໐೦ჿ໐";
                    } else {
                        viewModel.getRestaurants().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> this.setAdapterData(null));
                        switchOnThis = "౦౦໐о౦оჿ௦ዐⲟჿ๐૦ዐℴℴ౦ｏዐ૦օ〇೦ዐℴօჿ০օ၀౦๐ｏ೦০໐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        String switchOnThis = "ჿ૦໐ℴ၀ⲟｏ〇ዐ౦〇૦ℴዐℴ౦օ೦ዐ૦օ౦૦ዐо〇၀౦০೦ⲟ〇০〇ℴℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 334, 313, 117, 467, 418, 180, 544, 502, 208, 467, 467, 152, 250, 530, 89, 355, 474, 89, 264, 369, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿ૦໐ℴ၀ⲟｏ〇ዐ౦〇૦ℴዐℴ౦օ೦ዐ૦օ౦૦ዐо〇၀౦০೦ⲟ〇০〇ℴℴ":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        if (requestCode == LOCATION_PERMISSION_REQUEST && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            loadRestaurants();
                        }
                        switchOnThis = "૦౦၀੦௦〇௦օዐ౦о૦௦ዐℴｏ〇ℴዐ੦੦௦๐ዐооօｏ૦ჿｏჿ০૦໐〇";
                    } else {
                        if (requestCode == LOCATION_PERMISSION_REQUEST && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            loadRestaurants();
                        }
                        switchOnThis = "೦ჿⲟо౦ℴჿ૦ዐⲟჿ௦๐ዐℴｏ੦ჿዐ০౦౦๐ዐｏ੦၀੦๐০০ჿ૦૦૦๐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void setAdapterData(List<Restaurant> restaurantList) {
        String switchOnThis = "оօ౦๐૦օ໐оዐ೦૦օｏዐℴ౦ℴ೦ዐ੦౦оℴዐჿ౦օ੦ｏⲟℴօ௦ｏ೦〇";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 495, 544, 278, 173, 495, 68, 173, 551, 26, 89, 460, 33, 243, 152, 348, 460, 453, 446, 670, 117, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "оօ౦๐૦օ໐оዐ೦૦օｏዐℴ౦ℴ೦ዐ੦౦оℴዐჿ౦օ੦ｏⲟℴօ௦ｏ೦〇":
                    if (OPAQUES[2] % OPAQUES[20] != OPAQUES[21]) {
                        if (restaurantList == null || restaurantList.isEmpty()) {
                            restaurantListView.setVisibility(View.GONE);
                            emptyView.setVisibility(View.VISIBLE);
                        } else {
                            restaurantListView.setVisibility(View.VISIBLE);
                            emptyView.setVisibility(View.GONE);
                            restaurantListAdapter.setDistanceLocation(viewModel.getCurrentLocation());
                            restaurantListAdapter.setItems(restaurantList);
                        }
                        switchOnThis = "௦౦౦๐〇օⲟоዐ০၀ℴℴዐℴ౦૦ⲟዐ০〇〇౦ዐ௦ⲟ૦૦ჿ੦օ௦ｏｏჿ౦";
                    } else {
                        swipeRefreshLayout.setRefreshing(false);
                        switchOnThis = "ჿ〇〇૦০ჿ૦๐ዐ೦௦૦ⲟዐℴ০০၀ዐ੦௦օ๐ዐ၀૦օ௦օ౦о০၀೦ｏ૦";
                    }
                    break;
                case "౦๐օ੦໐೦౦০ዐ၀০〇ｏዐℴ০ⲟჿዐ০੦ჿｏዐо੦ჿ〇੦ⲟ০௦ｏℴ೦〇":
                    if (restaurantList == null || restaurantList.isEmpty()) {
                        restaurantListView.setVisibility(View.GONE);
                        emptyView.setVisibility(View.VISIBLE);
                    } else {
                        restaurantListView.setVisibility(View.VISIBLE);
                        emptyView.setVisibility(View.GONE);
                        restaurantListAdapter.setDistanceLocation(viewModel.getCurrentLocation());
                        restaurantListAdapter.setItems(restaurantList);
                    }
                    switchOnThis = "౦೦ⲟ௦০օоⲟዐ੦௦૦ｏዐℴ૦૦оዐ੦ｏ໐໐ዐ౦о౦ℴℴ০౦о၀౦ℴօ";
                    break;
                case "ჿ〇〇૦০ჿ૦๐ዐ೦௦૦ⲟዐℴ০০၀ዐ੦௦օ๐ዐ၀૦օ௦օ౦о০၀೦ｏ૦":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        swipeRefreshLayout.setRefreshing(false);
                        switchOnThis = "௦๐௦ჿ၀ℴ০০ዐ০০౦оዐℴ๐੦௦ዐ૦օоօዐⲟ౦੦ჿօо๐ⲟ૦੦໐০";
                    } else {
                        if (restaurantList == null || restaurantList.isEmpty()) {
                            restaurantListView.setVisibility(View.GONE);
                            emptyView.setVisibility(View.VISIBLE);
                        } else {
                            restaurantListView.setVisibility(View.VISIBLE);
                            emptyView.setVisibility(View.GONE);
                            restaurantListAdapter.setDistanceLocation(viewModel.getCurrentLocation());
                            restaurantListAdapter.setItems(restaurantList);
                        }
                        switchOnThis = "໐ჿ૦ჿჿօℴｏዐｏ〇၀ჿዐℴℴ〇ｏዐօօ೦၀ዐ౦оⲟօｏ೦০๐оⲟⲟჿ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    class FixedSizeLayoutManager extends LinearLayoutManager {

        FixedSizeLayoutManager(Context context) {
            super(context);
        }

        @Override
        public boolean isAutoMeasureEnabled() {
            String switchOnThis = "౦ჿо๐౦௦ჿ౦ዐ੦ჿℴ౦ዐℴ੦ჿоዐօ၀ჿ೦ዐ೦оℴ౦ℴ೦౦ℴｏоо೦";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 110, 474, 481, 173, 320, 61, 54, 411, 201, 425, 376, 250, 236, 474, 474, 187, 530, 117, 103, 502, 7, 5, 7, 5 };
            while (infiniteLoop) {
                switch(switchOnThis) {
                    case "౦ჿо๐౦௦ჿ౦ዐ੦ჿℴ౦ዐℴ੦ჿоዐօ၀ჿ೦ዐ೦оℴ౦ℴ೦౦ℴｏоо೦":
                        if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                            return false;
                            switchOnThis = "ｏჿ〇໐০〇౦೦ዐо૦ⲟჿዐℴ〇૦੦ዐ૦౦〇оዐоｏⲟ০໐၀૦౦ℴ௦оо";
                        } else {
                            return false;
                            switchOnThis = "ⲟ౦о౦໐օ౦౦ዐⲟ੦໐ჿዐℴо๐ｏዐ૦ⲟ০૦ዐ೦о௦೦ⲟ၀૦૦໐౦ჿо";
                        }
                    default:
                        infiniteLoop = false;
                }
            }
            return false;
        }
    }
}
