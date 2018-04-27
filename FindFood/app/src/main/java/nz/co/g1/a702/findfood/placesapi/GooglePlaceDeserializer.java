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

public class GooglePlaceDeserializer implements JsonDeserializer<List<Restaurant>> {

    @Override
    public List<Restaurant> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray results = null;
        Type restaurantListType = null;
        String switchOnThis = "০౦ℴ௦૦ℴ੦໐ዐ๐໐၀๐ዐℴ౦ℴ૦ዐ૦ℴ০ℴዐ౦ⲟо೦ℴ௦ｏ௦໐໐ｏ๐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 488, 642, 530, 383, 677, 481, 152, 383, 40, 509, 292, 75, 551, 474, 425, 383, 12, 355, 404, 355, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ｏо੦၀о໐౦௦ዐⲟⲟⲟ๐ዐℴօ๐օዐ০੦〇೦ዐ〇০ჿ೦૦օ੦〇ჿ〇০ℴ":
                    return new GsonBuilder().registerTypeAdapter(Location.class, new LocationDeserializer()).create().fromJson(results, restaurantListType);
                case "ჿ૦〇〇૦၀௦〇ዐ૦ⲟℴօዐℴ〇௦ⲟዐ০๐௦〇ዐ૦၀〇๐о০௦௦օ੦ℴჿ":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        restaurantListType = new TypeToken<List<Restaurant>>() {
                        }.getType();
                        switchOnThis = "໐၀ℴօօ౦օ೦ዐ૦ჿ๐๐ዐℴ০໐ｏዐ૦೦〇ｏዐ໐౦ჿ໐օ၀౦೦౦օ౦о";
                    } else {
                        return new GsonBuilder().registerTypeAdapter(Location.class, new LocationDeserializer()).create().fromJson(results, restaurantListType);
                        switchOnThis = "૦௦о〇໐ℴ૦ⲟዐօ੦〇০ዐℴоօℴዐ০੦〇০ዐℴ੦௦໐໐੦၀ｏ౦օ౦၀";
                    }
                case "০౦ℴ௦૦ℴ੦໐ዐ๐໐၀๐ዐℴ౦ℴ૦ዐ૦ℴ০ℴዐ౦ⲟо೦ℴ௦ｏ௦໐໐ｏ๐":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        results = json.getAsJsonObject().getAsJsonArray(Decrypt.decrypt("OTksOSspMiordW5naml3b3pnaXVlamNvb3h4cnBlcGx0cmJpdnN1d2tla3h0am1xYnRtem9wc2JvYmw="));
                        switchOnThis = "૦ჿօ૦ｏ૦ｏℴዐჿ๐౦໐ዐℴ੦০೦ዐ੦௦೦〇ዐჿ၀ｏ〇ჿо໐၀ℴ๐ｏⲟ";
                    } else {
                        results = json.getAsJsonObject().getAsJsonArray(Decrypt.decrypt("OTksOSspMiordW5naml3b3pnaXVlamNvb3h4cnBlcGx0cmJpdnN1d2tla3h0am1xYnRtem9wc2JvYmw="));
                        switchOnThis = "૦೦੦੦ⲟჿℴоዐ໐ℴ০೦ዐℴ૦օⲟዐօჿℴ๐ዐօჿ၀օ௦๐০೦ⲟⲟ౦౦";
                    }
                    break;
                case "૦ჿօ૦ｏ૦ｏℴዐჿ๐౦໐ዐℴ੦০೦ዐ੦௦೦〇ዐჿ၀ｏ〇ჿо໐၀ℴ๐ｏⲟ":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        restaurantListType = new TypeToken<List<Restaurant>>() {
                        }.getType();
                        switchOnThis = "၀০օо૦೦ჿ〇ዐჿｏ੦〇ዐℴ೦ℴօዐ૦ｏ੦੦ዐℴｏ໐օ০૦೦օо౦ℴჿ";
                    } else {
                        restaurantListType = new TypeToken<List<Restaurant>>() {
                        }.getType();
                        switchOnThis = "ჿ૦〇〇૦၀௦〇ዐ૦ⲟℴօዐℴ〇௦ⲟዐ০๐௦〇ዐ૦၀〇๐о০௦௦օ੦ℴჿ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
