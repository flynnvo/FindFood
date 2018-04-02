package nz.co.g1.a702.findfood.placesapi;

import android.location.Location;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;


public class LocationDeserializer implements JsonDeserializer<Location> {

    @Override
    public Location deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Location location = new Location("Provider");
        location.setLatitude(jsonObject.get("lat").getAsFloat());
        location.setLongitude(jsonObject.get("lng").getAsFloat());
        return location;
    }
}
