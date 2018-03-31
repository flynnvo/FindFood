package nz.co.g1.a702.findfood.placesapi;

import com.google.gson.annotations.SerializedName;

public class Restaurant {
    private Geometry geometry;
    private String name;
    @SerializedName("place_id")
    private String placeId;
    @SerializedName("price_level")
    private int priceLevel;
    @SerializedName("vicinity")
    private String address;
    @SerializedName("permanently_closed")
    private boolean closed;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public int getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(int priceLevel) {
        this.priceLevel = priceLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public class Geometry {
        private Location location;

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }
    }

    public class Location {
        @SerializedName("lat")
        private double latitude;
        @SerializedName("lng")
        private double longitude;

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    }
}
