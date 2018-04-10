package nz.co.g1.a702.findfood.restaurantdetail;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;

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
    private RestaurantNote currentNote;

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
    public Flowable<RestaurantNote> getNotes() {
        return notesDao.getNoteById(placeId);
    }

    /**
     * @param placeId Google Places Restaurant ID to use for retrieval/insertion of notes
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     * Inserts or updates the notes for this restaurant
     *
     * @param note the note to insert
     */
    public void editNote(String note) {
        int id = currentNote == null ? 0 : currentNote.getRnId();
        RestaurantNote restaurantNote = new RestaurantNote(id, placeId, note);
        executor.execute(() -> notesDao.insert(restaurantNote));
    }

    /**
     * @return the current restaurant's notes
     */
    public String getCurrentNoteText() {
        return currentNote == null ? "" : currentNote.getNote();
    }

    /**
     * @param currentNote the note object for this detail view
     */
    public void setCurrentNote(RestaurantNote currentNote) {
        this.currentNote = currentNote;
    }
}
