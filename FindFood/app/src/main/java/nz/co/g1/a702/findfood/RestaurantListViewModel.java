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

/**
 * ViewModel for the restaurant list
 */
public class RestaurantListViewModel extends AndroidViewModel {

    /**
     * API Service used to retrieve places
     */
    private PlacesService placesService = new PlacesService();

    /**
     * Repository to retrieve location information from
     */
    private LocationRepository locationRepository;

    /**
     * Current device location
     */
    private Location currentLocation;

    public RestaurantListViewModel(Application context) {
        super(context);
        locationRepository = new LocationRepository(context);
    }

    /**
     * Retrieves a list of restaurants by retrieving the device location and using it to
     * call the Google Places API for restaurants near the location
     *
     * @return a {@link Maybe} to retrieve the restaurants list from
     */
    public Maybe<List<Restaurant>> getRestaurants() {
        String apiKey = BuildConfig.GOOGLE_API_KEY;

        return locationRepository
                .getLocation()
                .observeOn(Schedulers.io())
                .flatMapSingleElement(location -> {
                    this.currentLocation = location;
                    return placesService.getRestaurants(location, apiKey);
                });
    }

    /**
     * @return the last loaded location
     */
    public Location getCurrentLocation() {
        return currentLocation;
    }
}
