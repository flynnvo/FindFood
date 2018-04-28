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
        String switchOnThis = "ჿ೦౦ℴ૦๐૦๐ዐ໐ჿ໐օዐℴⲟ໐ჿዐ૦၀໐ⲟዐ〇૦ჿ๐ｏ೦໐օ૦ჿ೦ⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 600, 12, 173, 201, 187, 460, 467, 488, 502, 453, 586, 96, 40, 54, 348, 271, 474, 369, 299, 509, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐〇౦໐০ｏ၀၀ዐჿ౦๐೦ዐℴ੦ℴօዐ੦௦ℴ໐ዐ๐ℴ০౦ჿ০ჿ০〇ℴⲟ௦":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
                        switchOnThis = "о໐ⲟⲟ௦၀๐ｏዐ〇ｏ౦໐ዐℴ၀੦၀ዐ੦๐௦ⲟዐ၀๐০օ௦௦ჿ၀ⲟоჿ〇";
                    } else {
                        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);
                        switchOnThis = "〇၀೦໐೦ჿ໐ｏዐ๐૦օ௦ዐℴ૦௦௦ዐ૦〇๐ℴዐⲟჿ০௦ჿⲟ๐௦૦௦ჿо";
                    }
                    break;
                case "౦о೦๐օ໐๐ჿዐ౦੦੦೦ዐℴ௦ｏ০ዐօｏ੦௦ዐ૦๐໐೦ⲟоჿ๐၀೦໐օ":
                    notesListView.setLayoutManager(new LinearLayoutManager(this));
                    switchOnThis = "০௦ℴ੦օⲟｏօዐ၀௦๐〇ዐℴ੦૦ⲟዐ੦੦〇၀ዐ๐໐оｏℴ໐౦օⲟ၀๐໐";
                    break;
                case "ｏ๐௦ｏ௦օ੦ｏዐ၀օ૦оዐℴօⲟ೦ዐ૦〇၀੦ዐ௦૦০০੦௦೦௦ⲟ๐০೦":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        listAdapter.setOnItemLongClickListener(this::showNoteDeleteDialog);
                        switchOnThis = "๐ⲟჿ੦ჿⲟ੦ⲟዐ੦〇о૦ዐℴ੦໐௦ዐօ೦೦ｏዐｏ๐੦〇໐௦૦ℴⲟօ૦೦";
                    } else {
                        loadNotes();
                        switchOnThis = "о೦ჿ๐૦໐௦০ዐ೦๐০೦ዐℴо੦੦ዐ૦೦೦໐ዐ๐о౦౦௦০໐〇ⲟօ੦ｏ";
                    }
                    break;
                case "၀໐০೦૦о๐၀ዐ૦௦ｏօዐℴ๐૦օዐ০੦〇໐ዐｏ౦૦〇ｏо০о০ｏჿჿ":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        loadAppbarImage(photoUrl);
                        switchOnThis = "௦〇ｏ໐ℴ௦օоዐ০੦๐ｏዐℴ〇೦օዐ০๐౦০ዐ০໐օ௦ℴ૦о૦օ౦௦౦";
                    } else {
                        this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
                        switchOnThis = "ⲟ౦օ೦ℴ၀օⲟዐ๐੦૦໐ዐℴ੦〇ℴዐ০૦০оዐоℴ௦೦૦оօօ੦ⲟჿ০";
                    }
                    break;
                case "ჿ૦ℴօ౦০੦ⲟዐ০〇೦೦ዐℴｏℴօዐ੦օ೦০ዐ০౦০௦௦౦ℴჿօ໐೦๐":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);
                        switchOnThis = "໐၀〇໐௦๐௦௦ዐ๐૦૦ჿዐℴ౦ⲟჿዐ০၀౦૦ዐჿо၀օｏ๐௦ℴօｏ๐ｏ";
                    } else {
                        notesListView.setLayoutManager(new LinearLayoutManager(this));
                        switchOnThis = "੦၀၀о๐೦໐໐ዐ੦о੦၀ዐℴ௦օ๐ዐ੦ჿ౦௦ዐо০౦ℴ೦〇ｏ০๐ⲟ೦໐";
                    }
                    break;
                case "౦೦ⲟ੦๐໐૦ℴዐо๐੦〇ዐℴℴ၀၀ዐ૦〇ℴⲟዐ૦ჿօ၀౦о০๐օ၀օⲟ":
                    this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
                    switchOnThis = "੦૦ℴჿ౦૦о௦ዐ౦о૦ⲟዐℴｏｏ〇ዐ০௦೦০ዐ๐օ௦ｏ၀၀〇〇௦๐ჿℴ";
                    break;
                case "๐໐೦о౦০ჿоዐ૦ℴ೦〇ዐℴ๐౦௦ዐ০০〇ⲟዐⲟ౦ｏ೦օ೦о၀૦օ໐ℴ":
                    if (OPAQUES[10] % OPAQUES[20] == OPAQUES[21]) {
                        addressView = findViewById(R.id.detail_restaurant_address);
                        switchOnThis = "੦০ⲟ௦〇౦ⲟｏዐⲟ૦ℴ੦ዐℴ૦၀оዐ০૦ⲟⲟዐ೦о০ℴ೦օ౦౦౦оｏｏ";
                    } else {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        switchOnThis = "օօ๐໐ｏჿօ๐ዐ〇၀〇੦ዐℴ၀๐໐ዐօ໐о೦ዐ০০ჿо໐၀〇၀၀০௦๐";
                    }
                    break;
                case "๐੦ჿо௦ｏ໐๐ዐ೦೦ℴ௦ዐℴ૦ｏ၀ዐ০〇૦੦ዐჿჿ૦໐ｏо௦о੦๐ｏ໐":
                    setContentView(R.layout.activity_restaurant_detail);
                    switchOnThis = "ჿоｏⲟօ০〇၀ዐℴ๐௦૦ዐℴ੦оｏዐ੦೦ⲟ๐ዐ௦௦ⲟоｏ๐၀೦೦௦о၀";
                    break;
                case "〇೦೦૦໐ℴоჿዐℴо၀ｏዐℴ๐೦၀ዐօｏօⲟዐℴ೦ⲟօ၀০၀௦૦௦၀ჿ":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        restaurantName = getIntent().getStringExtra(EXTRA_RESTAURANT_NAME);
                        switchOnThis = "๐๐๐〇๐೦૦໐ዐｏ૦௦๐ዐℴ၀໐ⲟዐ০၀〇ℴዐჿℴ๐๐૦ⲟ၀๐೦౦๐၀";
                    } else {
                        placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                        switchOnThis = "౦௦оо೦๐೦০ዐоⲟ໐оዐℴჿ၀౦ዐ੦௦০໐ዐ๐૦օ੦ℴｏ௦〇ჿ၀໐о";
                    }
                    break;
                case "໐௦௦௦૦૦೦ჿዐℴℴჿ௦ዐℴ໐໐〇ዐ૦〇о౦ዐｏ౦๐০၀౦о〇౦〇౦౦":
                    if (OPAQUES[8] % OPAQUES[20] == OPAQUES[21]) {
                        viewModel.setPlaceId(placeId);
                        switchOnThis = "၀໐০೦૦о๐၀ዐ૦௦ｏօዐℴ๐૦օዐ০੦〇໐ዐｏ౦૦〇ｏо০о০ｏჿჿ";
                    } else {
                        notesListView.setLayoutManager(new LinearLayoutManager(this));
                        switchOnThis = "໐০໐ｏ໐၀౦〇ዐ໐૦ჿ૦ዐℴ੦০໐ዐ੦૦੦௦ዐ೦໐੦૦ℴ௦〇໐໐о૦௦";
                    }
                    break;
                case "၀౦૦໐૦օ〇௦ዐ௦๐ჿჿዐℴ૦౦౦ዐօⲟ๐໐ዐ〇੦௦੦о੦๐೦ⲟо੦၀":
                    if (OPAQUES[6] % OPAQUES[20] == OPAQUES[21]) {
                        notesListView.setLayoutManager(new LinearLayoutManager(this));
                        switchOnThis = "〇೦೦૦໐ℴоჿዐℴо၀ｏዐℴ๐೦၀ዐօｏօⲟዐℴ೦ⲟօ၀০၀௦૦௦၀ჿ";
                    } else {
                        setSupportActionBar(toolbar);
                        switchOnThis = "౦੦ℴ໐૦ｏօℴዐ๐ⲟ၀౦ዐℴ໐ჿ๐ዐ੦ℴ໐ⲟዐօჿ໐০໐౦о၀೦௦౦ℴ";
                    }
                    break;
                case "૦၀౦૦੦ჿ౦੦ዐ౦ⲟ໐օዐℴ๐ჿ〇ዐօо၀੦ዐ౦ｏჿ૦๐౦ჿ౦೦օ૦ℴ":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        setSupportActionBar(toolbar);
                        switchOnThis = "௦૦၀ｏ〇౦௦ℴዐ೦၀〇၀ዐℴｏｏ〇ዐ੦ｏ૦օዐ೦౦౦օо໐၀௦౦০ⲟ໐";
                    } else {
                        listAdapter.setOnItemClickListener(this::showNoteInputDialog);
                        switchOnThis = "ｏ๐௦ｏ௦օ੦ｏዐ၀օ૦оዐℴօⲟ೦ዐ૦〇၀੦ዐ௦૦০০੦௦೦௦ⲟ๐০೦";
                    }
                    break;
                case "օჿ૦௦௦੦ჿ૦ዐ໐௦〇ｏዐℴჿоｏዐ০೦၀၀ዐ੦ℴ০౦ℴ੦ｏ〇૦ჿ૦௦":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);
                        switchOnThis = "оჿ〇ჿ౦૦໐੦ዐ〇၀૦оዐℴ೦о০ዐ૦〇૦ⲟዐ〇૦੦௦௦০০૦໐௦օ০";
                    } else {
                        this.noNotesView = findViewById(R.id.detail_no_notes_view);
                        switchOnThis = "౦ჿ໐о໐໐০ჿዐｏ〇০০ዐℴ௦ооዐօჿ૦ჿዐ၀о০၀ⲟ၀০๐օօօ੦";
                    }
                    break;
                case "о໐ⲟⲟ௦၀๐ｏዐ〇ｏ౦໐ዐℴ၀੦၀ዐ੦๐௦ⲟዐ၀๐০օ௦௦ჿ၀ⲟоჿ〇":
                    if (OPAQUES[2] % OPAQUES[20] != OPAQUES[21]) {
                        restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
                        switchOnThis = "ⲟｏ၀ⲟ၀օ੦ⲟዐ๐௦၀૦ዐℴｏ໐ⲟዐօ၀၀၀ዐჿ੦ⲟ૦ⲟ〇〇ℴ๐〇೦૦";
                    } else {
                        photoUrl = getIntent().getStringExtra(EXTRA_RESTAURANT_PHOTO_URL);
                        switchOnThis = "ⲟ໐๐௦ｏℴ๐ⲟዐо૦၀౦ዐℴ๐ｏ০ዐ੦౦ооዐ၀੦о〇০੦௦੦ℴ໐೦၀";
                    }
                    break;
                case "໐໐૦੦ჿ〇๐໐ዐｏⲟ૦૦ዐℴ೦௦〇ዐ૦օ၀૦ዐօ০ⲟ೦໐ჿჿ૦օօ໐օ":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        switchOnThis = "໐௦௦௦૦૦೦ჿዐℴℴჿ௦ዐℴ໐໐〇ዐ૦〇о౦ዐｏ౦๐০၀౦о〇౦〇౦౦";
                    } else {
                        loadAppbarImage(photoUrl);
                        switchOnThis = "ჿｏ૦໐၀૦၀ｏዐ၀໐೦૦ዐℴ௦ℴ၀ዐ০૦о੦ዐ૦၀ｏ૦ჿ௦၀ჿօ๐о๐";
                    }
                    break;
                case "০૦ｏ੦о૦о௦ዐⲟ০օ౦ዐℴ〇оℴዐ০௦૦೦ዐ੦೦օоℴ০໐೦੦၀〇〇":
                    this.noNotesView = findViewById(R.id.detail_no_notes_view);
                    switchOnThis = "ჿｏჿօ௦ℴჿ૦ዐ০оօｏዐℴ໐〇ჿዐ੦ｏ๐օዐ౦оℴо੦ⲟօⲟ੦๐ｏ੦";
                    break;
                case "ჿ೦౦ℴ૦๐૦๐ዐ໐ჿ໐օዐℴⲟ໐ჿዐ૦၀໐ⲟዐ〇૦ჿ๐ｏ೦໐օ૦ჿ೦ⲟ":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        this.notesListView = findViewById(R.id.detail_notes_list);
                        switchOnThis = "〇๐ⲟ೦๐о๐๐ዐ૦໐০оዐℴо໐૦ዐ૦௦о๐ዐ੦օоჿჿ၀о౦໐၀〇๐";
                    } else {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "೦೦੦ⲟօｏⲟоዐ౦ჿⲟօዐℴｏ၀၀ዐ૦੦ｏ၀ዐ〇੦ⲟ௦೦〇ℴჿ๐ｏ੦๐";
                    }
                    break;
                case "๐ⲟჿ੦ჿⲟ੦ⲟዐ੦〇о૦ዐℴ੦໐௦ዐօ೦೦ｏዐｏ๐੦〇໐௦૦ℴⲟօ૦೦":
                    if (OPAQUES[16] % OPAQUES[20] == OPAQUES[21]) {
                        notesListView.setAdapter(listAdapter);
                        switchOnThis = "၀౦૦໐૦օ〇௦ዐ௦๐ჿჿዐℴ૦౦౦ዐօⲟ๐໐ዐ〇੦௦੦о੦๐೦ⲟо੦၀";
                    } else {
                        restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
                        switchOnThis = "੦ⲟ౦໐০ｏ๐౦ዐ૦၀೦〇ዐℴⲟ๐౦ዐ੦ⲟｏⲟዐｏ૦օｏ௦ჿօ၀〇੦ℴ၀";
                    }
                    break;
                case "૦೦օ০๐೦০೦ዐօ໐໐ⲟዐℴ૦૦౦ዐ০੦০〇ዐо০૦௦ℴ૦ჿ੦੦૦໐ｏ":
                    loadAppbarImage(photoUrl);
                    switchOnThis = "૦੦໐ｏ০੦০〇ዐ௦ｏ౦০ዐℴ೦оｏዐ૦੦౦၀ዐ໐օ০ｏ૦๐о၀๐౦೦၀";
                    break;
                case "೦೦੦ⲟօｏⲟоዐ౦ჿⲟօዐℴｏ၀၀ዐ૦੦ｏ၀ዐ〇੦ⲟ௦೦〇ℴჿ๐ｏ੦๐":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                        switchOnThis = "௦оℴｏоⲟօ໐ዐℴｏⲟ೦ዐℴ૦օ๐ዐ੦੦૦ჿዐჿ๐ℴ೦ⲟჿ০၀ｏｏ૦૦";
                    } else {
                        setContentView(R.layout.activity_restaurant_detail);
                        switchOnThis = "ჿ૦ℴօ౦০੦ⲟዐ০〇೦೦ዐℴｏℴօዐ੦օ೦০ዐ০౦০௦௦౦ℴჿօ໐೦๐";
                    }
                    break;
                case "๐๐๐〇๐೦૦໐ዐｏ૦௦๐ዐℴ၀໐ⲟዐ০၀〇ℴዐჿℴ๐๐૦ⲟ၀๐೦౦๐၀":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                        switchOnThis = "໐〇౦໐০ｏ၀၀ዐჿ౦๐೦ዐℴ੦ℴօዐ੦௦ℴ໐ዐ๐ℴ০౦ჿ০ჿ০〇ℴⲟ௦";
                    } else {
                        this.viewModel = ViewModelProviders.of(this).get(RestaurantDetailViewModel.class);
                        switchOnThis = "௦๐օჿօ௦௦ℴዐ〇ჿ੦ｏዐℴ௦૦օዐ૦૦ℴ〇ዐ௦ჿо๐օօ૦০௦౦๐௦";
                    }
                    break;
                case "੦ჿ〇໐੦໐๐๐ዐ੦૦о໐ዐℴჿ၀ℴዐօℴⲟⲟዐ௦ℴ౦໐〇ჿ〇၀〇๐೦օ":
                    addressView = findViewById(R.id.detail_restaurant_address);
                    switchOnThis = "೦〇০၀০о၀оዐ౦੦೦૦ዐℴօⲟօዐ૦౦೦০ዐ௦о၀о೦๐੦০оｏ๐〇";
                    break;
                case "໐၀〇໐௦๐௦௦ዐ๐૦૦ჿዐℴ౦ⲟჿዐ০၀౦૦ዐჿо၀օｏ๐௦ℴօｏ๐ｏ":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        this.appBarBackground = findViewById(R.id.detail_app_bar_background);
                        switchOnThis = "ჿ๐੦ⲟ〇၀ｏ၀ዐ੦〇၀೦ዐℴ၀ｏⲟዐ૦ℴℴ০ዐ໐੦૦оℴ໐௦೦၀〇〇օ";
                    } else {
                        toolbar = findViewById(R.id.detail_toolbar);
                        switchOnThis = "੦౦〇ℴ௦๐೦ｏዐ೦੦໐ℴዐℴ๐ℴ໐ዐօо౦၀ዐⲟоℴｏ๐ｏ๐໐๐೦о০";
                    }
                    break;
                case "૦౦၀໐ℴ௦౦ℴዐօ໐੦૦ዐℴօ੦੦ዐ০੦౦੦ዐօⲟｏ๐੦੦೦೦໐ⲟ໐૦":
                    this.appBarBackground = findViewById(R.id.detail_app_bar_background);
                    switchOnThis = "๐০оо૦օ௦ℴዐ〇ჿ౦໐ዐℴ၀ჿ০ዐ੦၀ｏჿዐⲟ๐ⲟ〇૦౦օо๐օ০ｏ";
                    break;
                case "০೦๐௦௦၀૦௦ዐ০০〇ჿዐℴⲟоⲟዐ੦оօ೦ዐ੦〇໐ⲟჿ೦௦೦ⲟჿｏ೦":
                    if (OPAQUES[17] % OPAQUES[22] == OPAQUES[20]) {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        switchOnThis = "౦০о০о၀ℴｏዐ౦๐௦૦ዐℴℴ௦௦ዐ੦ⲟｏｏዐ౦օ၀੦ｏо౦〇೦ℴ໐௦";
                    } else {
                        listAdapter = new RestaurantNotesListAdapter();
                        switchOnThis = "૦၀౦૦੦ჿ౦੦ዐ౦ⲟ໐օዐℴ๐ჿ〇ዐօо၀੦ዐ౦ｏჿ૦๐౦ჿ౦೦օ૦ℴ";
                    }
                    break;
                case "૦〇၀০ჿ๐о૦ዐℴ၀໐๐ዐℴ০૦౦ዐ੦௦௦੦ዐ੦օ௦౦૦ჿ੦〇௦০ⲟⲟ":
                    notesListView.setAdapter(listAdapter);
                    switchOnThis = "ℴⲟ೦๐ⲟℴо੦ዐ౦〇೦૦ዐℴⲟ૦၀ዐ০ⲟ໐๐ዐ〇໐ⲟ၀੦૦〇ℴ〇໐ｏ๐";
                    break;
                case "૦০ｏ০ⲟ〇၀੦ዐ๐оჿჿዐℴℴｏ౦ዐօ๐ｏ၀ዐ૦໐օｏօ໐о૦ｏ౦о೦":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
                        setSupportActionBar(toolbar);
                        switchOnThis = "໐໐૦੦ჿ〇๐໐ዐｏⲟ૦૦ዐℴ೦௦〇ዐ૦օ၀૦ዐօ০ⲟ೦໐ჿჿ૦օօ໐օ";
                    } else {
                        super.onCreate(savedInstanceState);
                        switchOnThis = "૦օｏо௦օ໐օዐ〇౦๐ｏዐℴℴо੦ዐ০〇௦〇ዐ〇ｏ๐о০౦૦೦੦௦〇ℴ";
                    }
                    break;
                case "ⲟ໐๐௦ｏℴ๐ⲟዐо૦၀౦ዐℴ๐ｏ০ዐ੦౦ооዐ၀੦о〇০੦௦੦ℴ໐೦၀":
                    if (OPAQUES[1] % OPAQUES[22] == OPAQUES[20]) {
                        loadNotes();
                        switchOnThis = "௦೦๐ｏ௦ｏ၀၀ዐ੦౦ℴ೦ዐℴჿо౦ዐ০૦ｏ௦ዐ〇౦ℴ௦ℴⲟօо೦౦၀օ";
                    } else {
                        toolbar = findViewById(R.id.detail_toolbar);
                        switchOnThis = "໐օ೦೦ჿ೦ℴ၀ዐ౦օ੦૦ዐℴ௦໐໐ዐ૦૦૦ℴዐ໐০о૦০〇〇ⲟօ૦০૦";
                    }
                    break;
                case "૦ｏо໐০૦ⲟ౦ዐօ೦օ〇ዐℴ੦੦ჿዐօ੦૦օዐо೦੦০၀օ๐૦౦૦о໐":
                    restaurantAddress = getIntent().getStringExtra(EXTRA_RESTAURANT_ADDRESS);
                    switchOnThis = "೦〇օ၀໐ⲟ〇ჿዐ੦೦ჿ౦ዐℴℴ၀໐ዐօჿ౦၀ዐ૦о௦໐๐оо௦ｏ໐౦೦";
                    break;
                case "၀໐ჿｏ೦০௦૦ዐ໐ｏ〇ℴዐℴօ〇ჿዐ૦੦၀၀ዐ໐օｏ๐૦၀ჿо໐੦௦օ":
                    addressView.setText(restaurantAddress);
                    switchOnThis = "໐໐০໐໐ℴօ၀ዐ໐ｏ౦૦ዐℴօ੦ℴዐօ๐૦ℴዐℴ౦௦০ჿჿｏ੦໐օｏⲟ";
                    break;
                case "ⲟჿ੦ｏ၀౦〇ჿዐоօ〇໐ዐℴօჿ๐ዐ૦օ০໐ዐჿ০ｏ௦၀໐໐০〇оо௦":
                    placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                    switchOnThis = "౦〇၀௦๐ჿ੦০ዐ၀ℴჿ௦ዐℴ၀〇օዐ૦૦ｏ๐ዐ๐ჿ૦օ໐ჿ௦੦၀օ০໐";
                    break;
                case "੦০ⲟ௦〇౦ⲟｏዐⲟ૦ℴ੦ዐℴ૦၀оዐ০૦ⲟⲟዐ೦о০ℴ೦օ౦౦౦оｏｏ":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        listAdapter.setOnItemClickListener(this::showNoteInputDialog);
                        switchOnThis = "〇໐ჿ๐〇၀૦ჿዐｏⲟℴ೦ዐℴ૦〇〇ዐօоⲟ௦ዐℴооо೦ⲟ௦оⲟ੦၀๐";
                    } else {
                        addressView.setText(restaurantAddress);
                        switchOnThis = "૦০ｏ০ⲟ〇၀੦ዐ๐оჿჿዐℴℴｏ౦ዐօ๐ｏ၀ዐ૦໐օｏօ໐о૦ｏ౦о೦";
                    }
                    break;
                case "௦〇ｏ໐ℴ௦օоዐ০੦๐ｏዐℴ〇೦օዐ০๐౦০ዐ০໐օ௦ℴ૦о૦օ౦௦౦":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        toolbar = findViewById(R.id.detail_toolbar);
                        switchOnThis = "০ℴ೦๐〇ჿօ๐ዐ๐๐ⲟჿዐℴჿℴ૦ዐ૦০ჿоዐօ〇〇૦੦ⲟ੦೦๐০௦০";
                    } else {
                        loadNotes();
                        switchOnThis = "௦౦ℴ๐০ℴ໐օዐ૦૦၀૦ዐℴ೦ｏჿዐ੦〇о੦ዐ೦๐օօ೦၀၀ⲟ૦౦໐๐";
                    }
                    break;
                case "๐૦ⲟ໐௦০೦໐ዐ๐੦၀೦ዐℴ૦੦ℴዐ০໐ℴоዐ၀၀օ๐ｏ๐੦০оо০〇":
                    placeId = getIntent().getStringExtra(EXTRA_RESTAURANT_ID);
                    switchOnThis = "ℴⲟⲟօⲟｏо੦ዐ၀೦о໐ዐℴ๐ჿ໐ዐ੦௦໐ჿዐ౦ｏ੦০૦о๐੦໐ⲟ〇০";
                    break;
                case "ჿ๐੦ⲟ〇၀ｏ၀ዐ੦〇၀೦ዐℴ၀ｏⲟዐ૦ℴℴ০ዐ໐੦૦оℴ໐௦೦၀〇〇օ":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        notesListView.setAdapter(listAdapter);
                        switchOnThis = "௦ℴ௦оℴ੦໐૦ዐ੦০೦೦ዐℴ๐ℴоዐօ〇௦໐ዐℴჿ௦ⲟо੦೦օо૦օ૦";
                    } else {
                        this.appBarScrim = findViewById(R.id.detail_app_bar_scrim);
                        switchOnThis = "օჿ૦௦௦੦ჿ૦ዐ໐௦〇ｏዐℴჿоｏዐ০೦၀၀ዐ੦ℴ০౦ℴ੦ｏ〇૦ჿ૦௦";
                    }
                    break;
                case "໐օ೦೦ჿ೦ℴ၀ዐ౦օ੦૦ዐℴ௦໐໐ዐ૦૦૦ℴዐ໐০о૦০〇〇ⲟօ૦০૦":
                    if (OPAQUES[15] % OPAQUES[22] == OPAQUES[20]) {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        switchOnThis = "ｏℴ໐๐੦੦๐ｏዐоօօℴዐℴ੦೦๐ዐօ၀օჿዐօｏ೦໐౦೦໐օօ০੦ჿ";
                    } else {
                        toolbar.setTitle(restaurantName);
                        switchOnThis = "๐໐೦о౦০ჿоዐ૦ℴ೦〇ዐℴ๐౦௦ዐ০০〇ⲟዐⲟ౦ｏ೦օ೦о၀૦օ໐ℴ";
                    }
                    break;
                case "౦ჿ໐о໐໐০ჿዐｏ〇০০ዐℴ௦ооዐօჿ૦ჿዐ၀о০၀ⲟ၀০๐օօօ੦":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
                        this.notesListView = findViewById(R.id.detail_notes_list);
                        switchOnThis = "০೦๐௦௦၀૦௦ዐ০০〇ჿዐℴⲟоⲟዐ੦оօ೦ዐ੦〇໐ⲟჿ೦௦೦ⲟჿｏ೦";
                    } else {
                        this.notesListView = findViewById(R.id.detail_notes_list);
                        switchOnThis = "೦ჿ๐০๐օօℴዐ౦ⲟ੦ｏዐℴоჿ૦ዐ০০〇০ዐ〇૦௦ⲟ〇೦๐၀௦๐੦೦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    protected void onDestroy() {
        String switchOnThis = "၀ჿℴ౦೦๐๐ｏዐօⲟｏ૦ዐℴჿⲟｏዐ૦๐ჿℴዐ௦ჿ૦૦ℴｏ౦௦౦௦ℴჿ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 537, 124, 390, 89, 509, 208, 523, 61, 509, 586, 201, 159, 579, 292, 40, 432, 166, 12, 229, 103, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০о௦੦౦০೦ｏዐ〇০ℴ໐ዐℴℴⲟ〇ዐ੦ｏⲟ໐ዐ੦၀೦〇೦๐〇๐օ௦౦၀":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        super.onDestroy();
                        switchOnThis = "〇௦〇০ℴｏо၀ዐօ၀о〇ዐℴ〇০૦ዐ૦໐੦໐ዐⲟｏօо০〇օⲟｏ〇௦ⲟ";
                    } else {
                        if (disposable != null && !disposable.isDisposed())
                            disposable.dispose();
                        switchOnThis = "૦օօ੦੦о૦၀ዐ〇໐〇〇ዐℴ๐ｏ〇ዐ੦೦౦օዐ๐੦ⲟօ〇০〇ⲟ০૦੦օ";
                    }
                    break;
                case "ｏ੦၀০ｏℴｏօዐ๐〇о௦ዐℴ೦௦௦ዐ૦၀૦০ዐⲟ౦௦о੦๐೦౦೦௦੦օ":
                    if (disposable != null && !disposable.isDisposed())
                        disposable.dispose();
                    switchOnThis = "ⲟ໐๐ⲟⲟ၀〇૦ዐ౦ｏ০௦ዐℴо๐၀ዐօօ೦ℴዐჿ၀೦౦০〇໐ℴ੦၀๐૦";
                    break;
                case "၀ჿℴ౦೦๐๐ｏዐօⲟｏ૦ዐℴჿⲟｏዐ૦๐ჿℴዐ௦ჿ૦૦ℴｏ౦௦౦௦ℴჿ":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        if (disposable != null && !disposable.isDisposed())
                            disposable.dispose();
                        switchOnThis = "০о௦੦౦০೦ｏዐ〇০ℴ໐ዐℴℴⲟ〇ዐ੦ｏⲟ໐ዐ੦၀೦〇೦๐〇๐օ௦౦၀";
                    } else {
                        super.onDestroy();
                        switchOnThis = "౦೦ჿօо๐೦০ዐ૦౦၀ჿዐℴℴ๐౦ዐ૦ｏⲟ੦ዐо〇໐ⲟ௦๐ℴօℴ০௦օ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void loadAppbarImage(String photoUrl) {
        String switchOnThis = "оօℴℴ၀ⲟօ〇ዐ౦௦၀ⲟዐℴ໐օ੦ዐ০օ၀੦ዐ௦၀о೦੦੦ⲟ০໐၀௦ℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 257, 425, 425, 362, 418, 509, 313, 600, 432, 586, 68, 243, 600, 404, 243, 208, 551, 285, 642, 565, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "оօℴℴ၀ⲟօ〇ዐ౦௦၀ⲟዐℴ໐օ੦ዐ০օ၀੦ዐ௦၀о೦੦੦ⲟ০໐၀௦ℴ":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        if (photoUrl != null && !photoUrl.isEmpty()) {
                            Glide.with(this).load(photoUrl).into(new SimpleTarget<Drawable>() {

                                @Override
                                public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                                    appBarBackground.setImageDrawable(resource);
                                    appBarScrim.setVisibility(View.VISIBLE);
                                }
                            });
                        }
                        switchOnThis = "໐ℴ௦০ℴ๐оჿዐｏ੦๐оዐℴ౦౦౦ዐ০૦০໐ዐℴ๐౦၀ℴ૦০օｏ௦ℴⲟ";
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
                        switchOnThis = "౦ⲟ〇௦၀օ၀໐ዐ၀оｏоዐℴо೦০ዐ૦၀ℴ๐ዐ੦౦೦๐〇໐૦০૦օ၀ჿ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void loadNotes() {
        String switchOnThis = "০ჿℴჿ〇ℴℴ๐ዐ૦оｏ௦ዐℴ౦০оዐ০০ｏоዐ૦〇௦ⲟօ০ℴ੦໐๐௦໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 278, 229, 523, 411, 467, 593, 243, 320, 271, 68, 397, 334, 579, 369, 579, 96, 313, 621, 75, 19, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০ჿℴჿ〇ℴℴ๐ዐ૦оｏ௦ዐℴ౦০оዐ০০ｏоዐ૦〇௦ⲟօ০ℴ੦໐๐௦໐":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        disposable = viewModel.getNotes().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> noNotesView.setText(R.string.no_notes_entered));
                        switchOnThis = "ⲟ၀૦౦ჿ௦੦օዐо๐ჿ੦ዐℴ੦೦௦ዐ০೦੦೦ዐ೦૦௦೦օоℴⲟ૦੦ｏօ";
                    } else {
                        disposable = viewModel.getNotes().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::setAdapterData, error -> noNotesView.setText(R.string.no_notes_entered));
                        switchOnThis = "օ၀౦ℴ૦〇೦੦ዐჿჿⲟ੦ዐℴ၀౦౦ዐ০၀໐໐ዐ၀੦௦೦о೦ｏჿｏ੦၀ｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void setAdapterData(List<RestaurantNote> notes) {
        String switchOnThis = "໐ℴ〇〇૦〇੦ჿዐ೦о๐ჿዐℴ੦೦๐ዐօ౦ⲟჿዐ໐౦೦ℴ೦օ〇ℴ੦໐ｏℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 250, 292, 201, 124, 663, 544, 166, 425, 33, 152, 369, 544, 425, 299, 75, 418, 663, 180, 593, 509, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐ℴ〇〇૦〇੦ჿዐ೦о๐ჿዐℴ੦೦๐ዐօ౦ⲟჿዐ໐౦೦ℴ೦օ〇ℴ੦໐ｏℴ":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        if (notes == null || notes.isEmpty()) {
                            notesListView.setVisibility(View.GONE);
                            noNotesView.setVisibility(View.VISIBLE);
                        } else {
                            notesListView.setVisibility(View.VISIBLE);
                            noNotesView.setVisibility(View.GONE);
                            listAdapter.setItems(notes);
                        }
                        switchOnThis = "ⲟ૦〇০〇௦о೦ዐჿо๐๐ዐℴ০ℴоዐ૦০௦ⲟዐօ০〇ⲟⲟ๐ⲟ๐๐ｏℴ૦";
                    } else {
                        if (notes == null || notes.isEmpty()) {
                            notesListView.setVisibility(View.GONE);
                            noNotesView.setVisibility(View.VISIBLE);
                        } else {
                            notesListView.setVisibility(View.VISIBLE);
                            noNotesView.setVisibility(View.GONE);
                            listAdapter.setItems(notes);
                        }
                        switchOnThis = "ℴօ੦օⲟ೦౦ჿዐ၀০ჿ೦ዐℴօ໐০ዐ੦ჿჿ௦ዐℴօ〇௦໐௦੦೦ℴⲟｏｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void createNote(View view) {
        String switchOnThis = "๐໐੦૦੦ｏ೦ℴዐ૦০๐௦ዐℴ০〇ℴዐ૦ⲟ੦౦ዐ೦০೦о໐೦ჿ੦၀೦օо";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 187, 565, 257, 369, 600, 173, 432, 292, 236, 89, 439, 551, 635, 54, 292, 131, 516, 628, 530, 488, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐໐੦૦੦ｏ೦ℴዐ૦০๐௦ዐℴ০〇ℴዐ૦ⲟ੦౦ዐ೦০೦о໐೦ჿ੦၀೦օо":
                    if (OPAQUES[15] % OPAQUES[22] == OPAQUES[20]) {
                        showNoteInputDialog(new RestaurantNote(0, viewModel.getPlaceId(), Decrypt.decrypt("ODJzZmpseGVhbXVndHF2eXZwZWp5YnhzaHBpeXl6Z21xbGhweXpzbmVtdG95dmx0YWNxaQ==")));
                        switchOnThis = "໐০၀ⲟ੦౦ℴｏዐ০௦ｏ၀ዐℴℴ੦〇ዐօօ๐ჿዐ೦๐ℴ໐օℴоօ૦ｏ௦౦";
                    } else {
                        showNoteInputDialog(new RestaurantNote(0, viewModel.getPlaceId(), Decrypt.decrypt("ODJzZmpseGVhbXVndHF2eXZwZWp5YnhzaHBpeXl6Z21xbGhweXpzbmVtdG95dmx0YWNxaQ==")));
                        switchOnThis = "੦໐૦೦໐๐၀ჿዐ౦၀о๐ዐℴ၀օℴዐ০૦ℴ๐ዐ੦ｏ〇ℴ໐ჿჿօჿ໐〇ℴ";
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
        String switchOnThis = "ჿ๐օо೦ｏⲟ೦ዐ০૦၀০ዐℴ௦౦೦ዐ੦๐ｏჿዐ૦೦〇੦๐೦০௦ｏо౦ⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 173, 446, 453, 453, 285, 166, 663, 229, 278, 236, 173, 229, 425, 460, 432, 138, 418, 649, 635, 586, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿ๐օо೦ｏⲟ೦ዐ০૦၀০ዐℴ௦౦೦ዐ੦๐ｏჿዐ૦೦〇੦๐೦০௦ｏо౦ⲟ":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
                        switchOnThis = "੦ｏჿ၀੦໐೦оዐ೦੦ｏჿዐℴ੦০оዐ੦၀౦օዐ੦૦௦ჿ๐၀೦௦ⲟ௦о๐";
                    } else {
                        noteInput = root.findViewById(R.id.notes_dialog_text);
                        switchOnThis = "ჿℴ০օჿ೦ჿ૦ዐ੦〇૦ｏዐℴ௦о೦ዐ੦ｏ௦੦ዐ๐ｏ၀๐০ｏ੦၀၀౦০౦";
                    }
                    break;
                case "੦ｏჿ၀੦໐೦оዐ೦੦ｏჿዐℴ੦০оዐ੦၀౦օዐ੦૦௦ჿ๐၀೦௦ⲟ௦о๐":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setView(root).setPositiveButton(R.string.done, ((dialog, i) -> {
                            note.setNote(noteInput.getText().toString());
                            viewModel.editNote(note);
                        })).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "၀ｏ౦೦૦๐օჿዐ၀ⲟ၀੦ዐℴօоｏዐ੦೦ℴ๐ዐ೦ჿｏⲟℴ၀૦〇๐౦౦о";
                    } else {
                        noteInput = root.findViewById(R.id.notes_dialog_text);
                        switchOnThis = "௦౦๐௦౦೦౦੦ዐℴ〇〇௦ዐℴ〇૦၀ዐ০о೦ｏዐ೦ⲟօｏჿ௦೦ｏ০໐೦ℴ";
                    }
                    break;
                case "௦౦๐௦౦೦౦੦ዐℴ〇〇௦ዐℴ〇૦၀ዐ০о೦ｏዐ೦ⲟօｏჿ௦೦ｏ০໐೦ℴ":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        noteInput.setText(note.getNote());
                        switchOnThis = "ｏ૦ｏ੦੦๐ⲟ০ዐօｏⲟօዐℴჿօ၀ዐ੦੦੦օዐჿ૦ｏℴ੦օօ౦ⲟ๐օ೦";
                    } else {
                        root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
                        switchOnThis = "௦௦օ૦૦๐ｏⲟዐჿо၀ⲟዐℴ೦ｏ௦ዐ૦ჿℴ๐ዐ၀ℴօℴօ౦ⲟⲟჿ೦௦ჿ";
                    }
                    break;
                case "оჿⲟ೦ჿ౦໐〇ዐօо౦੦ዐℴ೦ℴօዐօ০౦໐ዐ௦〇૦௦ჿ০〇၀ჿ၀໐ჿ":
                    noteInput.setText(note.getNote());
                    switchOnThis = "၀๐౦〇૦০๐၀ዐ੦౦ｏ໐ዐℴ૦ｏ০ዐ૦౦૦૦ዐ〇၀੦ℴօℴо໐০ℴ૦ⲟ";
                    break;
                case "ｏ૦ｏ੦੦๐ⲟ০ዐօｏⲟօዐℴჿօ၀ዐ੦੦੦օዐჿ૦ｏℴ੦օօ౦ⲟ๐օ೦":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setView(root).setPositiveButton(R.string.done, ((dialog, i) -> {
                            note.setNote(noteInput.getText().toString());
                            viewModel.editNote(note);
                        })).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "๐ℴ૦၀ჿ〇ⲟօዐօ๐౦оዐℴ〇੦оዐ૦೦ℴоዐօ௦ｏ௦ℴ೦੦๐૦੦০〇";
                    } else {
                        root = getLayoutInflater().inflate(R.layout.enter_note_dialog, null);
                        switchOnThis = "၀໐ｏჿ໐ჿ〇ⲟዐоｏℴｏዐℴⲟ၀૦ዐ੦ｏ〇๐ዐｏℴ০ჿ໐౦ℴо೦ⲟ௦〇";
                    }
                    break;
                case "〇੦ⲟ೦౦೦૦ⲟዐօ੦౦໐ዐℴｏ໐੦ዐ૦๐ｏ੦ዐჿ〇ჿｏօ໐೦໐〇੦〇໐":
                    noteInput = root.findViewById(R.id.notes_dialog_text);
                    switchOnThis = "௦〇௦০〇оｏօዐ૦০೦ｏዐℴօоⲟዐ੦ⲟ০օዐ၀ჿ০૦〇௦օჿℴⲟ〇௦";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    private void showNoteDeleteDialog(RestaurantNote note) {
        String switchOnThis = "౦௦ℴооჿ〇оዐо০໐૦ዐℴ၀ｏօዐ੦૦ℴ〇ዐ౦ｏ໐੦о౦০〇໐ჿ౦੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 47, 47, 488, 103, 453, 236, 628, 628, 572, 278, 495, 222, 488, 558, 75, 579, 194, 306, 446, 558, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦௦ℴооჿ〇оዐо০໐૦ዐℴ၀ｏօዐ੦૦ℴ〇ዐ౦ｏ໐੦о౦০〇໐ჿ౦੦":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setMessage(R.string.delete_item).setPositiveButton(R.string.remove, ((dialog, i) -> viewModel.deleteNote(note))).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "০੦ⲟօ๐౦օჿዐ၀๐໐၀ዐℴ૦೦օዐ૦ｏօ೦ዐоℴ໐〇೦ჿ௦೦೦ჿ০ⲟ";
                    } else {
                        new AlertDialog.Builder(this).setTitle(R.string.notes).setMessage(R.string.delete_item).setPositiveButton(R.string.remove, ((dialog, i) -> viewModel.deleteNote(note))).setNegativeButton(R.string.cancel, (dialog, i) -> dialog.cancel()).show();
                        switchOnThis = "০оℴ໐౦ჿ౦ℴዐ੦о০໐ዐℴ੦౦೦ዐօօ૦૦ዐ೦໐೦੦ⲟ૦ｏ၀ｏо໐௦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }
}
