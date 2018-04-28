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
import nz.co.g1.a702.findfood.Decrypt;
import nz.co.g1.a702.findfood.R;
import nz.co.g1.a702.findfood.database.RestaurantNote;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ADDRESS;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_ID;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_NAME;
import static nz.co.g1.a702.findfood.RestaurantListActivity.EXTRA_RESTAURANT_PHOTO_URL;

public class RestaurantDetailActivity extends AppCompatActivity {

    private RestaurantDetailViewModel viewModel;

    private ImageView appBarBackground;

    private View appBarScrim;

    private TextView noNotesView;

    private RecyclerView notesListView;

    private RestaurantNotesListAdapter listAdapter;

    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String restaurantName = null;
        String placeId = null;
        String restaurantAddress = null;
        String photoUrl = null;
        Toolbar toolbar = null;
        TextView addressView = null;
        String switchOnThis = "ჿ၀૦০о౦໐๐ዐօ๐〇๐ዐℴ໐૦೦ዐ૦೦ℴℴዐ೦੦оо๐оⲟ૦০੦ჿ௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 103, 89, 12, 334, 320, 502, 390, 565, 187, 390, 243, 621, 82, 306, 516, 110, 509, 166, 418, 257, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿ௦໐௦ℴ૦〇౦ዐ໐օⲟօዐℴჿⲟⲟዐօℴ໐օዐ〇ℴｏ၀০໐ⲟｏ໐〇০ⲟ":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        this.notesListView = findViewById(R.id.detail_notes_list);
                        switchOnThis = "౦оℴ೦೦〇ჿ〇ዐо၀оℴዐℴℴ೦௦ዐօｏℴ౦ዐ၀ｏ௦೦ⲟ੦૦૦೦೦০૦";
                    } else {
                        listAdapter = new RestaurantNotesListAdapter();
                        switchOnThis = "໐օჿ੦௦੦௦૦ዐ૦০ⲟ௦ዐℴ〇〇೦ዐօ০ჿ೦ዐ૦০ⲟ૦౦໐ჿ〇০၀໐〇";
                    }
                    break;
                case "໐ｏ၀о๐௦੦੦ዐ০ｏ೦оዐℴ๐၀ｏዐ੦੦০ℴዐ੦ⲟ၀ჿ๐๐ჿ૦೦၀ჿ〇":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        addressView = findViewById(R.id.detail_restaurant_address);
                        switchOnThis = "ⲟ೦૦๐о௦໐੦ዐℴ౦ｏ௦ዐℴ౦ｏⲟዐ੦೦ჿ௦ዐ੦໐੦૦၀๐၀ჿ௦〇օ૦";
                    } else {
                        loadAppbarImage(photoUrl);
                        switchOnThis = "ⲟ໐૦໐૦০೦၀ዐ০ｏ๐૦ዐℴ೦૦ℴዐ০〇〇௦ዐ໐੦ჿ໐੦૦ｏ౦໐૦оℴ";
                    }
                    break;
                case "০౦ჿօ౦〇೦ℴዐ೦০೦ჿዐℴ೦ｏⲟዐօ〇೦໐ዐ੦〇о໐໐၀೦౦ჿ౦੦о":
                    restaurantName = getIntent().getStringExtra(EXTRA_RESTAURANT_NAME);
                    switchOnThis = "௦੦੦௦ჿօ၀౦ዐ๐ℴ೦ℴዐℴ໐੦ჿዐ૦ℴ੦૦ዐ௦〇௦〇ｏ〇໐ｏ੦౦໐௦";
                    break;
                case "၀੦౦օჿо〇〇ዐ০ჿ໐๐ዐℴ੦〇๐ዐ੦ℴ๐೦ዐ〇௦๐ℴ〇໐о໐๐౦໐೦":
                    viewModel.setPlaceId(placeId);
                    switchOnThis = "օ૦ｏ૦օ০၀૦ዐо૦೦ｏዐℴⲟჿ๐ዐ০ｏ೦ჿዐօ໐੦๐੦௦૦օ〇〇೦౦";
                    break;
                case "௦๐௦੦૦ℴ௦〇ዐօ๐০੦ዐℴ০၀ｏዐ੦੦〇ჿዐ௦၀оⲟ০૦၀၀о၀໐၀":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        toolbar.setTitle(restaurantName);
                        switchOnThis = "оｏоօℴｏ໐оዐ૦၀౦ｏዐℴ๐ℴ၀ዐ੦օоօዐ০໐໐০၀օ〇੦ｏⲟ০૦";
                    } else {
                        setContentView(R.layout.activity_restaurant_detail);
                        switchOnThis = "০ჿℴⲟ๐၀ℴ೦ዐჿ၀о〇ዐℴⲟℴ০ዐ૦๐ⲟ〇ዐ੦೦ჿჿჿ໐〇૦೦ℴօ௦";
                    }
                    break;
                case "੦௦๐೦૦〇〇౦ዐ੦ⲟ〇〇ዐℴ૦౦၀ዐ੦໐ℴօዐօ੦੦ჿ੦౦೦໐௦о౦໐":
                    if (OPAQUES[8] % OPAQUES[20] == OPAQUES[21]) {
                        loadNotes();
                        switchOnThis = "օ၀о໐о௦ჿ౦ዐ〇૦໐੦ዐℴ౦〇оዐ০০๐〇ዐ૦о੦૦օℴℴ੦੦оⲟ૦";
                    } else {
                        toolbar = findViewById(R.id.detail_toolbar);
                        switchOnThis = "๐௦〇੦〇௦оⲟዐｏօ௦೦ዐℴ௦೦૦ዐ૦૦ℴ〇ዐｏｏ๐೦੦౦ჿ೦օ໐௦ℴ";
                    }
                    break;
                case "໐օჿ੦௦੦௦૦ዐ૦০ⲟ௦ዐℴ〇〇೦ዐօ০ჿ೦ዐ૦০ⲟ૦౦໐ჿ〇০၀໐〇":
                    if (OPAQUES[15] % OPAQUES[22] == OPAQUES[20]) {
                        addressView.setText(restaurantAddress);
                        switchOnThis = "০〇౦๐ℴ೦௦ჿዐ๐ჿ௦๐ዐℴ〇〇૦ዐ੦〇০໐ዐ౦੦০ⲟ๐ℴ૦௦о੦໐೦";
                    } else {
                        listAdapter.setOnItemClickListener(this::showNoteInputDialog);
                        switchOnThis = "๐૦ჿ௦о೦໐౦ዐօⲟ໐౦ዐℴ೦੦౦ዐ০๐೦౦ዐⲟℴ૦၀౦௦੦໐ჿ೦ｏօ";
                    }
                    break;
                case "๐о໐օ੦০૦౦ዐ〇੦ｏ౦ዐℴ૦๐໐ዐօ౦ჿჿዐｏ໐૦ჿ〇ⲟ੦౦ｏօ໐၀":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
                        toolbar.setTitle(restaurantName);
                        switchOnThis = "໐ｏ၀о๐௦੦੦ዐ০ｏ೦оዐℴ๐၀ｏዐ੦੦০ℴዐ੦ⲟ၀ჿ๐๐ჿ૦೦၀ჿ〇";
                    } else {
                        loadAppbarImage(photoUrl);
                        switchOnThis = "๐০〇೦օ௦օ০ዐ〇ℴ੦૦ዐℴօ০௦ዐօⲟℴℴዐ၀૦ჿ௦ｏ〇〇૦૦ჿｏ૦";
                    }
                    break;
                case "ჿ၀૦০о౦໐๐ዐօ๐〇๐ዐℴ໐૦೦ዐ૦೦ℴℴዐ೦੦оо๐оⲟ૦০੦ჿ௦":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "௦๐௦੦૦ℴ௦〇ዐօ๐০੦ዐℴ০၀ｏዐ੦੦〇ჿዐ௦၀оⲟ০૦၀၀о၀໐၀";
                    } else {
                        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);
                        switchOnThis = "ｏ੦ｏ೦౦೦ℴⲟዐ੦๐๐ℴዐℴ໐૦০ዐ০೦ჿ౦ዐⲟ০໐໐໐оօ၀໐ⲟｏℴ";
                    }
                    break;
                case "೦੦੦၀೦ჿօ၀ዐⲟ〇๐ჿዐℴо௦၀ዐ૦ℴℴ੦ዐｏ೦૦౦౦০೦໐౦০ℴ๐":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                        switchOnThis = "ｏⲟｏｏоօｏ০ዐ〇၀૦໐ዐℴⲟ๐օዐ০௦၀૦ዐօ๐০օ౦ⲟⲟ೦о໐ჿо";
                    } else {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "໐౦օ໐௦ℴ〇೦ዐоｏо໐ዐℴⲟ໐ჿዐօօ૦〇ዐℴ௦૦๐๐ჿｏ௦ჿ〇၀၀";
                    }
                    break;
                case "оо໐੦௦೦໐০ዐ০૦੦ℴዐℴ೦ⲟⲟዐ૦ｏ၀๐ዐ໐௦೦о〇օ๐о౦ჿ〇๐":
                    viewModel.setPlaceId(placeId);
                    switchOnThis = "оⲟ੦໐ⲟ໐౦০ዐｏ໐၀೦ዐℴ๐๐၀ዐ০ｏⲟ௦ዐ௦၀౦੦ⲟ੦ჿ૦০ⲟｏ೦";
                    break;
                case "૦ℴⲟ〇௦ⲟ੦၀ዐ๐ჿօ੦ዐℴ〇૦ⲟዐ૦ｏօℴዐ໐ⲟ೦೦〇ჿ೦௦〇๐০ℴ":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        listAdapter.setOnItemLongClickListener(this::showNoteDeleteDialog);
                        switchOnThis = "໐੦໐૦ℴℴ໐〇ዐ〇၀๐௦ዐℴℴ໐ℴዐ০ｏ೦๐ዐ౦໐၀೦౦೦օⲟ〇௦օ௦";
                    } else {
                        toolbar = findViewById(R.id.detail_toolbar);
                        switchOnThis = "๐о໐օ੦০૦౦ዐ〇੦ｏ౦ዐℴ૦๐໐ዐօ౦ჿჿዐｏ໐૦ჿ〇ⲟ੦౦ｏօ໐၀";
                    }
                    break;
                case "໐໐০ჿ໐〇੦оዐჿօ〇௦ዐℴℴ〇ℴዐ০০ｏℴዐօⲟｏ๐໐௦ℴ੦੦೦օ౦":
                    this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);
                    switchOnThis = "೦૦օⲟоℴ੦ｏዐ೦օｏоዐℴ੦〇ｏዐ੦໐೦০ዐ૦օ௦๐౦၀ჿ〇๐௦ℴ໐";
                    break;
                case "օ๐໐૦๐০੦〇ዐօ০௦੦ዐℴ၀ℴⲟዐօ૦๐ჿዐ੦໐ⲟ๐ｏჿⲟօ૦๐๐၀":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
                        switchOnThis = "ℴо၀૦੦၀০ｏዐⲟ૦๐௦ዐℴ〇ჿℴዐ૦၀ⲟ૦ዐ੦௦௦၀૦ℴ೦০ｏℴ໐๐";
                    } else {
                        setSupportActionBar(toolbar);
                        switchOnThis = "૦оⲟ၀оо೦౦ዐ০ჿჿｏዐℴ௦౦၀ዐ૦੦ｏ๐ዐ੦௦օ௦૦૦๐ⲟ〇೦໐օ";
                    }
                    break;
                case "ℴ০ｏჿ০〇੦๐ዐ௦ⲟ೦օዐℴ೦ⲟ〇ዐ੦໐੦૦ዐ੦၀૦૦о૦ჿ੦૦૦০ｏ":
                    listAdapter.setOnItemLongClickListener(this::showNoteDeleteDialog);
                    switchOnThis = "໐ℴօ੦๐໐໐〇ዐ౦〇૦၀ዐℴ၀໐〇ዐ੦೦০ⲟዐоჿ੦ⲟ౦૦օ౦௦օ௦০";
                    break;
                case "০ⲟℴ௦૦ⲟⲟ೦ዐ০օ૦оዐℴⲟ౦੦ዐ੦௦੦೦ዐჿ໐౦၀๐၀ｏｏ〇૦০૦":
                    photoUrl = getIntent().getStringExtra(EXTRA_RESTAURANT_PHOTO_URL);
                    switchOnThis = "ⲟ௦੦໐о௦ⲟ૦ዐ೦о〇оዐℴ໐о〇ዐ੦೦ｏоዐ໐০০௦๐೦ჿℴоℴ၀૦";
                    break;
                case "০ჿℴⲟ๐၀ℴ೦ዐჿ၀о〇ዐℴⲟℴ০ዐ૦๐ⲟ〇ዐ੦೦ჿჿჿ໐〇૦೦ℴօ௦":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        viewModel.setPlaceId(placeId);
                        switchOnThis = "໐ℴｏօ௦০ჿჿዐ๐௦૦੦ዐℴ೦๐೦ዐ૦〇၀ჿዐօ೦၀ℴ၀௦ℴօ໐ｏ໐໐";
                    } else {
                        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);
                        switchOnThis = "໐օჿ௦ℴ๐օℴዐоօ০๐ዐℴ၀౦౦ዐ૦〇ｏ೦ዐ೦օ〇০〇๐໐๐໐ℴо๐";
                    }
                    break;
                case "ⲟ౦о໐ჿ๐о೦ዐ০૦〇౦ዐℴ௦໐๐ዐ੦๐໐օዐ〇๐ⲟ੦ჿⲟоჿо໐ⲟ౦":
                    listAdapter.setOnItemClickListener(this::showNoteInputDialog);
                    switchOnThis = "о၀оℴ૦၀ⲟ੦ዐⲟ၀ℴ౦ዐℴ໐໐౦ዐ੦೦૦੦ዐ௦၀૦ⲟ௦੦〇о໐೦๐౦";
                    break;
                case "օℴℴ၀ｏ૦ⲟ০ዐჿ০ｏⲟዐℴօ๐ჿዐ੦〇૦၀ዐоჿⲟօ໐๐ⲟо૦ｏｏ೦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantName = getIntent().getStringExtra(EXTRA_RESTAURANT_NAME);
                        switchOnThis = "೦੦੦၀೦ჿօ၀ዐⲟ〇๐ჿዐℴо௦၀ዐ૦ℴℴ੦ዐｏ೦૦౦౦০೦໐౦০ℴ๐";
                    } else {
                        notesListView.setLayoutManager(new LinearLayoutManager(this));
                        switchOnThis = "౦௦౦໐૦০໐૦ዐ၀௦〇೦ዐℴℴ๐ｏዐ੦০೦๐ዐ၀о౦೦೦೦೦ჿо໐๐௦";
                    }
                    break;
                case "ℴо၀૦੦၀০ｏዐⲟ૦๐௦ዐℴ〇ჿℴዐ૦၀ⲟ૦ዐ੦௦௦၀૦ℴ೦০ｏℴ໐๐":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        this.noNotesView = findViewById(R.id.detail_no_notes_view);
                        switchOnThis = "ჿ၀໐੦ｏჿ੦੦ዐ〇ｏ၀〇ዐℴօჿ੦ዐ੦০ℴ၀ዐℴℴ૦೦օ௦ℴｏ๐౦၀〇";
                    } else {
                        this.notesListView = findViewById(R.id.detail_notes_list);
                        switchOnThis = "౦ჿоℴｏ০〇၀ዐ೦౦о౦ዐℴ၀ჿ໐ዐ૦೦ⲟ૦ዐ၀ℴ๐ｏо౦၀օ๐օ๐о";
                    }
                    break;
                case "ℴ๐೦௦๐௦ℴჿዐℴ૦ⲟ๐ዐℴоо૦ዐ੦০ℴоዐо૦๐ｏ௦౦ⲟ๐ｏ၀ჿ૦":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        toolbar.setTitle(restaurantName);
                        switchOnThis = "ℴ೦ჿ౦೦౦ⲟ၀ዐ໐〇ｏ੦ዐℴօⲟօዐ૦ჿ໐૦ዐ೦૦౦೦၀೦೦оｏ౦੦ℴ";
                    } else {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        switchOnThis = "оⲟⲟ௦౦ℴ௦оዐ೦০೦ｏዐℴ๐০ｏዐ૦օ໐೦ዐℴ૦௦໐০ⲟ౦〇၀օℴօ";
                    }
                    break;
                case "ⲟ௦௦੦౦〇〇оዐօ〇ჿ௦ዐℴоօჿዐօ၀ℴ໐ዐ๐౦௦๐૦૦૦о၀օჿ೦":
                    placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                    switchOnThis = "໐௦૦௦૦๐๐૦ዐ၀௦о໐ዐℴ௦০੦ዐ੦оჿ၀ዐ๐〇о〇օჿ೦ｏоｏ૦〇";
                    break;
                case "໐๐օ০੦೦〇၀ዐჿ၀ჿ০ዐℴ໐௦౦ዐօⲟօ೦ዐ၀ჿ౦੦၀౦၀〇೦੦૦౦":
                    listAdapter.setOnItemLongClickListener(this::showNoteDeleteDialog);
                    switchOnThis = "૦〇౦〇௦౦೦໐ዐօჿ໐〇ዐℴ〇௦ⲟዐ੦๐໐০ዐ〇оℴо໐౦〇ｏ೦〇ჿ૦";
                    break;
                case "ｏⲟｏｏоօｏ০ዐ〇၀૦໐ዐℴⲟ๐օዐ০௦၀૦ዐօ๐০օ౦ⲟⲟ೦о໐ჿо":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        switchOnThis = "๐ｏ౦੦໐໐೦၀ዐｏ๐੦၀ዐℴ௦໐оዐօ〇০ℴዐℴℴ〇੦০о௦౦౦ℴ໐๐";
                    } else {
                        restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
                        switchOnThis = "ჿ၀೦০౦೦౦〇ዐо੦০ｏዐℴⲟ೦০ዐ০о૦০ዐօჿℴ૦၀օ౦ⲟ૦ℴℴჿ";
                    }
                    break;
                case "ⲟ೦૦๐о௦໐੦ዐℴ౦ｏ௦ዐℴ౦ｏⲟዐ੦೦ჿ௦ዐ੦໐੦૦၀๐၀ჿ௦〇օ૦":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "ⲟ੦೦оօ௦૦೦ዐ〇ⲟ໐೦ዐℴ〇੦௦ዐօ੦〇ｏዐօ૦০〇оօ০๐౦੦оｏ";
                    } else {
                        addressView.setText(restaurantAddress);
                        switchOnThis = "๐၀ℴ౦০ⲟｏ໐ዐо০ⲟℴዐℴ๐ｏ౦ዐ૦ℴ੦০ዐ௦໐੦ⲟ〇ჿჿօ໐০૦ｏ";
                    }
                    break;
                case "౦ℴჿ০ჿℴⲟ౦ዐℴ၀〇૦ዐℴ๐০๐ዐ૦೦০ℴዐо૦ჿℴ၀ჿ౦౦੦оօ၀":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        notesListView.setLayoutManager(new LinearLayoutManager(this));
                        switchOnThis = "օℴℴ၀ｏ૦ⲟ০ዐჿ০ｏⲟዐℴօ๐ჿዐ੦〇૦၀ዐоჿⲟօ໐๐ⲟо૦ｏｏ೦";
                    } else {
                        this.notesListView = findViewById(R.id.detail_notes_list);
                        switchOnThis = "੦〇օ೦ℴ೦੦օዐ০๐ⲟ〇ዐℴ၀օ〇ዐ০〇ｏ০ዐ౦о૦౦ｏо೦оｏ๐౦౦";
                    }
                    break;
                case "ჿ၀໐੦ｏჿ੦੦ዐ〇ｏ၀〇ዐℴօჿ੦ዐ੦০ℴ၀ዐℴℴ૦೦օ௦ℴｏ๐౦၀〇":
                    if (OPAQUES[6] % OPAQUES[20] == OPAQUES[21]) {
                        this.notesListView = findViewById(R.id.detail_notes_list);
                        switchOnThis = "ჿ௦໐௦ℴ૦〇౦ዐ໐օⲟօዐℴჿⲟⲟዐօℴ໐օዐ〇ℴｏ၀০໐ⲟｏ໐〇০ⲟ";
                    } else {
                        this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
                        switchOnThis = "໐ჿ〇〇໐੦ⲟⲟዐо೦ⲟ౦ዐℴ๐௦〇ዐ੦ℴօօዐ௦૦〇ｏ૦ჿ૦౦૦ჿⲟ〇";
                    }
                    break;
                case "о໐ℴⲟℴⲟ໐௦ዐⲟ၀౦੦ዐℴ૦օｏዐ૦௦〇໐ዐ໐૦〇๐೦੦ჿჿჿⲟ௦о":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        listAdapter.setOnItemClickListener(this::showNoteInputDialog);
                        switchOnThis = "໐๐၀૦௦ℴ௦ℴዐօоℴ౦ዐℴօ০ⲟዐօ੦০੦ዐ〇๐໐೦૦๐౦ｏ〇օ၀ჿ";
                    } else {
                        loadAppbarImage(photoUrl);
                        switchOnThis = "੦௦๐೦૦〇〇౦ዐ੦ⲟ〇〇ዐℴ૦౦၀ዐ੦໐ℴօዐօ੦੦ჿ੦౦೦໐௦о౦໐";
                    }
                    break;
                case "ჿ೦ℴჿ೦௦০ⲟዐօｏ၀೦ዐℴⲟօℴዐօ૦ℴ೦ዐ໐೦໐౦၀໐ჿ໐૦౦໐о":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        notesListView.setAdapter(listAdapter);
                        switchOnThis = "౦ℴჿ০ჿℴⲟ౦ዐℴ၀〇૦ዐℴ๐০๐ዐ૦೦০ℴዐо૦ჿℴ၀ჿ౦౦੦оօ၀";
                    } else {
                        restaurantName = getIntent().getStringExtra(EXTRA_RESTAURANT_NAME);
                        switchOnThis = "ｏ၀ｏ໐ｏ௦ⲟօዐｏ೦௦၀ዐℴ੦௦೦ዐ০〇০օዐｏℴ௦໐ｏｏ੦ℴ౦૦૦๐";
                    }
                    break;
                case "໐օօ౦ｏ〇০੦ዐｏ໐੦໐ዐℴ૦౦೦ዐօჿ౦ℴዐ໐০օ౦〇〇౦౦೦ⲟ၀ⲟ":
                    setSupportActionBar(toolbar);
                    switchOnThis = "০ℴｏ໐੦օо౦ዐ૦〇ჿ௦ዐℴ၀ℴℴዐ૦໐օ໐ዐօօ೦೦੦໐ⲟ೦ｏ〇օ௦";
                    break;
                case "໐օჿ௦ℴ๐օℴዐоօ০๐ዐℴ၀౦౦ዐ૦〇ｏ೦ዐ೦օ〇০〇๐໐๐໐ℴо๐":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        notesListView.setLayoutManager(new LinearLayoutManager(this));
                        switchOnThis = "о౦၀๐૦௦օ໐ዐℴ੦௦၀ዐℴⲟ౦оዐ੦〇〇০ዐ၀๐໐ℴ၀೦౦ⲟ౦ℴ〇о";
                    } else {
                        this.appBarBackground = findViewById(R.id.detail_app_bar_background);
                        switchOnThis = "օ๐໐૦๐০੦〇ዐօ০௦੦ዐℴ၀ℴⲟዐօ૦๐ჿዐ੦໐ⲟ๐ｏჿⲟօ૦๐๐၀";
                    }
                    break;
                case "০ჿ೦ℴⲟ၀ｏ๐ዐ੦೦ჿℴዐℴ၀೦ℴዐ০о౦ℴዐօ໐〇೦౦໐ჿⲟ০໐о੦":
                    placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                    switchOnThis = "੦௦ｏ๐〇ｏ౦оዐჿ౦ⲟჿዐℴоⲟօዐօჿ໐੦ዐ๐೦օ໐〇૦ℴо౦оℴ౦";
                    break;
                case "ჿ၀೦০౦೦౦〇ዐо੦০ｏዐℴⲟ೦০ዐ০о૦০ዐօჿℴ૦၀օ౦ⲟ૦ℴℴჿ":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        photoUrl = getIntent().getStringExtra(EXTRA_RESTAURANT_PHOTO_URL);
                        switchOnThis = "૦ℴⲟ〇௦ⲟ੦၀ዐ๐ჿօ੦ዐℴ〇૦ⲟዐ૦ｏօℴዐ໐ⲟ೦೦〇ჿ೦௦〇๐০ℴ";
                    } else {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        switchOnThis = "ⲟ০૦೦ⲟℴо၀ዐჿⲟ೦〇ዐℴ〇੦૦ዐ੦ჿ೦௦ዐℴⲟ๐ℴ૦〇о໐૦о੦ⲟ";
                    }
                    break;
                case "๐၀ℴ౦০ⲟｏ໐ዐо০ⲟℴዐℴ๐ｏ౦ዐ૦ℴ੦০ዐ௦໐੦ⲟ〇ჿჿօ໐০૦ｏ":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        setSupportActionBar(toolbar);
                        switchOnThis = "ℴ๐೦௦๐௦ℴჿዐℴ૦ⲟ๐ዐℴоо૦ዐ੦০ℴоዐо૦๐ｏ௦౦ⲟ๐ｏ၀ჿ૦";
                    } else {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "ჿ౦໐໐໐౦௦〇ዐо૦໐૦ዐℴ໐໐੦ዐ૦๐੦০ዐ੦ℴℴｏоℴ೦о௦ჿ೦໐";
                    }
                    break;
                case "၀০〇௦௦௦ｏ໐ዐ০оⲟⲟዐℴо၀૦ዐօо๐օዐ໐௦௦໐೦օჿ〇ℴ໐ｏ၀":
                    this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
                    switchOnThis = "౦о೦૦ｏⲟ໐ｏዐჿ૦օ০ዐℴⲟ๐оዐօօჿ〇ዐｏ੦ℴⲟ௦೦০૦ⲟｏⲟ૦";
                    break;
                case "๐૦ჿ௦о೦໐౦ዐօⲟ໐౦ዐℴ೦੦౦ዐ০๐೦౦ዐⲟℴ૦၀౦௦੦໐ჿ೦ｏօ":
                    if (OPAQUES[16] % OPAQUES[20] != OPAQUES[21]) {
                        restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
                        switchOnThis = "օ০๐೦о၀၀ჿዐℴ੦০оዐℴ૦ⲟ౦ዐօ০௦၀ዐо౦о೦օჿⲟоо૦၀օ";
                    } else {
                        listAdapter.setOnItemLongClickListener(this::showNoteDeleteDialog);
                        switchOnThis = "ჿ೦ℴჿ೦௦০ⲟዐօｏ၀೦ዐℴⲟօℴዐօ૦ℴ೦ዐ໐೦໐౦၀໐ჿ໐૦౦໐о";
                    }
                    break;
                case "оⲟⲟ௦౦ℴ௦оዐ೦০೦ｏዐℴ๐০ｏዐ૦օ໐೦ዐℴ૦௦໐০ⲟ౦〇၀օℴօ":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        viewModel.setPlaceId(placeId);
                        switchOnThis = "о໐ℴⲟℴⲟ໐௦ዐⲟ၀౦੦ዐℴ૦օｏዐ૦௦〇໐ዐ໐૦〇๐೦੦ჿჿჿⲟ௦о";
                    } else {
                        restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
                        switchOnThis = "〇੦〇๐оℴℴｏዐ〇০೦໐ዐℴⲟ໐০ዐ૦০૦ℴዐ໐၀၀੦০౦ⲟ౦০〇೦੦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    protected void onDestroy() {
        String switchOnThis = "о੦ⲟｏｏ૦๐ℴዐ໐ｏჿоዐℴ૦૦০ዐօℴ౦၀ዐⲟ௦೦ℴ০〇໐௦օｏ০০";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 264, 502, 138, 271, 40, 40, 82, 404, 453, 614, 166, 565, 642, 299, 453, 229, 656, 418, 390, 656, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "о੦ⲟｏｏ૦๐ℴዐ໐ｏჿоዐℴ૦૦০ዐօℴ౦၀ዐⲟ௦೦ℴ০〇໐௦օｏ০০":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        if (disposable != null && !disposable.isDisposed())
                            disposable.dispose();
                        switchOnThis = "〇оჿо੦〇ℴ೦ዐ౦೦໐০ዐℴ੦૦౦ዐ૦૦〇໐ዐо௦〇೦ⲟ০೦ⲟօ૦၀௦";
                    } else {
                        if (disposable != null && !disposable.isDisposed())
                            disposable.dispose();
                        switchOnThis = "ჿℴ〇০๐੦೦〇ዐ〇໐ℴ૦ዐℴօ૦оዐ૦ℴ೦੦ዐо೦ｏоｏｏ၀೦௦౦๐ⲟ";
                    }
                    break;
                case "〇оჿо੦〇ℴ೦ዐ౦೦໐০ዐℴ੦૦౦ዐ૦૦〇໐ዐо௦〇೦ⲟ০೦ⲟօ૦၀௦":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        super.onDestroy();
                        switchOnThis = "੦оｏо၀೦੦〇ዐℴ੦૦၀ዐℴ〇օօዐօℴჿоዐ〇၀௦ℴ੦ჿ૦੦໐໐૦ⲟ";
                    } else {
                        super.onDestroy();
                        switchOnThis = "օ໐ⲟ০օⲟ๐೦ዐо௦໐ჿዐℴ〇౦၀ዐ০օ০ℴዐ౦ⲟօ೦০ჿჿℴ௦๐௦о";
                    }
                    break;
                case "౦০ｏ೦ჿ౦೦௦ዐ၀〇౦੦ዐℴ০੦ｏዐ੦౦օ〇ዐⲟ૦ｏⲟо໐ооо໐ⲟօ":
                    if (disposable != null && !disposable.isDisposed())
                        disposable.dispose();
                    switchOnThis = "ჿ೦օօℴ૦ⲟ၀ዐ௦০೦ⲟዐℴо૦౦ዐ૦೦೦೦ዐｏ੦о〇ℴ౦໐০ｏ੦໐ჿ";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void loadAppbarImage(String photoUrl) {
        String switchOnThis = "໐૦оℴ၀০௦๐ዐⲟ౦〇๐ዐℴ০೦ⲟዐ੦ჿჿ๐ዐჿ௦೦௦૦၀૦੦о၀೦ⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 243, 404, 474, 453, 446, 117, 481, 509, 40, 453, 460, 390, 180, 285, 271, 488, 236, 236, 215, 411, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐૦оℴ၀০௦๐ዐⲟ౦〇๐ዐℴ০೦ⲟዐ੦ჿჿ๐ዐჿ௦೦௦૦၀૦੦о၀೦ⲟ":
                    if (OPAQUES[9] % OPAQUES[22] != OPAQUES[20]) {
                        if (photoUrl != null && !photoUrl.isEmpty()) {
                            Glide.with(this).load(photoUrl).into(new SimpleTarget<Drawable>() {

                                @Override
                                public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                                    appBarBackground.setImageDrawable(resource);
                                    appBarScrim.setVisibility(View.VISIBLE);
                                }
                            });
                        }
                        switchOnThis = "૦ℴℴ૦оо၀೦ዐｏℴօօዐℴ໐๐оዐ০๐௦໐ዐⲟｏｏ၀օ০০౦၀๐੦о";
                    } else {
                        if (photoUrl != null && !photoUrl.isEmpty()) {
                            Glide.with(this).load(photoUrl).into(new SimpleTarget<Drawable>() {

                                @Override
                                public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                                    appBarBackground.setImageDrawable(resource);
                                    appBarScrim.setVisibility(View.VISIBLE);
                                }
                            });
                        }
                        switchOnThis = "০౦ｏ၀၀օоⲟዐ௦૦০ℴዐℴ೦໐ℴዐ০௦ℴоዐⲟ੦௦೦০௦ℴ๐௦օⲟо";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void loadNotes() {
        String switchOnThis = "〇ｏ౦ｏ০ℴ੦оዐօ০০০ዐℴ૦೦๐ዐ૦၀௦੦ዐ〇೦ｏ໐ｏⲟⲟ၀၀օჿ၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 68, 306, 19, 502, 348, 257, 26, 607, 677, 131, 649, 523, 362, 131, 502, 425, 292, 61, 418, 523, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "〇ｏ౦ｏ০ℴ੦оዐօ০০০ዐℴ૦೦๐ዐ૦၀௦੦ዐ〇೦ｏ໐ｏⲟⲟ၀၀օჿ၀":
                    if (OPAQUES[9] % OPAQUES[22] != OPAQUES[20]) {
                        disposable = viewModel.getNotes().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> noNotesView.setText(R.string.no_notes_entered));
                        switchOnThis = "ℴჿ໐ⲟⲟօℴ௦ዐ೦๐೦ჿዐℴо೦օዐ੦໐௦〇ዐჿ૦ｏⲟ೦ℴօ౦〇၀໐ჿ";
                    } else {
                        disposable = viewModel.getNotes().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> noNotesView.setText(R.string.no_notes_entered));
                        switchOnThis = "๐๐૦ⲟ໐౦໐〇ዐｏօ੦౦ዐℴｏ໐੦ዐ০౦੦૦ዐჿ໐૦๐০௦૦੦〇၀௦໐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void setAdapterData(List<RestaurantNote> notes) {
        String switchOnThis = "໐೦၀ℴ௦〇੦੦ዐо௦၀౦ዐℴ০〇၀ዐ০੦๐օዐ೦օ၀ｏ๐০օо౦০౦౦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 607, 40, 138, 124, 551, 320, 334, 537, 117, 19, 390, 131, 579, 229, 635, 558, 495, 656, 208, 19, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐೦၀ℴ௦〇੦੦ዐо௦၀౦ዐℴ০〇၀ዐ০੦๐օዐ೦օ၀ｏ๐০օо౦০౦౦":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        if (notes == null || notes.isEmpty()) {
                            notesListView.setVisibility(View.GONE);
                            noNotesView.setVisibility(View.VISIBLE);
                        } else {
                            notesListView.setVisibility(View.VISIBLE);
                            noNotesView.setVisibility(View.GONE);
                            listAdapter.setItems(notes);
                        }
                        switchOnThis = "૦০๐၀၀໐ℴ੦ዐჿჿⲟ๐ዐℴჿ০০ዐ০௦ⲟ౦ዐ๐о౦೦૦օ๐໐౦໐ℴ੦";
                    } else {
                        if (notes == null || notes.isEmpty()) {
                            notesListView.setVisibility(View.GONE);
                            noNotesView.setVisibility(View.VISIBLE);
                        } else {
                            notesListView.setVisibility(View.VISIBLE);
                            noNotesView.setVisibility(View.GONE);
                            listAdapter.setItems(notes);
                        }
                        switchOnThis = "оｏ০ⲟ০౦๐оዐ૦੦໐੦ዐℴｏℴ০ዐօ೦೦၀ዐℴ๐оｏⲟ০о〇о૦օ〇";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void createNote(View view) {
        String switchOnThis = "೦ⲟ০໐ⲟ೦๐ჿዐ੦ⲟ૦੦ዐℴ௦〇೦ዐօჿ〇๐ዐ੦օჿоօ೦ℴ౦੦౦о০";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 481, 61, 663, 362, 572, 341, 278, 61, 621, 453, 320, 222, 383, 145, 159, 523, 215, 54, 236, 663, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦ⲟ০໐ⲟ೦๐ჿዐ੦ⲟ૦੦ዐℴ௦〇೦ዐօჿ〇๐ዐ੦օჿоօ೦ℴ౦੦౦о০":
                    if (OPAQUES[16] % OPAQUES[20] == OPAQUES[21]) {
                        showNoteInputDialog(new RestaurantNote(0, viewModel.getPlaceId(), Decrypt.decrypt("OTFkc290Zm9xbXlvb3d2ZWJydGhybmZ6c3NucWlmZmF3YmxhZmdzcHR0Y2hpZG1saGhxaQ==")));
                        switchOnThis = "௦໐๐০〇ｏ੦〇ዐ〇০੦ℴዐℴօ௦໐ዐօо๐ｏዐℴ੦〇оⲟ௦၀೦੦၀ჿ၀";
                    } else {
                        showNoteInputDialog(new RestaurantNote(0, viewModel.getPlaceId(), Decrypt.decrypt("OTFkc290Zm9xbXlvb3d2ZWJydGhybmZ6c3NucWlmZmF3YmxhZmdzcHR0Y2hpZG1saGhxaQ==")));
                        switchOnThis = "ჿℴ〇௦๐ｏ၀оዐ০૦ჿｏዐℴჿ০໐ዐ੦੦〇၀ዐ੦၀໐၀໐૦੦০౦ჿ໐໐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void showNoteInputDialog(RestaurantNote note) {
        View root = null;
        EditText noteInput = null;
        String switchOnThis = "ⲟ੦о๐০ჿⲟ੦ዐ೦၀оⲟዐℴ၀໐໐ዐօჿ০ჿዐ၀੦ჿⲟ௦૦၀օօ੦౦〇";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 285, 222, 327, 75, 334, 201, 523, 131, 96, 173, 453, 313, 509, 145, 432, 586, 152, 411, 439, 516, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ⲟ੦о๐০ჿⲟ੦ዐ೦၀оⲟዐℴ၀໐໐ዐօჿ০ჿዐ၀੦ჿⲟ௦૦၀օօ੦౦〇":
                    if (OPAQUES[13] % OPAQUES[22] != OPAQUES[20]) {
                        root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
                        switchOnThis = "оօ੦ℴ੦૦၀օዐ๐௦օ೦ዐℴⲟℴ೦ዐօ〇〇〇ዐ໐௦০૦૦օօ೦օｏｏ০";
                    } else {
                        noteInput.setText(note.getNote());
                        switchOnThis = "০੦໐౦о౦ჿ০ዐｏ૦໐೦ዐℴ〇๐၀ዐօ၀ⲟ০ዐⲟჿ૦ჿ০౦〇௦೦օ૦੦";
                    }
                    break;
                case "౦о০໐ჿ၀၀〇ዐ๐ჿ๐〇ዐℴо೦౦ዐ૦০о௦ዐ૦〇০೦૦ⲟ〇ｏ૦о໐ⲟ":
                    root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
                    switchOnThis = "೦০૦о၀๐ｏ૦ዐℴ௦๐〇ዐℴⲟ૦੦ዐ০੦౦੦ዐ੦օ௦ｏ๐໐০๐оჿ౦ℴ";
                    break;
                case "௦о౦໐૦ჿ〇ჿዐ๐೦੦ｏዐℴо௦๐ዐօо੦૦ዐ๐ⲟօ০౦೦๐ｏ໐౦၀๐":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        EditText finalNoteInput = noteInput;
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setView(root).setPositiveButton(R.string.done, ((dialog, i) -> {
                            note.setNote(finalNoteInput.getText().toString());
                            viewModel.editNote(note);
                        })).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "ჿ০౦০ⲟо೦ჿዐ০০ⲟჿዐℴ๐೦໐ዐ੦ℴ০੦ዐⲟⲟ੦೦оо౦০০๐〇ჿ";
                    } else {
                        EditText finalNoteInput1 = noteInput;
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setView(root).setPositiveButton(R.string.done, ((dialog, i) -> {
                            note.setNote(finalNoteInput1.getText().toString());
                            viewModel.editNote(note);
                        })).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "ｏо০೦օ೦௦੦ዐ໐ⲟⲟ౦ዐℴ੦౦օዐ০੦૦оዐ໐૦ჿ๐೦ℴ〇০ℴ໐ⲟ〇";
                    }
                    break;
                case "ｏ੦੦০ჿⲟⲟ౦ዐօ০੦ჿዐℴ૦օоዐօ๐ℴ౦ዐ੦ჿ೦၀ⲟ০ｏ௦၀օ০૦":
                    root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
                    switchOnThis = "੦〇౦ჿ੦০๐೦ዐ๐੦০௦ዐℴ૦ｏօዐ০օ๐ⲟዐℴ૦০০ｏ০೦ｏჿ౦೦௦";
                    break;
                case "оօ੦ℴ੦૦၀օዐ๐௦օ೦ዐℴⲟℴ೦ዐօ〇〇〇ዐ໐௦০૦૦օօ೦օｏｏ০":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        noteInput = root.findViewById(R.id.notes_dialog_text);
                        switchOnThis = "օ๐ℴо๐ｏ〇௦ዐօ೦০ℴዐℴ໐੦௦ዐ০〇๐ჿዐ૦໐౦〇о૦ℴօⲟℴ௦ｏ";
                    } else {
                        noteInput = root.findViewById(R.id.notes_dialog_text);
                        switchOnThis = "౦௦౦౦໐૦೦ჿዐ೦໐০ℴዐℴ૦о೦ዐ০о๐੦ዐ၀੦೦ℴ၀০ⲟօ૦ⲟо၀";
                    }
                    break;
                case "օ๐ℴо๐ｏ〇௦ዐօ೦০ℴዐℴ໐੦௦ዐ০〇๐ჿዐ૦໐౦〇о૦ℴօⲟℴ௦ｏ":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        noteInput = root.findViewById(R.id.notes_dialog_text);
                        switchOnThis = "၀૦௦੦੦ｏⲟоዐჿⲟℴ๐ዐℴ০౦〇ዐ૦੦ჿ໐ዐ০〇૦໐੦ｏ૦〇ჿｏо௦";
                    } else {
                        noteInput.setText(note.getNote());
                        switchOnThis = "௦о౦໐૦ჿ〇ჿዐ๐೦੦ｏዐℴо௦๐ዐօо੦૦ዐ๐ⲟօ০౦೦๐ｏ໐౦၀๐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void showNoteDeleteDialog(RestaurantNote note) {
        String switchOnThis = "໐௦〇໐੦〇〇〇ዐ૦၀௦੦ዐℴ๐౦௦ዐ੦〇ｏ૦ዐⲟօ૦০ℴо၀੦੦օоօ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 96, 446, 19, 439, 446, 635, 523, 369, 138, 187, 334, 271, 642, 502, 194, 75, 278, 509, 439, 75, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐௦〇໐੦〇〇〇ዐ૦၀௦੦ዐℴ๐౦௦ዐ੦〇ｏ૦ዐⲟօ૦০ℴо၀੦੦օоօ":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setMessage(R.string.delete_item).setPositiveButton(R.string.remove, ((dialog, i) -> viewModel.deleteNote(note))).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "໐๐০౦〇໐ჿ〇ዐ౦〇ℴ௦ዐℴ౦๐ｏዐ૦ｏჿоዐℴ০ℴⲟ๐ｏ๐๐ｏօ౦౦";
                    } else {
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setMessage(R.string.delete_item).setPositiveButton(R.string.remove, ((dialog, i) -> viewModel.deleteNote(note))).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "օօоⲟ〇০၀๐ዐо০๐๐ዐℴｏ০໐ዐօ੦๐೦ዐｏｏｏ๐೦௦օ০〇ｏ੦๐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }
}
