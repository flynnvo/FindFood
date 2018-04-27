package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Model for the notes for a restaurant
 */
@Entity(tableName = "note")
public class RestaurantNote {

    /**
     * Unique database ID
     */
    @PrimaryKey(autoGenerate = true)
    private int rnId;

    /**
     * The Google Places ID of the restaurant
     */
    @ColumnInfo(name = "placesId")
    private String restaurantId;

    /**
     * The note to be inserted
     */
    @ColumnInfo(name = "note")
    private String note;

    /**
     * Default constructor for use by Room
     */
    public RestaurantNote() {
    }

    /**
     * Constructor for creating a RestaurantNote
     *
     * @param rnId    the unique database ID, or 0 to auto-generate if inserting
     * @param placeId the Google Places ID of the restaurant
     * @param note    the notes for the place
     */
    public RestaurantNote(int rnId, String placeId, String note) {
        this.rnId = rnId;
        this.restaurantId = placeId;
        this.note = note;
    }

    public int getRnId() {
        return rnId;
    }

    public void setRnId(int rnId) {
        this.rnId = rnId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
