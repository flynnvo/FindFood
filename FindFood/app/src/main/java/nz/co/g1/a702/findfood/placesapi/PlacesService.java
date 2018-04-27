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

public final class PlacesService {

    private static final String API_URL = Decrypt.decrypt("NDhyZGR6YzovL3dremMucXl5cXZva3pzYy5teXdlZHJ1cHpoZnNuZ3hlcWhmcXJjZHNhdGR2bGtoYXNldnZxcHF3dGR6emRvdXpzemR4dw==");

    private GooglePlaces placesService;

    public PlacesService() {
        Type restaurantListType = new TypeToken<List<Restaurant>>() {
        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(restaurantListType, new GooglePlaceDeserializer()).create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API_URL).addConverterFactory(GsonConverterFactory.create(gson)).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        this.placesService = retrofit.create(GooglePlaces.class);
    }

    @SuppressLint("DefaultLocale")
    public Single<List<Restaurant>> getRestaurants(Location location, String apiKey) {
        String switchOnThis = "౦ⲟ౦〇௦〇ｏｏዐ૦ⲟℴ௦ዐℴ੦〇оዐօօⲟℴዐо໐ℴ೦੦ｏｏ૦ℴ੦օ੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 551, 607, 306, 341, 579, 586, 236, 82, 579, 19, 299, 656, 649, 40, 250, 82, 222, 397, 593, 404, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦ⲟ౦〇௦〇ｏｏዐ૦ⲟℴ௦ዐℴ੦〇оዐօօⲟℴዐо໐ℴ೦੦ｏｏ૦ℴ੦օ੦":
                    if (OPAQUES[7] % OPAQUES[22] == OPAQUES[20]) {
                        return placesService.getNearbyRestaurants(String.format(Decrypt.decrypt("NzElaSwleGRzb3Rmb3FteW9vd3ZlYnJ0aHJuZnpzc25xaWZmYXdibGFmZ3NwdHRjaGlkbWxoaHFp"), location.getLatitude(), location.getLongitude()), apiKey);
                        switchOnThis = "௦〇၀ჿ೦౦০ⲟዐ০ჿ૦০ዐℴ౦૦০ዐօ૦ჿ၀ዐ໐ჿ০೦ⲟ໐ℴо౦໐օ੦";
                    } else {
                        return placesService.getNearbyRestaurants(String.format(Decrypt.decrypt("NzElaSwleGRzb3Rmb3FteW9vd3ZlYnJ0aHJuZnpzc25xaWZmYXdibGFmZ3NwdHRjaGlkbWxoaHFp"), location.getLatitude(), location.getLongitude()), apiKey);
                        switchOnThis = "օℴ໐ჿ๐௦೦ℴዐⲟℴｏ౦ዐℴჿо〇ዐ੦օ๐੦ዐо໐ℴჿｏჿо๐ⲟ૦၀౦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public interface GooglePlaces {

        @GET("maps/api/place/nearbysearch/json?type=restaurant&rankby=distance")
        Single<List<Restaurant>> getNearbyRestaurants(@Query("location") String location, @Query("key") String apiKey) {
            String switchOnThis = "໐૦೦೦๐о໐໐ዐ௦օ౦౦ዐℴ০૦〇ዐ੦ჿ૦೦ዐ๐০๐၀ℴჿ੦໐໐၀оჿ";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 40, 285, 397, 96, 320, 145, 12, 509, 677, 26, 502, 488, 117, 166, 656, 334, 516, 208, 285, 33, 7, 5, 7, 5 };
            while (infiniteLoop) {
                switch(switchOnThis) {
                    default:
                        infiniteLoop = false;
                }
            }
            return null;
        }
    }
}
