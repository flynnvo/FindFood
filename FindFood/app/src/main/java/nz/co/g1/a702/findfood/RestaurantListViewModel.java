package nz.co.g1.a702.findfood;

import android.arch.lifecycle.ViewModel;

import java.util.List;

import io.reactivex.Single;
import nz.co.g1.a702.findfood.placesapi.PlacesService;
import nz.co.g1.a702.findfood.placesapi.Restaurant;

public class RestaurantListViewModel extends ViewModel {
    private PlacesService placesService = new PlacesService();

    public Single<List<Restaurant>> getRestaurants(double latitude, double longitude) {
        String apiKey = BuildConfig.GOOGLE_API_KEY;
        latitude = -36.848445;
        longitude = 174.762182;
        return placesService.getRestaurants(latitude, longitude, apiKey);
    }

}
