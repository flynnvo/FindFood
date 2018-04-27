package nz.co.g1.a702.findfood.placesapi;

import android.location.Location;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import nz.co.g1.a702.findfood.BuildConfig;
import nz.co.g1.a702.findfood.R;

/**
 * Model for a Google Places API response restaurant
 */
public class Restaurant {

    /**
     * The location information model
     */
    @SerializedName("geometry")
    private Geometry geometry;

    /**
     * Restaurant name
     */
    @SerializedName("name")
    private String name;

    /**
     * Unique Google Places API ID
     */
    @SerializedName("place_id")
    private String placeId;

    /**
     * Restaurant's price level
     */
    @SerializedName("price_level")
    private int priceLevel;

    /**
     * Address of the restaurant
     */
    @SerializedName("vicinity")
    private String address;

    /**
     * Type of establishment (restaurant, cafe, bar)
     */
    @SerializedName("types")
    private List<String> types;

    /**
     * Photo API references
     */
    @SerializedName("photos")
    private List<Photo> photos;

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

    public String getImageUrl(int width, int height) {
        if (this.photos == null || this.photos.isEmpty()) {
            return null;
        }
        return String.format("https://maps.googleapis.com/maps/api/place/photo?maxwidth=%s&maxheight=%s&key=%s&photoreference=%s",
                width, height, BuildConfig.GOOGLE_API_KEY, this.photos.get(0).getPhotoReference());
    }

    public String distanceFrom(Location location) {
        int distance = (int) this.geometry.location.distanceTo(location);
        if (distance >= 1000) {
            return String.format("%dkm", distance / 1000);
        } else {
            return String.format("%dm", distance);
        }
    }

    /**
     * Establishment type model
     */
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

    /**
     * The location information model
     */
    public class Geometry {
        @SerializedName("location")
        private Location location;

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }
    }

    /**
     * Google Photos information model
     */
    public class Photo {
        @SerializedName("photo_reference")
        private String photoReference;

        public String getPhotoReference() {
            return photoReference;
        }

        public void setPhotoReference(String photoReference) {
            this.photoReference = photoReference;
        }
    }
}
