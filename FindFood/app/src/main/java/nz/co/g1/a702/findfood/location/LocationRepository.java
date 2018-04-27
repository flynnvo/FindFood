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
        String switchOnThis = "๐೦ｏｏ〇оｏ๐ዐ૦ｏ૦၀ዐℴ૦໐〇ዐ૦〇০оዐ〇ⲟоｏ೦੦๐௦ℴօⲟ௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 537, 551, 523, 250, 649, 628, 215, 334, 292, 565, 124, 110, 446, 600, 313, 502, 61, 369, 551, 355, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐೦ｏｏ〇оｏ๐ዐ૦ｏ૦၀ዐℴ૦໐〇ዐ૦〇০оዐ〇ⲟоｏ೦੦๐௦ℴօⲟ௦":
                    if (OPAQUES[1] % OPAQUES[22] != OPAQUES[20]) {
                        return rxLocation.settings().checkAndHandleResolution(locationRequest).flatMap(this::getLocation);
                        switchOnThis = "ℴ೦〇ⲟ૦ⲟ૦໐ዐ೦੦ჿℴዐℴ၀оℴዐօ೦ⲟ੦ዐ๐оℴｏ၀૦о၀૦၀ℴо";
                    } else {
                        return rxLocation.settings().checkAndHandleResolution(locationRequest).flatMap(this::getLocation);
                        switchOnThis = "၀〇о০๐о০ჿዐ౦೦໐ჿዐℴ౦ⲟ๐ዐ૦໐ⲟჿዐℴ〇๐ჿℴօ໐ⲟ๐౦૦০";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    @SuppressLint("MissingPermission")
    private Single<Location> getLocation(boolean isAvailable) throws Exception {
        String switchOnThis = "০о໐〇௦〇օⲟዐ૦ⲟ๐ჿዐℴ০౦оዐ੦၀〇ℴዐ೦оℴჿ໐೦ℴ௦౦๐໐০";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 362, 369, 642, 306, 628, 376, 474, 509, 348, 47, 481, 460, 201, 68, 124, 180, 523, 222, 635, 12, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০о໐〇௦〇օⲟዐ૦ⲟ๐ჿዐℴ০౦оዐ੦၀〇ℴዐ೦оℴჿ໐೦ℴ௦౦๐໐০":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        if (isAvailable) {
                            return rxLocation.location().updates(locationRequest).firstOrError();
                        } else {
                            throw new LocationNotAvailableException();
                        }
                        switchOnThis = "оⲟ௦օ໐೦၀౦ዐ૦૦੦০ዐℴⲟ੦໐ዐ০օ౦ℴዐｏօ౦ｏ〇ℴჿℴ૦০ჿ౦";
                    } else {
                        if (isAvailable) {
                            return rxLocation.location().updates(locationRequest).firstOrError();
                        } else {
                            throw new LocationNotAvailableException();
                        }
                        switchOnThis = "০০ℴ૦૦೦௦ℴዐｏ੦౦੦ዐℴ၀ჿօዐ০ℴｏ౦ዐ๐ჿ০೦ჿℴⲟ૦ჿℴ๐ℴ";
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
