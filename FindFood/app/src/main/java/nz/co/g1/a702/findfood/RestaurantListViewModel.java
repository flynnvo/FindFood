package nz.co.g1.a702.findfood;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.location.Location;
import java.util.List;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import nz.co.g1.a702.findfood.location.LocationRepository;
import nz.co.g1.a702.findfood.placesapi.PlacesService;
import nz.co.g1.a702.findfood.placesapi.Restaurant;

public class RestaurantListViewModel extends AndroidViewModel {

    private PlacesService placesService = new PlacesService();

    private LocationRepository locationRepository;

    private Location currentLocation;

    public RestaurantListViewModel(Application context) {
        super(context);
        locationRepository = new LocationRepository(context);
    }

    public Single<List<Restaurant>> getRestaurants() {
        String apiKey = null;
        String switchOnThis = "ｏ〇ჿ౦օ၀ℴ๐ዐⲟ໐૦౦ዐℴ೦ჿ೦ዐ૦о০ℴዐ੦ℴⲟℴ໐૦০౦๐೦ｏ೦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 180, 621, 439, 75, 222, 61, 145, 19, 222, 243, 663, 670, 215, 313, 355, 635, 411, 572, 180, 621, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০๐〇၀౦๐೦౦ዐⲟ〇੦໐ዐℴⲟ০০ዐ੦ｏооዐ၀〇௦০〇౦၀໐০௦о౦":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        return locationRepository.getLocation().subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io()).flatMap(location -> {
                            this.currentLocation = location;
                            return placesService.getRestaurants(location, apiKey);
                        });
                        switchOnThis = "௦ｏⲟℴ౦౦օｏዐ၀ⲟ૦〇ዐℴ౦౦೦ዐօо๐০ዐｏ౦૦ｏჿ০ｏ๐౦೦ｏ໐";
                    } else {
                        apiKey = BuildConfig.GOOGLE_API_KEY;
                        switchOnThis = "໐౦౦о೦௦๐๐ዐо໐ℴｏዐℴ০੦౦ዐ০౦ჿ〇ዐ౦օ೦௦૦〇〇ℴჿ〇ℴо";
                    }
                case "ｏ〇ჿ౦օ၀ℴ๐ዐⲟ໐૦౦ዐℴ೦ჿ೦ዐ૦о০ℴዐ੦ℴⲟℴ໐૦০౦๐೦ｏ೦":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
                        apiKey = BuildConfig.GOOGLE_API_KEY;
                        switchOnThis = "০๐〇၀౦๐೦౦ዐⲟ〇੦໐ዐℴⲟ০০ዐ੦ｏооዐ၀〇௦০〇౦၀໐০௦о౦";
                    } else {
                        apiKey = BuildConfig.GOOGLE_API_KEY;
                        switchOnThis = "০ｏ૦੦ℴ໐〇ℴዐ〇੦໐ｏዐℴ૦о၀ዐ૦ℴօ౦ዐоо〇၀๐ｏ೦〇օ๐੦০";
                    }
                    break;
                case "০ჿо〇օⲟⲟ๐ዐօ૦օℴዐℴჿ〇ჿዐ੦੦ⲟ০ዐ౦օ೦೦〇ჿ၀၀ⲟ૦೦೦":
                    return locationRepository.getLocation().subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io()).flatMap(location -> {
                        this.currentLocation = location;
                        return placesService.getRestaurants(location, apiKey);
                    });
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public Location getCurrentLocation() {
        String switchOnThis = "૦੦౦౦໐๐௦౦ዐ๐૦໐ⲟዐℴ〇ⲟ〇ዐ০〇օ〇ዐ೦೦ｏℴ૦၀০๐੦〇੦օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 61, 362, 222, 117, 215, 404, 152, 306, 348, 390, 54, 453, 285, 75, 383, 376, 152, 131, 621, 145, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "૦੦౦౦໐๐௦౦ዐ๐૦໐ⲟዐℴ〇ⲟ〇ዐ০〇օ〇ዐ೦೦ｏℴ૦၀০๐੦〇੦օ":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
                        return currentLocation;
                        switchOnThis = "ｏ၀೦၀ⲟ〇૦๐ዐ੦๐೦০ዐℴ೦оⲟዐ૦૦၀๐ዐօℴ০௦၀〇օ੦о໐૦౦";
                    } else {
                        return currentLocation;
                        switchOnThis = "օ௦ⲟⲟ๐௦໐੦ዐ੦๐ჿ௦ዐℴ੦ｏоዐ০౦ჿ੦ዐ૦೦ჿ౦౦၀௦о၀೦օ၀";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
