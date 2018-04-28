package nz.co.g1.a702.findfood.placesapi;

import android.location.Location;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import nz.co.g1.a702.findfood.Decrypt;

import java.lang.reflect.Type;
import java.util.List;

public class GooglePlaceDeserializer implements JsonDeserializer<List<Restaurant>> {

    @Override
    public List<Restaurant> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray results = null;
        Type restaurantListType = null;
        String switchOnThis = "๐౦๐௦੦๐о௦ዐｏ௦௦၀ዐℴℴ౦೦ዐ੦ｏ၀໐ዐ౦օ૦೦о〇೦໐೦໐օ໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 285, 404, 180, 376, 187, 551, 453, 663, 82, 229, 131, 397, 411, 89, 621, 530, 628, 131, 537, 152, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦ჿ၀ⲟჿｏ๐০ዐ၀০၀ｏዐℴ౦ℴｏዐ০೦ｏ௦ዐ০૦૦ⲟ૦೦໐੦໐੦ჿ〇":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantListType = new TypeToken<List<Restaurant>>() {
                        }.getType();
                        switchOnThis = "〇௦೦ｏ੦၀௦ჿዐо౦〇০ዐℴ〇〇၀ዐօჿ೦૦ዐ〇੦၀օჿ၀૦೦೦ⲟ〇໐";
                    } else {
                        results = json.getAsJsonObject().getAsJsonArray(Decrypt.decrypt("ODBneGJ3aWxvbnJoYXZxdWpjbW14bWdvZWx2ZXNsaHhuZmR6YWJ6c3FtYm1tbHJ2cm1oenJpcHRpYXo="));
                        switchOnThis = "૦๐၀ⲟ০ⲟ〇оዐ০๐੦০ዐℴ๐૦௦ዐ০૦〇০ዐоօｏℴⲟｏჿ௦၀о〇০";
                    }
                    break;
                case "〇௦೦ｏ੦၀௦ჿዐо౦〇০ዐℴ〇〇၀ዐօჿ೦૦ዐ〇੦၀օჿ၀૦೦೦ⲟ〇໐":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        return new GsonBuilder().registerTypeAdapter(Location.class, new LocationDeserializer()).create().fromJson(results, restaurantListType);
                    } else {
                        return new GsonBuilder().registerTypeAdapter(Location.class, new LocationDeserializer()).create().fromJson(results, restaurantListType);
                    }
                case "๐౦๐௦੦๐о௦ዐｏ௦௦၀ዐℴℴ౦೦ዐ੦ｏ၀໐ዐ౦օ૦೦о〇೦໐೦໐օ໐":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        results = json.getAsJsonObject().getAsJsonArray(Decrypt.decrypt("ODBneGJ3aWxvbnJoYXZxdWpjbW14bWdvZWx2ZXNsaHhuZmR6YWJ6c3FtYm1tbHJ2cm1oenJpcHRpYXo="));
                        switchOnThis = "ⲟ੦ｏ੦૦〇ｏ০ዐ௦օ౦೦ዐℴ੦௦〇ዐ੦೦၀ℴዐ໐ｏ໐օ૦໐๐〇০౦੦၀";
                    } else {
                        results = json.getAsJsonObject().getAsJsonArray(Decrypt.decrypt("ODBneGJ3aWxvbnJoYXZxdWpjbW14bWdvZWx2ZXNsaHhuZmR6YWJ6c3FtYm1tbHJ2cm1oenJpcHRpYXo="));
                        switchOnThis = "౦ჿ၀ⲟჿｏ๐০ዐ၀০၀ｏዐℴ౦ℴｏዐ০೦ｏ௦ዐ০૦૦ⲟ૦೦໐੦໐੦ჿ〇";
                    }
                    break;
                case "ℴ〇〇౦օ໐໐౦ዐჿ౦০๐ዐℴｏჿ০ዐ੦౦〇ℴዐ၀〇о০օ๐௦о০๐ჿօ":
                    return new GsonBuilder().registerTypeAdapter(Location.class, new LocationDeserializer()).create().fromJson(results, restaurantListType);
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
