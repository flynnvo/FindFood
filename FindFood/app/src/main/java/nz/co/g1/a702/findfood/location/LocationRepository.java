package nz.co.g1.a702.findfood.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;

import com.patloew.rxlocation.RxLocation;

import io.reactivex.Maybe;

public class LocationRepository {

    private final RxLocation rxLocation;

    public LocationRepository(Context context) {
        this.rxLocation = new RxLocation(context);
    }

    @SuppressLint("MissingPermission")
    public Maybe<Location> getLocation() {
        return rxLocation.location().lastLocation();
    }

}
