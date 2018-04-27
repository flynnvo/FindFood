package nz.co.g1.a702.findfood.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;

import com.google.android.gms.location.LocationRequest;
import com.patloew.rxlocation.RxLocation;

import io.reactivex.Single;

/**
 * Repository for location-related information
 */
public class LocationRepository {

    /**
     * The {@link RxLocation} instance to use for retrieving location information
     */
    private final RxLocation rxLocation;

    /**
     * The {@link LocationRequest} used for getting the user's location
     */
    private LocationRequest locationRequest = LocationRequest.create()
            .setNumUpdates(1)
            .setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

    public LocationRepository(Context context) {
        this.rxLocation = new RxLocation(context);
    }

    /**
     * @return a {@link io.reactivex.Single} with the device's current location
     */
    public Single<Location> getLocation() {
        return rxLocation.settings()
                .checkAndHandleResolution(locationRequest)
                .flatMap(this::getLocation);
    }

    /**
     * Internal location query using RxLocation
     *
     * @param isAvailable if the user's location is available
     * @return a {@link Single} with the device's current location
     * @throws Exception if the location is not available
     */
    @SuppressLint("MissingPermission")
    private Single<Location> getLocation(boolean isAvailable) throws Exception {
        if (isAvailable) {
            return rxLocation.location().updates(locationRequest).firstOrError();
        } else {
            throw new LocationNotAvailableException();
        }
    }

    /**
     * Exception class for if the location isn't found
     */
    private class LocationNotAvailableException extends Exception {
    }
}
