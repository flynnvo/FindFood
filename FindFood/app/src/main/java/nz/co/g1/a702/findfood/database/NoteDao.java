package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

/**
 * The {@link Dao} for accessing notes
 */
@Dao
public interface NoteDao {

    /**
     * @return all notes for all restaurants
     */
    @Query("SELECT * FROM note")
    Flowable<List<RestaurantNote>> getAll();

    /**
     * @param restaurantId the Google Places ID of the restaurant
     * @return the note for this restaurant
     */
    @Query("SELECT * FROM note WHERE placesId = :restaurantId")
    Flowable<List<RestaurantNote>> getNoteById(String restaurantId);

    /**
     * Insert the specified note into the database
     *
     * @param restaurantNote the note to insert
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(RestaurantNote restaurantNote);

    /**
     * Insert multiple notes into the database
     *
     * @param restaurantNotes the notes to insert
     */
    @Insert
    void insertAll(RestaurantNote... restaurantNotes);

    /**
     * Removes a specified note from the database
     *
     * @param restaurantNote the note to remove
     */
    @Delete
    void delete(RestaurantNote restaurantNote);
}
