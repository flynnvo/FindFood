package nz.co.g1.a702.findfood.placesapi;

import android.annotation.SuppressLint;

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

public final class PlacesService {
    private static final String API_URL = "https://maps.googleapis.com";
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

    @SuppressLint("DefaultLocale")
    public Single<List<Restaurant>> getRestaurants(Double latitude, Double longitude, String apiKey) {
        return placesService.getNearbyRestaurants(String.format("%f,%f", latitude, longitude), apiKey);
    }

    public interface GooglePlaces {
        @GET("maps/api/place/nearbysearch/json?radius=1000&type=restaurant")
        Single<List<Restaurant>> getNearbyRestaurants(
                @Query("location") String latitude,
                @Query("key") String apiKey

        );
    }
}
