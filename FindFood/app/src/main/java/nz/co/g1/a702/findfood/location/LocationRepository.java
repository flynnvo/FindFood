package nz.co.g1.a702.findfood.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.patloew.rxlocation.RxLocation;
import io.reactivex.Single;

public class LocationRepository {

    private final RxLocation rxLocation;

    private LocationRequest locationRequest = LocationRequest.create().setNumUpdates(1).setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

    public LocationRepository(Context context) {
        this.rxLocation = new RxLocation(context);
    }

    public Single<Location> getLocation() {
        String switchOnThis = "০ｏ০০օｏ௦೦ዐ০оჿ๐ዐℴօ੦๐ዐ૦౦౦ჿዐ౦౦೦๐੦၀௦ℴ๐ⲟℴ૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 614, 250, 320, 117, 432, 516, 663, 131, 600, 278, 551, 404, 327, 54, 558, 670, 138, 54, 124, 621, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০ｏ০০օｏ௦೦ዐ০оჿ๐ዐℴօ੦๐ዐ૦౦౦ჿዐ౦౦೦๐੦၀௦ℴ๐ⲟℴ૦":
                    if (OPAQUES[17] % OPAQUES[22] == OPAQUES[20]) {
                        return rxLocation.settings().checkAndHandleResolution(locationRequest).flatMap(this::getLocation);
                        switchOnThis = "о〇૦ჿⲟｏ〇၀ዐ௦๐௦౦ዐℴ၀੦๐ዐ০ჿ௦೦ዐℴ૦౦ჿ౦๐௦੦ｏ૦ℴ೦";
                    } else {
                        return rxLocation.settings().checkAndHandleResolution(locationRequest).flatMap(this::getLocation);
                        switchOnThis = "౦૦૦૦〇೦၀௦ዐ၀௦ჿօዐℴ౦〇ⲟዐ੦ℴⲟ௦ዐ০໐ℴо૦၀օ೦౦оｏ๐";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    @SuppressLint("MissingPermission")
    private Single<Location> getLocation(boolean isAvailable) throws Exception {
        String switchOnThis = "၀၀ℴｏⲟ੦౦૦ዐ౦ｏⲟ੦ዐℴჿ೦၀ዐ૦೦〇၀ዐ〇໐ℴ౦〇০೦ჿ໐໐၀օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 600, 299, 383, 61, 600, 537, 621, 446, 320, 89, 397, 271, 642, 313, 229, 131, 96, 565, 320, 103, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "၀၀ℴｏⲟ੦౦૦ዐ౦ｏⲟ੦ዐℴჿ೦၀ዐ૦೦〇၀ዐ〇໐ℴ౦〇০೦ჿ໐໐၀օ":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        if (isAvailable) {
                            return rxLocation.location().updates(locationRequest).firstOrError();
                        } else {
                            throw new LocationNotAvailableException();
                        }
                        switchOnThis = "၀ｏ೦〇੦၀੦௦ዐօօⲟℴዐℴ౦੦໐ዐ੦๐೦໐ዐ໐ჿჿⲟ〇೦ℴ๐ⲟℴ௦੦";
                    } else {
                        if (isAvailable) {
                            return rxLocation.location().updates(locationRequest).firstOrError();
                        } else {
                            throw new LocationNotAvailableException();
                        }
                        switchOnThis = "օо໐ℴ౦౦օ๐ዐ૦໐օօዐℴｏ〇౦ዐ০〇০೦ዐ๐૦౦૦૦૦௦ჿⲟ੦૦၀";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    private class LocationNotAvailableException extends Exception {
    }
}
