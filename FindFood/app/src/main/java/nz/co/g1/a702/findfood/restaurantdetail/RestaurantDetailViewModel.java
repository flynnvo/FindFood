package nz.co.g1.a702.findfood.restaurantdetail;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;

import io.reactivex.Flowable;
import nz.co.g1.a702.findfood.database.NoteDao;
import nz.co.g1.a702.findfood.database.NoteDatabase;
import nz.co.g1.a702.findfood.database.RestaurantNote;

public class RestaurantDetailViewModel extends AndroidViewModel {
    private final NoteDao notesDao;
    private String placeId;

    public RestaurantDetailViewModel(Application context) {
        super(context);
        this.notesDao = NoteDatabase.getInstance(context).noteDao();
    }

    public Flowable<String> getNotes() {
        return notesDao.getNoteById(placeId)
                .map(RestaurantNote::getNote);
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
}
