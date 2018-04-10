package nz.co.g1.a702.findfood.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;

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
     * @return the last-known device location
     */
    @SuppressLint("MissingPermission")
    public Maybe<Location> getLocation() {
        return rxLocation.location().lastLocation();
    }

}
