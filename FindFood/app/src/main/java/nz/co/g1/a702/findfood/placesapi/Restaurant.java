package nz.co.g1.a702.findfood.placesapi;

import android.location.Location;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import nz.co.g1.a702.findfood.R;

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
    private List<String> types;

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

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Type getType() {
        if (types.contains("bar")) {
            return Type.BAR;
        } else if (types.contains("cafe")) {
            return Type.CAFE;
        } else {
            return Type.RESTAURANT;
        }
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

    public String distanceFrom(Location location) {
        int distance = (int) this.geometry.location.distanceTo(location);
        if (distance >= 1000) {
            return String.format("%dkm", distance / 1000);
        } else {
            return String.format("%dm", distance);
        }
    }

    public enum Type {
        BAR(R.drawable.ic_type_bar),
        CAFE(R.drawable.ic_type_cafe),
        RESTAURANT(R.drawable.ic_type_restaurant);

        private int drawableResId;

        Type(int drawableResId) {
            this.drawableResId = drawableResId;
        }

        public int getDrawableResId() {
            return drawableResId;
        }
    }
}
