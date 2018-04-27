package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = { RestaurantNote.class }, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase sInstance;

    public static NoteDatabase getInstance(Context context) {
        String switchOnThis = "௦၀০၀૦০໐๐ዐ೦〇๐၀ዐℴ౦օоዐ੦ｏ੦оዐօ೦օо௦ℴ০೦໐০օ೦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 334, 516, 257, 229, 222, 341, 635, 61, 572, 593, 285, 579, 558, 565, 348, 523, 565, 509, 530, 173, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "о〇၀ⲟ೦੦ჿ໐ዐ೦օ〇оዐℴо〇૦ዐ০ℴℴ၀ዐ೦੦౦૦ｏ໐၀౦০੦〇೦":
                    return sInstance;
                case "ჿ૦໐ⲟ௦૦੦ⲟዐｏჿоｏዐℴ౦๐၀ዐ০௦օ〇ዐօ໐໐ⲟჿо૦೦၀௦໐౦":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        return sInstance;
                        switchOnThis = "ⲟ૦௦૦ⲟ໐օоዐⲟ၀૦ｏዐℴ௦౦ჿዐօ၀০೦ዐօ〇〇໐ℴоｏ೦౦ⲟჿօ";
                    } else {
                        return sInstance;
                        switchOnThis = "૦օ૦೦ჿ੦၀௦ዐჿ੦૦ｏዐℴ௦ⲟ๐ዐ੦၀໐೦ዐо౦๐օօ๐০౦ⲟ੦၀૦";
                    }
                case "௦၀০၀૦০໐๐ዐ೦〇๐၀ዐℴ౦օоዐ੦ｏ੦оዐօ೦օо௦ℴ০೦໐০օ೦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        if (sInstance == null) {
                            sInstance = Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "note-database").build();
                        }
                        switchOnThis = "ჿ૦໐ⲟ௦૦੦ⲟዐｏჿоｏዐℴ౦๐၀ዐ০௦օ〇ዐօ໐໐ⲟჿо૦೦၀௦໐౦";
                    } else {
                        if (sInstance == null) {
                            sInstance = Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "note-database").build();
                        }
                        switchOnThis = "௦ჿ౦〇ｏ૦ჿ၀ዐ૦〇о๐ዐℴ၀௦〇ዐ੦੦о੦ዐ੦੦౦ⲟ০௦০০ⲟℴ໐๐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public abstract NoteDao noteDao() {
        String switchOnThis = "૦໐๐օ໐ჿ௦๐ዐⲟｏ௦օዐℴ၀օ௦ዐօ০оｏዐⲟℴ০๐๐ℴℴⲟ౦၀ｏ೦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 516, 460, 236, 194, 47, 40, 292, 264, 383, 33, 278, 299, 516, 670, 481, 292, 257, 166, 138, 586, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
