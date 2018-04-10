package nz.co.g1.a702.findfood.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;

import com.google.android.gms.location.LocationRequest;
import com.patloew.rxlocation.RxLocation;

import io.reactivex.Maybe;

/**
 * Repository for location-related information
 */
public class LocationRepository {

    /**
     * The {@link RxLocation} instance to use for retrieving location information
     */
    private final RxLocation rxLocation;

    public LocationRepository(Context context) {
        this.rxLocation = new RxLocation(context);
    }

    /**
     * @return a {@link Maybe} with the device's current location
     */
    @SuppressLint("MissingPermission")
    public Maybe<Location> getLocation() {
        LocationRequest request = LocationRequest.create()
                .setNumUpdates(1)
                .setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        return rxLocation.location().updates(request).firstElement();
    }

}
