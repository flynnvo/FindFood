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

    public static final String EXTRA_RESTAURANT_NAME = Decrypt.decrypt("MDBjdHZnbnJoYXZxdWpjbW14bWdvZWx2ZXNsaHhuZmR6YWJ6c3FtYm1tbHJ2cm1oenJpcHRpYXo=");

    public static final String EXTRA_RESTAURANT_ID = Decrypt.decrypt("OTV4d25yaGF2cXVqY21teG1nb2VsdmVzbGh4bmZkemFienNxbWJtbWxydnJtaHpyaXB0aWF6");

    public static final String EXTRA_RESTAURANT_ADDRESS = Decrypt.decrypt("MTNrbm5ib2NjZWRydXB6aGZzbmd4ZXFoZnFyY2RzYXRkdmxraGFzZXZ2cXBxd3Rkenpkb3V6c3pkeHc=");

    public static final String EXTRA_RESTAURANT_PHOTO_URL = Decrypt.decrypt("MTdWTlVaVTtYUnNmamx4ZWFtdWd0cXZ5dnBlanlieHNocGl5eXpnbXFsaHB5enNuZW10b3l2bHRhY3Fp");

    private static final int LOCATION_PERMISSION_REQUEST = 22;

    private RestaurantListAdapter restaurantListAdapter;

    private RestaurantListViewModel viewModel;

    private RecyclerView restaurantListView;

    private TextView emptyView;

    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String switchOnThis = "၀๐໐๐๐০੦〇ዐ০੦օ౦ዐℴ〇ⲟ౦ዐ੦૦໐ｏዐ〇੦೦๐໐ჿ০ｏ০೦௦໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 565, 348, 82, 82, 313, 166, 467, 278, 593, 180, 75, 299, 432, 299, 677, 572, 180, 628, 593, 663, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "੦օооօℴⲟ౦ዐჿо௦оዐℴℴჿ౦ዐօ০௦౦ዐ௦օ০оｏ০໐ｏ၀〇๐ⲟ":
                    if (OPAQUES[10] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
                        switchOnThis = "оჿჿ౦০೦૦ⲟዐ௦၀〇ჿዐℴ౦০૦ዐ੦௦೦๐ዐⲟჿჿ೦૦〇໐〇օ၀〇о";
                    } else {
                        restaurantListAdapter.setOnItemClickListener(this::viewRestaurantDetail);
                        switchOnThis = "ℴ೦ჿ੦၀օჿ௦ዐ௦о೦၀ዐℴ〇ჿ๐ዐ૦օ௦၀ዐ໐օ〇ჿჿ௦౦օ০੦๐ⲟ";
                    }
                    break;
                case "໐ⲟ〇૦օ၀ⲟ૦ዐ〇ℴℴ๐ዐℴ๐ⲟ௦ዐ০〇ჿоዐ೦ℴ〇ℴⲟℴ၀๐о૦၀ℴ":
                    if (OPAQUES[16] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantListView.setAdapter(restaurantListAdapter);
                        switchOnThis = "੦օооօℴⲟ౦ዐჿо௦оዐℴℴჿ౦ዐօ০௦౦ዐ௦օ০оｏ০໐ｏ၀〇๐ⲟ";
                    } else {
                        swipeRefreshLayout = findViewById(R.id.main_swipe_refresh);
                        switchOnThis = "оｏ๐〇օ੦೦ჿዐℴ૦ｏ૦ዐℴჿ໐૦ዐօ๐౦๐ዐ၀০ℴօ૦о௦౦೦ⲟⲟℴ";
                    }
                    break;
                case "о๐၀〇ჿ౦၀௦ዐ๐੦ჿ૦ዐℴℴ၀ⲟዐ૦౦๐૦ዐ၀ℴоօ૦օօｏ௦ℴｏ௦":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        viewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);
                        switchOnThis = "օⲟ௦ჿօჿ೦օዐჿ੦๐૦ዐℴ૦০〇ዐ૦໐੦ℴዐ〇੦ⲟ໐ℴ〇௦೦໐о੦೦";
                    } else {
                        swipeRefreshLayout.setOnRefreshListener(this::loadRestaurantsWithCheck);
                        switchOnThis = "၀〇੦০〇੦ｏ๐ዐ〇ｏ๐০ዐℴ၀օℴዐօооჿዐ೦ჿ௦օ೦၀о౦໐၀૦౦";
                    }
                    break;
                case "૦০ჿ೦о௦೦๐ዐℴօоｏዐℴ೦૦૦ዐ০૦о০ዐ೦ჿоℴ໐੦ℴ၀௦੦ℴｏ":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        restaurantListView = findViewById(R.id.main_restaurant_list);
                        switchOnThis = "ჿ૦੦੦ｏ௦໐๐ዐⲟ೦໐੦ዐℴ௦ჿ૦ዐօ੦ჿ௦ዐ၀〇ⲟօ௦ⲟⲟо೦௦๐૦";
                    } else {
                        setContentView(R.layout.activity_restaurant_list);
                        switchOnThis = "ⲟ၀〇ℴ໐ℴ೦оዐჿℴоօዐℴⲟ၀ჿዐ০໐о౦ዐ௦ｏⲟ೦੦೦০ⲟℴ੦౦၀";
                    }
                    break;
                case "ჿｏ০໐౦০౦ჿዐ০〇௦օዐℴ૦ℴ๐ዐ੦ჿо໐ዐ၀೦໐օо೦ⲟ০๐օ〇ჿ":
                    checkGooglePlayServices();
                    switchOnThis = "௦๐௦๐๐ℴօℴዐ০օℴ೦ዐℴ၀௦০ዐ০೦օ೦ዐℴ၀ჿⲟ੦೦ⲟ〇০೦౦ⲟ";
                    break;
                case "၀๐໐๐๐০੦〇ዐ০੦օ౦ዐℴ〇ⲟ౦ዐ੦૦໐ｏዐ〇੦೦๐໐ჿ০ｏ০೦௦໐":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        setContentView(R.layout.activity_restaurant_list);
                        switchOnThis = "〇ⲟ০౦օ၀੦໐ዐ๐၀ⲟｏዐℴჿ௦ჿዐ০ჿ೦௦ዐ੦౦೦ｏℴჿ౦໐೦ℴ໐௦";
                    } else {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "〇ⲟ௦๐౦০၀๐ዐ০ｏℴ၀ዐℴ૦૦ｏዐօ੦၀ℴዐ౦০౦ｏ૦๐〇૦౦௦〇໐";
                    }
                    break;
                case "օ๐੦ჿ๐ⲟ೦੦ዐ໐〇ⲟօዐℴօ௦ℴዐ০ｏ০೦ዐ౦օⲟⲟჿ௦օｏⲟ๐౦ｏ":
                    restaurantListView.setAdapter(restaurantListAdapter);
                    switchOnThis = "০〇੦ჿ๐૦๐ｏዐօ๐ооዐℴჿ௦оዐ੦ℴ〇੦ዐ౦օ૦೦၀ℴⲟ௦໐၀੦೦";
                    break;
                case "оჿჿ౦০೦૦ⲟዐ௦၀〇ჿዐℴ౦০૦ዐ੦௦೦๐ዐⲟჿჿ೦૦〇໐〇օ၀〇о":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
                        switchOnThis = "ℴ〇ჿ໐ℴ౦ⲟℴዐ၀ⲟｏ๐ዐℴ૦၀૦ዐ੦ℴ০૦ዐჿօ໐ℴо〇౦о၀௦௦၀";
                    } else {
                        viewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);
                        switchOnThis = "о๐၀〇ჿ౦၀௦ዐ๐੦ჿ૦ዐℴℴ၀ⲟዐ૦౦๐૦ዐ၀ℴоօ૦օօｏ௦ℴｏ௦";
                    }
                    break;
                case "ⲟ໐೦๐ℴ໐๐๐ዐ౦ｏ๐๐ዐℴｏⲟⲟዐօ๐օⲟዐօ၀੦ℴ၀〇๐о〇໐๐૦":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        restaurantListView.setLayoutManager(new FixedSizeLayoutManager(this));
                        switchOnThis = "૦೦၀ჿⲟ〇ｏℴዐօ০໐௦ዐℴоо๐ዐ੦ℴ๐ჿዐ੦๐౦ｏⲟ〇ｏ໐੦ｏ૦ℴ";
                    } else {
                        restaurantListAdapter = new RestaurantListAdapter(this);
                        switchOnThis = "ｏ০၀೦௦ℴ০໐ዐ௦ｏ၀օዐℴჿ๐౦ዐ০໐〇໐ዐ૦ℴоℴჿо০о౦௦౦ｏ";
                    }
                    break;
                case "ჿჿ๐ℴჿ૦ℴⲟዐℴօｏ౦ዐℴ૦೦๐ዐօо૦օዐ௦ჿ০〇ℴоⲟℴ๐੦ჿо":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        restaurantListAdapter.setOnItemClickListener(this::viewRestaurantDetail);
                        switchOnThis = "၀〇๐౦໐ℴ০๐ዐ౦໐〇௦ዐℴ০ჿ໐ዐ૦ჿ০໐ዐ೦๐ℴｏ၀ⲟ೦о੦ⲟ၀〇";
                    } else {
                        checkGooglePlayServices();
                        switchOnThis = "૦০ჿ೦о௦೦๐ዐℴօоｏዐℴ೦૦૦ዐ০૦о০ዐ೦ჿоℴ໐੦ℴ၀௦੦ℴｏ";
                    }
                    break;
                case "၀〇੦০〇੦ｏ๐ዐ〇ｏ๐০ዐℴ၀օℴዐօооჿዐ೦ჿ௦օ೦၀о౦໐၀૦౦":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        restaurantListView = findViewById(R.id.main_restaurant_list);
                        switchOnThis = "૦၀໐௦օⲟ௦૦ዐℴ౦೦ჿዐℴ੦০၀ዐ੦๐௦೦ዐ〇౦ⲟ๐๐૦০оо໐০ℴ";
                    } else {
                        loadRestaurantsWithCheck();
                        switchOnThis = "๐૦૦੦ⲟօ౦ⲟዐ๐ⲟჿჿዐℴⲟ੦ｏዐ૦૦௦〇ዐ〇௦੦оօօ๐〇ℴⲟⲟо";
                    }
                    break;
                case "၀೦ჿ၀௦੦০ⲟዐօ௦౦ⲟዐℴ০೦௦ዐ૦оჿ၀ዐ௦೦๐၀ℴ੦๐օо၀໐ℴ":
                    restaurantListView.setAdapter(restaurantListAdapter);
                    switchOnThis = "օօ໐౦ｏ০๐ℴዐ௦၀ℴ০ዐℴ၀౦๐ዐօ೦օℴዐ૦૦ⲟⲟ၀೦〇௦ჿ০೦ｏ";
                    break;
                case "ჿ೦೦ჿჿ๐੦౦ዐ〇օჿჿዐℴ๐ⲟ〇ዐ੦੦ｏ〇ዐ౦օо౦о௦๐໐௦೦〇ｏ":
                    super.onCreate(savedInstanceState);
                    switchOnThis = "၀๐〇೦௦၀ｏоዐℴ௦ჿｏዐℴℴｏоዐ੦ⲟ၀оዐ၀〇ⲟｏо၀о૦૦օ೦၀";
                    break;
                case "ｏ০၀೦௦ℴ০໐ዐ௦ｏ၀օዐℴჿ๐౦ዐ০໐〇໐ዐ૦ℴоℴჿо০о౦௦౦ｏ":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "〇ℴ০০೦ⲟ๐๐ዐℴჿ〇০ዐℴօ๐੦ዐ০օ੦ⲟዐ૦ℴℴօ〇௦ჿℴჿℴ౦ⲟ";
                    } else {
                        restaurantListAdapter.setOnItemClickListener(this::viewRestaurantDetail);
                        switchOnThis = "໐ⲟ〇૦օ၀ⲟ૦ዐ〇ℴℴ๐ዐℴ๐ⲟ௦ዐ০〇ჿоዐ೦ℴ〇ℴⲟℴ၀๐о૦၀ℴ";
                    }
                    break;
                case "ჿօ〇০๐〇௦၀ዐо໐০૦ዐℴჿ၀๐ዐ૦ｏℴ௦ዐоჿ௦૦০੦ჿ၀ჿ〇০૦":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        swipeRefreshLayout.setOnRefreshListener(this::loadRestaurantsWithCheck);
                        switchOnThis = "〇ｏ௦௦੦ℴ၀ჿዐ೦၀ℴｏዐℴ૦౦౦ዐ੦ℴ௦၀ዐ೦〇௦ⲟｏ೦ｏ๐၀๐੦၀";
                    } else {
                        swipeRefreshLayout = findViewById(R.id.main_swipe_refresh);
                        switchOnThis = "ℴ০০ჿჿօ೦೦ዐ໐૦੦օዐℴⲟ೦ⲟዐ০๐ჿ੦ዐ〇ⲟ౦໐о௦໐〇๐о〇೦";
                    }
                    break;
                case "ჿ௦๐௦օ〇ⲟ০ዐօ০๐ｏዐℴ૦ℴ૦ዐ০о๐оዐ೦০๐ℴⲟ〇ჿօ๐໐๐ⲟ":
                    super.onCreate(savedInstanceState);
                    switchOnThis = "〇ℴ๐໐ℴｏჿ౦ዐ၀ｏ੦໐ዐℴჿ໐໐ዐ૦௦౦೦ዐ໐〇၀೦௦໐૦௦௦೦օჿ";
                    break;
                case "〇ⲟ௦๐౦০၀๐ዐ০ｏℴ၀ዐℴ૦૦ｏዐօ੦၀ℴዐ౦০౦ｏ૦๐〇૦౦௦〇໐":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        setContentView(R.layout.activity_restaurant_list);
                        switchOnThis = "ჿჿ๐ℴჿ૦ℴⲟዐℴօｏ౦ዐℴ૦೦๐ዐօо૦օዐ௦ჿ০〇ℴоⲟℴ๐੦ჿо";
                    } else {
                        setContentView(R.layout.activity_restaurant_list);
                        switchOnThis = "੦օ੦၀੦о〇๐ዐ౦၀ℴ௦ዐℴ૦૦ⲟዐ০о೦০ዐ〇၀၀௦၀ⲟ౦ℴ၀ჿ໐ⲟ";
                    }
                    break;
                case "ჿ૦੦੦ｏ௦໐๐ዐⲟ೦໐੦ዐℴ௦ჿ૦ዐօ੦ჿ௦ዐ၀〇ⲟօ௦ⲟⲟо೦௦๐૦":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        emptyView = findViewById(R.id.main_empty_view);
                        switchOnThis = "ჿօ〇০๐〇௦၀ዐо໐০૦ዐℴჿ၀๐ዐ૦ｏℴ௦ዐоჿ௦૦০੦ჿ၀ჿ〇০૦";
                    } else {
                        restaurantListView = findViewById(R.id.main_restaurant_list);
                        switchOnThis = "੦౦о੦〇օ౦੦ዐჿ০օоዐℴ੦௦ⲟዐօ၀၀০ዐ੦೦૦〇౦ℴｏ೦ჿℴ੦၀";
                    }
                    break;
                case "ℴ০০ჿჿօ೦೦ዐ໐૦੦օዐℴⲟ೦ⲟዐ০๐ჿ੦ዐ〇ⲟ౦໐о௦໐〇๐о〇೦":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantListView.setHasFixedSize(true);
                        switchOnThis = "ⲟ໐೦๐ℴ໐๐๐ዐ౦ｏ๐๐ዐℴｏⲟⲟዐօ๐օⲟዐօ၀੦ℴ၀〇๐о〇໐๐૦";
                    } else {
                        restaurantListView.setAdapter(restaurantListAdapter);
                        switchOnThis = "௦ⲟ໐๐໐๐օ০ዐօ૦ⲟ౦ዐℴ໐〇〇ዐօ০௦〇ዐ೦੦〇໐օ౦ჿ〇оօⲟ๐";
                    }
                    break;
                case "೦ⲟ૦೦੦ｏօჿዐჿｏｏｏዐℴⲟ၀၀ዐ০໐০౦ዐ੦ℴｏ౦ჿｏо๐օ〇ⲟ౦":
                    super.onCreate(savedInstanceState);
                    switchOnThis = "໐௦௦օ௦૦၀օዐⲟо೦〇ዐℴ၀ჿ০ዐօｏ၀၀ዐⲟ೦๐໐০ℴჿ૦໐〇໐೦";
                    break;
                case "௦〇ⲟ௦੦〇ⲟℴዐ໐ჿ๐ｏዐℴⲟ၀০ዐ০ℴ၀০ዐ໐оჿ໐௦๐௦೦౦օ૦੦":
                    restaurantListView.setHasFixedSize(true);
                    switchOnThis = "೦໐ⲟ౦օ๐ⲟ໐ዐℴ૦೦ℴዐℴ௦০౦ዐ૦௦૦օዐ০〇〇〇о౦೦о௦〇ჿ૦";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void viewRestaurantDetail(Restaurant restaurant) {
        Intent intent = null;
        String switchOnThis = "૦੦〇๐౦оჿоዐℴооℴዐℴ๐೦௦ዐ૦௦ｏℴዐⲟ೦೦໐〇ｏ౦оｏｏ০໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 453, 453, 299, 124, 68, 250, 544, 208, 390, 642, 285, 292, 89, 621, 229, 243, 138, 341, 565, 586, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "о೦ჿ০૦ℴ๐ⲟዐ૦౦ｏ〇ዐℴ০օ೦ዐ૦օ૦ℴዐ০౦౦ℴ૦ⲟ౦૦೦ჿ၀০":
                    startActivity(intent);
                    switchOnThis = "ჿ〇௦о໐๐၀௦ዐ০ⲟ౦౦ዐℴ੦ⲟ၀ዐ০оо౦ዐｏ๐௦о૦૦০૦໐๐ⲟ౦";
                    break;
                case "০၀〇೦০೦〇০ዐօ੦০੦ዐℴо၀ჿዐօ௦௦〇ዐ౦௦ჿℴо౦օ૦૦၀๐ｏ":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        intent.putExtra(EXTRA_RESTAURANT_PHOTO_URL, restaurant.getImageUrl(1440, 1440));
                        switchOnThis = "๐ℴ૦౦০о૦оዐ໐օℴ၀ዐℴ〇၀౦ዐ૦೦ჿｏዐ๐о໐໐ｏⲟ০о໐ჿ๐૦";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
                        switchOnThis = "੦૦〇〇০օℴ၀ዐ੦ℴⲟ๐ዐℴ๐ჿ૦ዐօℴ೦ⲟዐｏօⲟ〇০૦о౦〇໐ｏ০";
                    }
                    break;
                case "၀໐ｏо௦௦ｏ૦ዐჿჿ๐০ዐℴｏｏ௦ዐ੦ℴ๐〇ዐ๐௦〇၀೦໐ⲟｏⲟ௦௦օ":
                    intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
                    switchOnThis = "〇ｏ০о০օ૦оዐօｏ໐૦ዐℴ౦೦ｏዐ੦০ჿ੦ዐ੦ℴ〇օჿо౦〇ｏ౦௦૦";
                    break;
                case "૦੦〇๐౦оჿоዐℴооℴዐℴ๐೦௦ዐ૦௦ｏℴዐⲟ೦೦໐〇ｏ౦оｏｏ০໐":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        intent = new Intent(this, RestaurantDetailActivity.class);
                        switchOnThis = "๐೦೦〇ჿჿℴｏዐჿჿ૦๐ዐℴօ૦૦ዐօ໐௦೦ዐ੦౦ⲟჿℴｏｏｏо০၀௦";
                    } else {
                        intent = new Intent(this, RestaurantDetailActivity.class);
                        switchOnThis = "૦ℴჿ၀၀০ｏ๐ዐ၀੦೦೦ዐℴℴ〇ⲟዐ০০೦੦ዐоօ೦০ჿ၀ℴ〇౦০ჿօ";
                    }
                    break;
                case "ｏ௦ჿ౦ⲟｏ౦௦ዐჿ〇೦၀ዐℴჿօⲟዐ૦ℴ೦๐ዐჿ੦о૦ჿ໐ℴⲟ௦໐〇օ":
                    startActivity(intent);
                    switchOnThis = "〇ჿօℴ၀੦০੦ዐ೦ℴ๐໐ዐℴоℴоዐ০〇օоዐ໐੦օ૦օ೦ⲟ〇ｏ໐ჿ૦";
                    break;
                case "၀০੦ℴჿ௦೦ℴዐ၀ｏ๐௦ዐℴ௦૦௦ዐ০၀〇௦ዐ০௦ⲟ౦ⲟ೦໐౦๐〇০ℴ":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        intent.putExtra(EXTRA_RESTAURANT_NAME, restaurant.getName());
                        switchOnThis = "ⲟ௦੦౦๐ჿ౦੦ዐ௦ｏｏ০ዐℴо〇໐ዐօ๐০օዐ〇੦ℴ๐ℴｏჿ૦০௦૦ⲟ";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_ID, restaurant.getPlaceId());
                        switchOnThis = "о๐〇૦օ౦๐੦ዐｏⲟ૦оዐℴоｏ೦ዐ০ჿ೦օዐℴօо૦੦౦೦೦၀੦೦〇";
                    }
                    break;
                case "૦ℴჿ၀၀০ｏ๐ዐ၀੦೦೦ዐℴℴ〇ⲟዐ০০೦੦ዐоօ೦০ჿ၀ℴ〇౦০ჿօ":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        intent.putExtra(EXTRA_RESTAURANT_NAME, restaurant.getName());
                        switchOnThis = "໐〇ⲟℴℴℴօ੦ዐ০௦օ౦ዐℴⲟⲟ০ዐ੦၀໐౦ዐ౦౦౦ⲟ೦০૦ℴℴоℴ๐";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_NAME, restaurant.getName());
                        switchOnThis = "၀০੦ℴჿ௦೦ℴዐ၀ｏ๐௦ዐℴ௦૦௦ዐ০၀〇௦ዐ০௦ⲟ౦ⲟ೦໐౦๐〇০ℴ";
                    }
                    break;
                case "๐ℴ૦౦০о૦оዐ໐օℴ၀ዐℴ〇၀౦ዐ૦೦ჿｏዐ๐о໐໐ｏⲟ০о໐ჿ๐૦":
                    if (OPAQUES[9] % OPAQUES[22] != OPAQUES[20]) {
                        startActivity(intent);
                        switchOnThis = "๐ჿⲟ〇ჿჿ๐ｏዐ০ჿօℴዐℴ௦ⲟ๐ዐ૦ჿо௦ዐ໐೦օ௦о੦೦೦೦੦೦০";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_NAME, restaurant.getName());
                        switchOnThis = "೦௦ⲟ๐օⲟ௦ⲟዐ౦〇૦౦ዐℴ೦оｏዐ૦೦೦૦ዐℴ০〇ჿ〇੦૦໐౦໐ｏ၀";
                    }
                    break;
                case "о๐〇૦օ౦๐੦ዐｏⲟ૦оዐℴоｏ೦ዐ০ჿ೦օዐℴօо૦੦౦೦೦၀੦೦〇":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        intent.putExtra(EXTRA_RESTAURANT_NAME, restaurant.getName());
                        switchOnThis = "౦০ℴ〇о๐০૦ዐ௦ｏ০೦ዐℴ௦໐ℴዐօ૦໐օዐ๐၀໐೦੦〇ｏ௦໐ჿ௦ჿ";
                    } else {
                        intent.putExtra(EXTRA_RESTAURANT_ADDRESS, restaurant.getAddress());
                        switchOnThis = "০၀〇೦০೦〇০ዐօ੦০੦ዐℴо၀ჿዐօ௦௦〇ዐ౦௦ჿℴо౦օ૦૦၀๐ｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void loadRestaurantsWithCheck() {
        String switchOnThis = "૦ⲟ၀໐੦੦๐౦ዐ၀၀੦〇ዐℴ၀ｏ੦ዐ੦౦૦໐ዐ௦๐о૦௦੦๐౦೦౦ⲟ໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 215, 117, 390, 166, 96, 222, 306, 397, 628, 229, 264, 348, 173, 516, 306, 257, 551, 593, 467, 481, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "૦ⲟ၀໐੦੦๐౦ዐ၀၀੦〇ዐℴ၀ｏ੦ዐ੦౦૦໐ዐ௦๐о૦௦੦๐౦೦౦ⲟ໐":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                            showPermissionExplanationDialog();
                        } else {
                            loadRestaurants();
                        }
                        switchOnThis = "ჿօ೦੦ⲟ௦ჿ૦ዐჿ೦੦೦ዐℴ౦೦੦ዐ੦ℴｏჿዐⲟ੦௦೦օ೦оⲟ௦໐໐ℴ";
                    } else {
                        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                            showPermissionExplanationDialog();
                        } else {
                            loadRestaurants();
                        }
                        switchOnThis = "੦০໐ℴჿ೦〇໐ዐ໐๐ⲟ〇ዐℴօ௦໐ዐ੦௦౦〇ዐｏо੦০౦〇ｏ၀๐๐о〇";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void showPermissionExplanationDialog() {
        String switchOnThis = "໐੦ｏⲟօⲟｏ〇ዐ〇੦೦ｏዐℴ૦౦ⲟዐ੦ｏօჿዐ੦〇ｏ๐௦௦ℴ໐ｏ໐၀ℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 453, 516, 250, 201, 628, 341, 61, 68, 670, 292, 243, 621, 537, 250, 614, 383, 404, 642, 621, 187, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐੦ｏⲟօⲟｏ〇ዐ〇੦೦ｏዐℴ૦౦ⲟዐ੦ｏօჿዐ੦〇ｏ๐௦௦ℴ໐ｏ໐၀ℴ":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        new AlertDialog.Builder(this).setMessage(R.string.permission_explanation).setPositiveButton(R.string.ok, ((dialog, i) -> ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.ACCESS_FINE_LOCATION }, LOCATION_PERMISSION_REQUEST))).setNegativeButton(R.string.cancel, (dialog, i) -> setAdapterData(null)).show();
                        switchOnThis = "௦о౦оℴ০〇౦ዐ๐օ౦օዐℴⲟ೦໐ዐ૦ⲟ૦໐ዐ〇౦ℴ๐೦౦ჿоℴ௦০〇";
                    } else {
                        new AlertDialog.Builder(this).setMessage(R.string.permission_explanation).setPositiveButton(R.string.ok, ((dialog, i) -> ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.ACCESS_FINE_LOCATION }, LOCATION_PERMISSION_REQUEST))).setNegativeButton(R.string.cancel, (dialog, i) -> setAdapterData(null)).show();
                        switchOnThis = "০օⲟｏ໐ｏℴ೦ዐօ၀оｏዐℴ๐௦௦ዐ੦੦০օዐ〇〇௦ｏ〇০੦ⲟჿ০੦օ";
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
        String switchOnThis = "૦ჿ๐ჿ੦ℴо௦ዐ๐೦օℴዐℴⲟⲟჿዐ૦ℴ〇၀ዐ૦օ໐૦๐๐ⲟｏ၀ჿ๐૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 173, 250, 313, 621, 236, 600, 250, 621, 565, 530, 159, 495, 264, 425, 516, 593, 656, 530, 495, 663, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "૦ⲟ၀ჿ〇౦໐ｏዐ௦੦ℴჿዐℴ໐౦໐ዐ০ｏ౦০ዐօ๐ℴо໐໐౦ჿ౦〇ℴ௦":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
                        switchOnThis = "ℴ૦ｏ౦๐໐о೦ዐ૦໐໐೦ዐℴ〇ჿｏዐ০੦໐೦ዐ๐оօ〇ｏⲟ೦օ૦၀໐๐";
                    } else {
                        errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
                        switchOnThis = "ჿ౦օ໐ｏｏ౦〇ዐⲟ௦౦оዐℴ〇๐௦ዐ੦௦၀ｏዐ೦೦օ໐оｏ౦๐ⲟօ၀௦";
                    }
                    break;
                case "૦ჿ๐ჿ੦ℴо௦ዐ๐೦օℴዐℴⲟⲟჿዐ૦ℴ〇၀ዐ૦օ໐૦๐๐ⲟｏ၀ჿ๐૦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        status = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
                        switchOnThis = "૦ⲟ၀ჿ〇౦໐ｏዐ௦੦ℴჿዐℴ໐౦໐ዐ০ｏ౦০ዐօ๐ℴо໐໐౦ჿ౦〇ℴ௦";
                    } else {
                        errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
                        switchOnThis = "〇օｏ೦੦೦〇օዐｏ೦໐૦ዐℴօ০оዐ૦о๐০ዐ০ჿ০ჿ੦೦๐ℴ૦௦೦ჿ";
                    }
                    break;
                case "ｏ〇ⲟ〇օℴⲟ໐ዐ೦౦〇০ዐℴ০оｏዐ০๐૦օዐⲟ၀၀оჿօ০ｏ೦০оℴ":
                    errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(this, status, 0);
                    switchOnThis = "౦০੦ჿｏ〇໐օዐ೦๐օℴዐℴօо੦ዐ০೦੦ℴዐჿ੦ℴ၀ⲟ౦੦ჿჿ၀〇၀";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @SuppressLint("CheckResult")
    private void loadRestaurants() {
        String switchOnThis = "০໐ჿ౦૦ჿ௦੦ዐⲟℴⲟ໐ዐℴ૦௦ჿዐ੦၀௦ⲟዐⲟ೦੦௦о〇ｏჿ௦〇օо";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 117, 159, 271, 656, 544, 544, 481, 194, 180, 600, 439, 138, 628, 439, 166, 166, 348, 278, 369, 89, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০໐ჿ౦૦ჿ௦੦ዐⲟℴⲟ໐ዐℴ૦௦ჿዐ੦၀௦ⲟዐⲟ೦੦௦о〇ｏჿ௦〇օо":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        viewModel.getRestaurants().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> this.setAdapterData(null));
                        switchOnThis = "૦ℴ၀၀ｏｏ੦օዐ௦೦௦໐ዐℴо၀૦ዐօ೦ⲟ〇ዐ౦〇௦ჿ੦౦ℴ੦๐೦๐օ";
                    } else {
                        viewModel.getRestaurants().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> this.setAdapterData(null));
                        switchOnThis = "೦๐ⲟ໐๐౦ｏ૦ዐ੦ჿо౦ዐℴⲟ೦ⲟዐ૦੦၀ℴዐ౦ｏ၀੦૦ｏｏ໐օჿօⲟ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        String switchOnThis = "ｏℴ೦০၀ℴ၀೦ዐ૦౦၀ⲟዐℴ০૦ჿዐ੦೦ჿ੦ዐ০੦০ⲟ๐౦〇օ၀౦ჿｏ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 579, 208, 355, 40, 593, 663, 523, 243, 642, 250, 243, 327, 222, 173, 383, 82, 376, 75, 488, 572, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ｏℴ೦০၀ℴ၀೦ዐ૦౦၀ⲟዐℴ০૦ჿዐ੦೦ჿ੦ዐ০੦০ⲟ๐౦〇օ၀౦ჿｏ":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        if (requestCode == LOCATION_PERMISSION_REQUEST && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            loadRestaurants();
                        }
                        switchOnThis = "၀๐੦〇௦ℴℴ௦ዐ૦๐૦оዐℴჿ๐၀ዐօ௦੦оዐо၀੦૦ⲟօⲟоჿ૦ｏօ";
                    } else {
                        if (requestCode == LOCATION_PERMISSION_REQUEST && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            loadRestaurants();
                        }
                        switchOnThis = "၀օ௦౦૦౦օⲟዐ૦೦օ೦ዐℴооჿዐ੦оօ౦ዐօｏｏ〇๐๐оօ০௦௦๐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void setAdapterData(List<Restaurant> restaurantList) {
        String switchOnThis = "੦ℴ௦ｏ௦၀૦оዐ೦๐০໐ዐℴ০০օዐ૦〇၀๐ዐｏо〇໐〇ⲟ೦օℴ૦੦೦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 523, 180, 47, 558, 292, 47, 61, 236, 628, 292, 82, 110, 117, 537, 117, 243, 558, 663, 341, 145, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦ჿ၀০ℴ੦о০ዐо໐၀౦ዐℴℴ૦੦ዐօ๐੦੦ዐℴ๐௦೦૦ｏ၀օ၀০ჿ౦":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        if (restaurantList == null || restaurantList.isEmpty()) {
                            restaurantListView.setVisibility(View.GONE);
                            emptyView.setVisibility(View.VISIBLE);
                        } else {
                            restaurantListView.setVisibility(View.VISIBLE);
                            emptyView.setVisibility(View.GONE);
                            restaurantListAdapter.setDistanceLocation(viewModel.getCurrentLocation());
                            restaurantListAdapter.setItems(restaurantList);
                        }
                        switchOnThis = "૦ⲟ๐ჿ০๐௦ℴዐ೦〇০০ዐℴｏо೦ዐ০০оｏዐ௦૦௦ⲟⲟⲟｏօ૦ℴ௦૦";
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
                        switchOnThis = "౦၀о૦૦০౦〇ዐ૦০օ〇ዐℴ೦๐оዐ૦ℴ೦〇ዐ০੦໐௦о໐ｏօჿ௦౦ℴ";
                    }
                    break;
                case "ｏ০〇〇০૦ჿ౦ዐⲟо౦〇ዐℴ໐੦੦ዐ૦௦০ｏዐℴ૦ჿ০օ௦೦೦ℴℴｏｏ":
                    swipeRefreshLayout.setRefreshing(false);
                    switchOnThis = "ℴ౦௦૦о೦೦௦ዐჿ၀໐๐ዐℴ೦૦౦ዐ૦০о〇ዐ௦੦օℴℴℴօｏ೦౦о๐";
                    break;
                case "੦ℴ௦ｏ௦၀૦оዐ೦๐০໐ዐℴ০০օዐ૦〇၀๐ዐｏо〇໐〇ⲟ೦օℴ૦੦೦":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
                        swipeRefreshLayout.setRefreshing(false);
                        switchOnThis = "೦ჿ၀০ℴ੦о০ዐо໐၀౦ዐℴℴ૦੦ዐօ๐੦੦ዐℴ๐௦೦૦ｏ၀օ၀০ჿ౦";
                    } else {
                        swipeRefreshLayout.setRefreshing(false);
                        switchOnThis = "໐օ੦೦௦੦ｏ๐ዐ၀ⲟ౦〇ዐℴ၀၀ℴዐ০〇໐օዐⲟ၀ооℴ〇໐ⲟ૦ⲟⲟօ";
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
            String switchOnThis = "೦օ੦೦໐ⲟ๐оዐｏо၀೦ዐℴо૦໐ዐօ૦ⲟоዐℴ০௦ｏ〇๐ℴ૦၀օ๐౦";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 278, 124, 194, 215, 544, 467, 516, 446, 341, 299, 418, 404, 614, 194, 299, 89, 558, 229, 495, 509, 7, 5, 7, 5 };
            while (infiniteLoop) {
                switch(switchOnThis) {
                    case "೦օ੦೦໐ⲟ๐оዐｏо၀೦ዐℴо૦໐ዐօ૦ⲟоዐℴ০௦ｏ〇๐ℴ૦၀օ๐౦":
                        if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                            return false;
                            switchOnThis = "૦ⲟ〇೦੦૦ჿჿዐ၀௦০၀ዐℴ૦๐౦ዐ০๐ｏ၀ዐ૦ჿօ〇০ⲟо০၀ℴჿ〇";
                        } else {
                            return false;
                            switchOnThis = "ჿ໐೦๐௦૦೦оዐ੦օ๐օዐℴℴ೦ℴዐ੦০〇၀ዐ௦೦໐௦ｏⲟ০๐๐০౦๐";
                        }
                    default:
                        infiniteLoop = false;
                }
            }
            return false;
        }
    }
}
