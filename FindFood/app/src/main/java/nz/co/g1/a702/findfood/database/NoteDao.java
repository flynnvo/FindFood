package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import java.util.List;
import io.reactivex.Flowable;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM note")
    Flowable<List<RestaurantNote>> getAll();

    @Query("SELECT * FROM note WHERE placesId = :restaurantId")
    Flowable<List<RestaurantNote>> getNoteById(String restaurantId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(RestaurantNote restaurantNote);

    @Insert
    void insertAll(RestaurantNote... restaurantNotes);

    @Delete
    void delete(RestaurantNote restaurantNote);
}
