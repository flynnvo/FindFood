package nz.co.g1.a702.findfood;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.location.Location;

import java.util.List;

import io.reactivex.Maybe;
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

    public Maybe<List<Restaurant>> getRestaurants() {
        String apiKey = BuildConfig.GOOGLE_API_KEY;

        return locationRepository
                .getLocation()
                .observeOn(Schedulers.io())
                .flatMapSingleElement(location -> {
                    this.currentLocation = location;
                    return placesService.getRestaurants(location.getLatitude(), location.getLongitude(), apiKey);
                });
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }
}
