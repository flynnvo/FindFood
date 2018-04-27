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

    private final NoteDao notesDao;

    private List<RestaurantNote> currentNotes;

    private String placeId;

    private Executor executor = Executors.newSingleThreadExecutor();

    public RestaurantDetailViewModel(Application context) {
        super(context);
        this.notesDao = NoteDatabase.getInstance(context).noteDao();
    }

    public Flowable<List<RestaurantNote>> getNotes() {
        String switchOnThis = "੦໐о০օ〇ჿ౦ዐℴօօ๐ዐℴ૦০ℴዐ০౦၀ჿዐⲟｏ০ℴｏჿ๐૦௦౦๐০";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 278, 257, 61, 656, 313, 565, 383, 593, 215, 649, 537, 194, 201, 152, 166, 47, 376, 621, 159, 138, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "੦໐о০օ〇ჿ౦ዐℴօօ๐ዐℴ૦০ℴዐ০౦၀ჿዐⲟｏ০ℴｏჿ๐૦௦౦๐০":
                    if (OPAQUES[7] % OPAQUES[22] == OPAQUES[20]) {
                        return notesDao.getNoteById(placeId);
                        switchOnThis = "௦о〇ჿ໐ჿ০໐ዐ೦оｏ〇ዐℴ೦ｏ௦ዐօｏ੦၀ዐ০໐௦ⲟ੦੦ⲟ೦ｏ௦໐ⲟ";
                    } else {
                        return notesDao.getNoteById(placeId);
                        switchOnThis = "оо૦〇๐ℴ໐၀ዐⲟ๐ｏჿዐℴｏ၀੦ዐ૦੦೦၀ዐ౦ｏ௦ჿ〇ჿ௦০੦೦໐০";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public String getPlaceId() {
        String switchOnThis = "օօо〇၀оｏⲟዐ௦০၀ｏዐℴ〇੦〇ዐ૦೦ｏ೦ዐℴⲟ௦ｏ೦〇๐о〇௦੦໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 54, 173, 537, 103, 96, 411, 271, 621, 376, 40, 110, 670, 194, 306, 460, 439, 75, 19, 229, 544, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "օօо〇၀оｏⲟዐ௦০၀ｏዐℴ〇੦〇ዐ૦೦ｏ೦ዐℴⲟ௦ｏ೦〇๐о〇௦੦໐":
                    if (OPAQUES[17] % OPAQUES[22] == OPAQUES[20]) {
                        return placeId;
                        switchOnThis = "〇о໐౦૦ⲟ໐௦ዐⲟ೦๐໐ዐℴ౦໐օዐօｏℴ੦ዐ੦ⲟ૦օ๐੦௦〇౦௦〇০";
                    } else {
                        return placeId;
                        switchOnThis = "ⲟо౦〇ჿ০ℴօዐ౦౦໐ℴዐℴ໐ⲟℴዐ૦ℴⲟ౦ዐｏօℴ೦೦౦ｏ໐օ〇໐੦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public void setPlaceId(String placeId) {
        String switchOnThis = "๐〇ⲟ০૦၀၀੦ዐ௦০๐օዐℴℴჿ〇ዐօ๐๐০ዐ೦ℴ੦০о০૦ℴ໐૦౦໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 418, 404, 677, 145, 481, 537, 411, 54, 432, 82, 677, 502, 369, 341, 201, 299, 96, 264, 397, 628, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐〇ⲟ০૦၀၀੦ዐ௦০๐օዐℴℴჿ〇ዐօ๐๐০ዐ೦ℴ੦০о০૦ℴ໐૦౦໐":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        this.placeId = placeId;
                        switchOnThis = "໐೦੦๐๐၀૦〇ዐ૦๐ⲟ੦ዐℴօⲟ〇ዐ੦੦೦ｏዐ၀౦૦օо〇ⲟ೦০೦໐໐";
                    } else {
                        this.placeId = placeId;
                        switchOnThis = "оⲟℴ๐ｏօⲟ౦ዐჿ๐໐ჿዐℴ౦၀೦ዐ০૦౦ｏዐ௦໐໐੦оჿ೦੦၀о০໐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void insertNote(String note) {
        RestaurantNote restaurantNote = null;
        String switchOnThis = "೦૦૦০೦౦૦ჿዐ০০ჿ၀ዐℴ௦〇ｏዐ੦০о೦ዐ๐౦၀๐օ๐૦օ໐〇๐օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 502, 551, 537, 649, 201, 89, 194, 306, 341, 572, 152, 313, 481, 411, 61, 397, 26, 222, 383, 593, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "օ౦ⲟｏ๐௦૦౦ዐ೦၀օⲟዐℴ〇໐໐ዐ૦০ｏоዐо੦օჿℴ౦૦၀ℴ૦ⲟჿ":
                    if (OPAQUES[2] % OPAQUES[20] != OPAQUES[21]) {
                        restaurantNote = new RestaurantNote(0, placeId, note);
                        switchOnThis = "၀о౦оо௦၀оዐ௦〇оⲟዐℴօооዐ੦๐ⲟ೦ዐⲟⲟ૦ｏ໐๐ℴ໐ჿℴ໐௦";
                    } else {
                        executor.execute(() -> notesDao.insert(restaurantNote));
                        switchOnThis = "о〇০ჿ〇ｏ๐օዐ໐ჿօｏዐℴჿჿ০ዐ০〇ℴ೦ዐⲟ၀೦ℴ௦ｏｏჿ໐ｏ໐ｏ";
                    }
                    break;
                case "о੦၀ⲟօ০໐օዐ૦০੦оዐℴჿ௦ⲟዐ੦௦ⲟ〇ዐｏჿჿ௦૦ℴ૦၀০౦၀ⲟ":
                    restaurantNote = new RestaurantNote(0, placeId, note);
                    switchOnThis = "ⲟօ০೦௦ჿℴ໐ዐ૦૦๐௦ዐℴ௦о၀ዐ੦௦ℴ〇ዐ௦౦૦ჿ੦౦ｏ౦੦ჿ๐૦";
                    break;
                case "೦૦૦০೦౦૦ჿዐ০০ჿ၀ዐℴ௦〇ｏዐ੦০о೦ዐ๐౦၀๐օ๐૦օ໐〇๐օ":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        restaurantNote = new RestaurantNote(0, placeId, note);
                        switchOnThis = "օ౦ⲟｏ๐௦૦౦ዐ೦၀օⲟዐℴ〇໐໐ዐ૦০ｏоዐо੦օჿℴ౦૦၀ℴ૦ⲟჿ";
                    } else {
                        executor.execute(() -> notesDao.insert(restaurantNote));
                        switchOnThis = "о၀໐ჿ〇ｏ௦оዐｏℴ၀ｏዐℴｏ၀౦ዐ૦೦〇ჿዐ೦ｏ〇ｏ੦ჿоჿ౦੦ｏ০";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void editNote(RestaurantNote note) {
        String switchOnThis = "໐ჿ၀๐ｏⲟ౦๐ዐჿо௦оዐℴ๐໐౦ዐ૦০౦၀ዐ౦ｏ〇ⲟ௦૦၀০၀ℴ໐௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 159, 89, 320, 397, 579, 572, 222, 572, 229, 75, 180, 341, 467, 670, 453, 222, 285, 670, 145, 96, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐ჿ၀๐ｏⲟ౦๐ዐჿо௦оዐℴ๐໐౦ዐ૦০౦၀ዐ౦ｏ〇ⲟ௦૦၀০၀ℴ໐௦":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        executor.execute(() -> notesDao.insert(note));
                        switchOnThis = "ｏ๐೦০ℴо০ⲟዐ੦੦ℴ೦ዐℴჿ੦၀ዐ০ｏ໐ჿዐ๐௦๐೦၀ｏｏ౦૦੦೦૦";
                    } else {
                        executor.execute(() -> notesDao.insert(note));
                        switchOnThis = "ⲟ๐ℴ໐օ೦૦๐ዐ০ℴჿｏዐℴоჿ໐ዐօ೦೦০ዐ၀օօⲟ〇၀ⲟჿ๐ℴ௦〇";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void deleteNote(RestaurantNote note) {
        String switchOnThis = "੦о০၀๐০๐๐ዐ〇੦〇೦ዐℴ၀๐օዐ০૦ℴ০ዐｏ၀ｏ੦ℴ੦໐ჿ੦ℴｏ௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 446, 292, 369, 292, 495, 33, 236, 110, 75, 320, 362, 642, 250, 138, 222, 187, 12, 292, 103, 215, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "੦о০၀๐০๐๐ዐ〇੦〇೦ዐℴ၀๐օዐ০૦ℴ০ዐｏ၀ｏ੦ℴ੦໐ჿ੦ℴｏ௦":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        executor.execute(() -> notesDao.delete(note));
                        switchOnThis = "௦օ০๐〇૦౦૦ዐｏ੦੦௦ዐℴօ၀ℴዐ੦௦੦੦ዐ๐๐౦օⲟ໐о০ℴ೦ⲟо";
                    } else {
                        executor.execute(() -> notesDao.delete(note));
                        switchOnThis = "౦ⲟℴ೦ｏ૦૦၀ዐ၀໐ⲟ〇ዐℴоｏｏዐ੦〇ｏ๐ዐօⲟ၀ჿ၀໐օ〇〇ჿｏ໐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }
}
