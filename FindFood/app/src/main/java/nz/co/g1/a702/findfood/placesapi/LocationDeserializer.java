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
        JsonObject jsonObject = null;
        Location location = null;
        String switchOnThis = "〇оჿ௦ჿоჿ໐ዐ௦〇օ௦ዐℴ๐၀၀ዐօ૦౦౦ዐⲟℴⲟჿ၀ჿ૦๐ℴօ૦໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 593, 593, 250, 516, 278, 26, 383, 47, 82, 677, 502, 26, 89, 166, 481, 68, 572, 614, 439, 292, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "〇оჿ௦ჿоჿ໐ዐ௦〇օ௦ዐℴ๐၀၀ዐօ૦౦౦ዐⲟℴⲟჿ၀ჿ૦๐ℴօ૦໐":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        jsonObject = json.getAsJsonObject();
                        switchOnThis = "০໐೦ⲟ০၀〇໐ዐ૦ｏ๐оዐℴ〇౦၀ዐ૦૦໐๐ዐ໐ｏ೦၀ჿ০০ⲟ၀০ჿ௦";
                    } else {
                        location = new Location("Provider");
                        switchOnThis = "〇〇௦օ૦ჿｏ੦ዐ၀ჿо၀ዐℴо໐౦ዐ০০၀೦ዐ௦০၀੦оⲟჿ໐ℴ၀੦ｏ";
                    }
                    break;
                case "০௦օ੦੦〇০૦ዐⲟ੦〇〇ዐℴ௦੦౦ዐ০〇૦〇ዐ૦௦ℴ໐๐೦০೦໐ｏ೦о":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        return location;
                        switchOnThis = "০ჿ၀໐০๐౦௦ዐ௦оℴ໐ዐℴ૦ჿ௦ዐօ০౦௦ዐ০၀੦০ｏ০օօ૦๐০օ";
                    } else {
                        return location;
                        switchOnThis = "੦၀ℴ૦๐оⲟჿዐჿჿ௦օዐℴ໐օ૦ዐ੦೦๐ჿዐ૦౦ℴ௦ჿ〇о০ℴ၀໐〇";
                    }
                case "০໐೦ⲟ০၀〇໐ዐ૦ｏ๐оዐℴ〇౦၀ዐ૦૦໐๐ዐ໐ｏ೦၀ჿ০০ⲟ၀০ჿ௦":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        return location;
                        switchOnThis = "ⲟ௦оℴｏ੦০๐ዐ၀о〇໐ዐℴо〇ｏዐ૦๐௦ჿዐօоℴ౦௦ℴ๐௦০๐ｏ໐";
                    } else {
                        location = new Location("Provider");
                        switchOnThis = "〇೦〇೦ℴоℴоዐ၀ჿ೦ჿዐℴ௦օ໐ዐ૦ℴⲟჿዐⲟ০০૦૦౦೦೦〇૦օ๐";
                    }
                    break;
                case "໐ｏ౦௦೦๐౦ჿዐ๐〇ｏ੦ዐℴ௦০օዐ০૦೦০ዐօｏ๐ჿ〇૦௦๐ｏჿ〇໐":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        location.setLongitude(jsonObject.get("lng").getAsFloat());
                        switchOnThis = "০௦օ੦੦〇০૦ዐⲟ੦〇〇ዐℴ௦੦౦ዐ০〇૦〇ዐ૦௦ℴ໐๐೦০೦໐ｏ೦о";
                    } else {
                        jsonObject = json.getAsJsonObject();
                        switchOnThis = "০໐ⲟ๐૦೦০೦ዐ૦০၀০ዐℴⲟоｏዐ੦০௦ⲟዐ໐ჿჿоｏ௦о〇੦๐౦౦";
                    }
                    break;
                case "੦௦ჿჿ၀〇০೦ዐ〇ⲟ໐၀ዐℴ໐໐೦ዐօօ০௦ዐ๐๐၀౦০ჿ০〇০〇০о":
                    location.setLongitude(jsonObject.get("lng").getAsFloat());
                    switchOnThis = "๐ｏ〇૦๐၀о၀ዐℴ੦໐໐ዐℴ੦〇оዐ੦೦օ౦ዐ〇ℴо๐੦၀౦০оⲟ໐ｏ";
                    break;
                case "〇೦〇೦ℴоℴоዐ၀ჿ೦ჿዐℴ௦օ໐ዐ૦ℴⲟჿዐⲟ০০૦૦౦೦೦〇૦օ๐":
                    if (OPAQUES[9] % OPAQUES[22] != OPAQUES[20]) {
                        location.setLatitude(jsonObject.get("lat").getAsFloat());
                        switchOnThis = "໐ｏ౦௦೦๐౦ჿዐ๐〇ｏ੦ዐℴ௦০օዐ০૦೦০ዐօｏ๐ჿ〇૦௦๐ｏჿ〇໐";
                    } else {
                        location = new Location("Provider");
                        switchOnThis = "౦௦ⲟооօоჿዐℴ໐ⲟⲟዐℴｏჿ௦ዐօ੦০௦ዐ௦ჿ၀๐〇੦ⲟｏ໐ｏ໐о";
                    }
                    break;
                case "૦ооჿｏჿ੦၀ዐо০օ౦ዐℴօ௦০ዐ੦ｏჿ௦ዐ〇о౦о၀о౦〇૦੦౦ℴ":
                    return location;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
