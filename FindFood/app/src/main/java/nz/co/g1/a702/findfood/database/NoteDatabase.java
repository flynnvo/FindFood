package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * The database class for saving notes in
 */
@Database(entities = {RestaurantNote.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase sInstance;

    /**
     * Get a singleton instance of the Database
     *
     * @param context the context with this to create the database if needed
     * @return an instance of the database
     */
    public static NoteDatabase getInstance(Context context) {
        if (sInstance == null) {
            sInstance = Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "note-database")
                    .build();
        }
        return sInstance;
    }

    public abstract NoteDao noteDao();

}
