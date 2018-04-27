package nz.co.g1.a702.findfood.restaurantdetail;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import io.reactivex.Flowable;
import nz.co.g1.a702.findfood.database.NoteDao;
import nz.co.g1.a702.findfood.database.NoteDatabase;
import nz.co.g1.a702.findfood.database.RestaurantNote;

public class RestaurantDetailViewModel extends AndroidViewModel {

    /**
     * Dao to use to access user's notes
     */
    private final NoteDao notesDao;

    /**
     * Notes for this restaurant
     */
    private List<RestaurantNote> currentNotes;

    /**
     * Google Places Restaurant ID
     */
    private String placeId;

    /**
     * Executor to use for insertion tasks
     */
    private Executor executor = Executors.newSingleThreadExecutor();

    public RestaurantDetailViewModel(Application context) {
        super(context);
        this.notesDao = NoteDatabase.getInstance(context).noteDao();
    }

    /**
     * @return the user's notes for this restaurant
     */
    public Flowable<List<RestaurantNote>> getNotes() {
        return notesDao.getNoteById(placeId);
    }

    public String getPlaceId() {
        return placeId;
    }

    /**
     * @param placeId Google Places Restaurant ID to use for retrieval/insertion of notes
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     * Inserts a new note for this restaurant
     *
     * @param note the note to insert
     */
    public void insertNote(String note) {
        RestaurantNote restaurantNote = new RestaurantNote(0, placeId, note);
        executor.execute(() -> notesDao.insert(restaurantNote));
    }

    /**
     * Updates the selected note for this restaurant
     *
     * @param note the note to update
     */
    public void editNote(RestaurantNote note) {
        executor.execute(() -> notesDao.insert(note));
    }

    public void deleteNote(RestaurantNote note) {
        executor.execute(() -> notesDao.delete(note));
    }
}
