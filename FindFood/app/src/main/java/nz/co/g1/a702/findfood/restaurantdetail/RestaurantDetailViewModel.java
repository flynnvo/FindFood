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
    private final NoteDao notesDao;
    private RestaurantNote currentNote;
    private String placeId;

    private Executor executor = Executors.newSingleThreadExecutor();

    public RestaurantDetailViewModel(Application context) {
        super(context);
        this.notesDao = NoteDatabase.getInstance(context).noteDao();
    }

    public Flowable<RestaurantNote> getNotes() {
        return notesDao.getNoteById(placeId);
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public void editNote(String note) {
        int id = currentNote == null ? 0 : currentNote.getRnId();
        RestaurantNote restaurantNote = new RestaurantNote(id, placeId, note);
        executor.execute(() -> notesDao.insert(restaurantNote));
    }

    public String getCurrentNoteText() {
        return currentNote == null ? "" : currentNote.getNote();
    }

    public void setCurrentNote(RestaurantNote currentNote) {
        this.currentNote = currentNote;
    }
}
