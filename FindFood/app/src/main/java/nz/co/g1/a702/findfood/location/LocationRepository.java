package nz.co.g1.a702.findfood.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;

/**
 * Repository for location-related information
 */
public class LocationRepository {

    /**
     * The {@link LocationManager} instance to use for retrieving location information
     */
    private final LocationManager locationManager;

    public LocationRepository(Context context) {
        this.locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    }

    /**
     * @return a {@link Single} with the device's current location
     */
    @SuppressLint("MissingPermission")
    public Single<Location> getLocation() {
        boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        boolean networkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        return Single.create(emitter -> {
            Location location;
            if (gpsEnabled) {
                location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                if (location == null) {
                    locationManager.requestSingleUpdate(LocationManager.GPS_PROVIDER, new EmitterLocationListener(emitter), null);
                } else {
                    emitter.onSuccess(location);
                }
            } else if (networkEnabled) {
                location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                if (location == null) {
                    locationManager.requestSingleUpdate(LocationManager.NETWORK_PROVIDER, new EmitterLocationListener(emitter), null);
                } else {
                    emitter.onSuccess(location);
                }
            } else {
                throw new LocationNotAvailableException();
            }
        });
    }

    /**
     * Listener for location requests that emits the location
     * to a given {@link SingleEmitter}
     */
    private class EmitterLocationListener implements LocationListener {

        /**
         * The {@link SingleEmitter} to emit location updates to
         */
        private final SingleEmitter<Location> locationEmitter;

        EmitterLocationListener(SingleEmitter<Location> locationEmitter) {
            this.locationEmitter = locationEmitter;
        }

        @Override
        public void onLocationChanged(Location location) {
            locationEmitter.onSuccess(location);
        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {

        }

        @Override
        public void onProviderDisabled(String s) {

        }
    }

    /**
     * Exception class for if the location isn't found
     */
    private class LocationNotAvailableException extends Exception {}
}
