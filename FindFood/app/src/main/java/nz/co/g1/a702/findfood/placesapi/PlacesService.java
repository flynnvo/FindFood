package nz.co.g1.a702.findfood.placesapi;

import android.annotation.SuppressLint;
import android.location.Location;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Service for making requests to the Google Places API
 */
public final class PlacesService {

    /**
     * Base URL for the API
     */
    private static final String API_URL = "https://maps.googleapis.com";

    /**
     * The {@link Retrofit} service to make API calls to
     */
    private GooglePlaces placesService;

    public PlacesService() {
        Type restaurantListType = new TypeToken<List<Restaurant>>() {
        }.getType();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(restaurantListType, new GooglePlaceDeserializer())
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        this.placesService = retrofit.create(GooglePlaces.class);
    }

    /**
     * Retrieves all nearby restaurants
     *
     * @param location the location to find nearby restaurants from
     * @param apiKey   the Google Places API key to use
     * @return a {@link Single} to access the nearby restaurants from
     */
    @SuppressLint("DefaultLocale")
    public Single<List<Restaurant>> getRestaurants(Location location, String apiKey) {
        return placesService.getNearbyRestaurants(String.format("%f,%f", location.getLatitude(), location.getLongitude()), apiKey);
    }

    /**
     * The {@link Retrofit} service to make API calls to
     */
    public interface GooglePlaces {

        /**
         * API Call for retrieving all nearby restaurants
         *
         * @param location the location to find nearby restaurants from "lat,long"
         * @param apiKey   the Google Places API key to use
         * @return a {@link Single} to access the nearby restaurants from
         */
        @GET("maps/api/place/nearbysearch/json?type=restaurant&rankby=distance")
        Single<List<Restaurant>> getNearbyRestaurants(
                @Query("location") String location,
                @Query("key") String apiKey

        );
    }
}
