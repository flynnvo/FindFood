package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "note")
public class RestaurantNote {
    @PrimaryKey
    private int rnId;

    @ColumnInfo(name = "placesId")
    private int restaurantId;

    @ColumnInfo(name = "note")
    private String note;

    public int getRnId() {
        return rnId;
    }

    public void setRnId(int rnId) {
        this.rnId = rnId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
