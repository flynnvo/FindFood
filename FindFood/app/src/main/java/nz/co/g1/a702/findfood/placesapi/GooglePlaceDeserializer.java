package nz.co.g1.a702.findfood.placesapi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;


public class GooglePlaceDeserializer implements JsonDeserializer<List<Restaurant>> {

    @Override
    public List<Restaurant> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray results = json.getAsJsonObject().getAsJsonArray("results");
        Type restaurantListType = new TypeToken<List<Restaurant>>() {
        }.getType();
        return new Gson().fromJson(results, restaurantListType);
    }
}
