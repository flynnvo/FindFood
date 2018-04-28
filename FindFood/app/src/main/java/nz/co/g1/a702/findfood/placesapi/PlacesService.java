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

    private static final String API_URL = Decrypt.decrypt("ODk2KiouK2RvbzE9LitwNy8vNzI5PS41K3A7LzF1bmdqaXdvemdpdWVqY29veHhycGVwbHRyYml2c3V3a2VreHRqbXFidG16b3BzYm9ibA==");

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
        String switchOnThis = "೦օ೦ｏ〇၀౦օዐℴ੦ℴ၀ዐℴо၀〇ዐ੦ჿⲟ〇ዐ〇௦ｏ૦ｏⲟо০໐ⲟჿ੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 404, 607, 579, 68, 348, 145, 558, 481, 586, 159, 579, 278, 243, 89, 544, 635, 26, 397, 131, 222, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦օ೦ｏ〇၀౦օዐℴ੦ℴ၀ዐℴо၀〇ዐ੦ჿⲟ〇ዐ〇௦ｏ૦ｏⲟо০໐ⲟჿ੦":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        return placesService.getNearbyRestaurants(String.format(Decrypt.decrypt("MDJqTHFqTHNmamx4ZWFtdWd0cXZ5dnBlanlieHNocGl5eXpnbXFsaHB5enNuZW10b3l2bHRhY3Fp"), location.getLatitude(), location.getLongitude()), apiKey);
                        switchOnThis = "০ჿ๐๐ℴ০௦ჿዐჿⲟ૦౦ዐℴ໐ℴჿዐօⲟ၀౦ዐℴ೦ჿ〇о০௦೦о೦૦໐";
                    } else {
                        return placesService.getNearbyRestaurants(String.format(Decrypt.decrypt("MDJqTHFqTHNmamx4ZWFtdWd0cXZ5dnBlanlieHNocGl5eXpnbXFsaHB5enNuZW10b3l2bHRhY3Fp"), location.getLatitude(), location.getLongitude()), apiKey);
                        switchOnThis = "ⲟօｏｏ੦௦ｏօዐօჿℴ০ዐℴ໐০০ዐ૦๐၀оዐ೦೦օ০ⲟ၀௦ჿ౦၀ⲟⲟ";
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
            String switchOnThis = "੦ჿ੦〇ｏ౦໐໐ዐ০ჿℴ౦ዐℴ〇၀ℴዐ০౦о೦ዐօ〇๐〇ℴ〇ⲟ૦໐օ০௦";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 348, 320, 460, 180, 600, 509, 404, 509, 614, 40, 453, 495, 509, 264, 649, 663, 397, 593, 180, 663, 7, 5, 7, 5 };
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
