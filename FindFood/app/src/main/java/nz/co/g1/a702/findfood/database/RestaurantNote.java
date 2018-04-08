package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "note")
public class RestaurantNote {
    @PrimaryKey(autoGenerate = true)
    private int rnId;

    @ColumnInfo(name = "placesId")
    private String restaurantId;

    @ColumnInfo(name = "note")
    private String note;

    public RestaurantNote() {

    }

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
