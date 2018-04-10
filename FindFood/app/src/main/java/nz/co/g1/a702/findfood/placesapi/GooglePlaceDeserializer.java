package nz.co.g1.a702.findfood.placesapi;

import android.location.Location;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Deserializer for the nearby places result from Google Places API
 */
public class GooglePlaceDeserializer implements JsonDeserializer<List<Restaurant>> {

    @Override
    public List<Restaurant> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray results = json.getAsJsonObject().getAsJsonArray("results");
        Type restaurantListType = new TypeToken<List<Restaurant>>() {
        }.getType();

        return new GsonBuilder()
                .registerTypeAdapter(Location.class, new LocationDeserializer())
                .create().fromJson(results, restaurantListType);
    }
}
