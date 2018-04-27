package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "note")
public class RestaurantNote {

    @PrimaryKey(autoGenerate = true)
    private int rnId;

    @ColumnInfo(name = "placesId")
    private String restaurantId;

    @ColumnInfo(name = "note")
    private String note;

    public RestaurantNote() {
    }

    public RestaurantNote(int rnId, String placeId, String note) {
        this.rnId = rnId;
        this.restaurantId = placeId;
        this.note = note;
    }

    public int getRnId() {
        String switchOnThis = "ℴ౦օ௦௦౦ჿ౦ዐ০౦௦๐ዐℴ௦૦〇ዐ੦૦ℴ໐ዐ໐০೦ჿｏ๐૦ｏ〇੦ℴ၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 376, 607, 257, 523, 649, 306, 89, 26, 40, 621, 397, 523, 117, 327, 278, 257, 229, 348, 551, 362, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ℴ౦օ௦௦౦ჿ౦ዐ০౦௦๐ዐℴ௦૦〇ዐ੦૦ℴ໐ዐ໐০೦ჿｏ๐૦ｏ〇੦ℴ၀":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        return rnId;
                        switchOnThis = "೦ℴ๐၀оℴ੦ⲟዐ౦၀ჿ೦ዐℴ〇੦๐ዐ০௦౦ℴዐⲟօⲟ౦օ๐੦ｏօ໐௦〇";
                    } else {
                        return rnId;
                        switchOnThis = "〇о೦〇оⲟ૦〇ዐⲟ๐೦ℴዐℴ౦੦๐ዐօ০૦ჿዐ੦੦ｏⲟ௦ⲟ௦౦੦〇౦௦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return 0;
    }

    public void setRnId(int rnId) {
        String switchOnThis = "〇ⲟⲟⲟ௦ჿ૦օዐօⲟ੦০ዐℴℴℴ૦ዐ০ⲟჿ೦ዐ໐੦ჿ౦௦օ໐〇ჿо૦օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 355, 138, 474, 201, 649, 138, 446, 194, 390, 278, 201, 12, 96, 334, 82, 110, 635, 670, 572, 103, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "〇ⲟⲟⲟ௦ჿ૦օዐօⲟ੦০ዐℴℴℴ૦ዐ০ⲟჿ೦ዐ໐੦ჿ౦௦օ໐〇ჿо૦օ":
                    if (OPAQUES[9] % OPAQUES[22] != OPAQUES[20]) {
                        this.rnId = rnId;
                        switchOnThis = "௦೦օ੦ჿ௦໐๐ዐ௦ჿ੦௦ዐℴо໐੦ዐ০оｏ๐ዐо௦૦ｏℴ௦ℴჿჿо੦੦";
                    } else {
                        this.rnId = rnId;
                        switchOnThis = "௦௦၀૦౦๐օｏዐ໐၀օ௦ዐℴ〇౦੦ዐ੦ⲟ௦оዐⲟ௦௦೦〇ჿ๐ｏ໐೦ℴｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public String getRestaurantId() {
        String switchOnThis = "оℴ๐๐໐౦૦ⲟዐ〇о໐౦ዐℴჿ૦੦ዐօჿօⲟዐ০૦૦၀௦੦օ೦ｏჿоℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 194, 26, 516, 194, 145, 306, 579, 145, 544, 110, 530, 495, 152, 425, 348, 656, 600, 572, 26, 194, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "оℴ๐๐໐౦૦ⲟዐ〇о໐౦ዐℴჿ૦੦ዐօჿօⲟዐ০૦૦၀௦੦օ೦ｏჿоℴ":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        return restaurantId;
                        switchOnThis = "๐ооｏ௦੦੦ჿዐ੦〇ჿ௦ዐℴ໐၀оዐօ໐ⲟ೦ዐ၀〇ჿ໐о೦௦೦ⲟ๐੦০";
                    } else {
                        return restaurantId;
                        switchOnThis = "၀၀௦ｏⲟ၀ⲟⲟዐ౦ℴⲟ૦ዐℴ૦ჿоዐ০၀ჿ೦ዐ໐๐೦〇၀ℴ໐ｏ〇ჿ໐੦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public void setRestaurantId(String restaurantId) {
        String switchOnThis = "੦๐೦၀ⲟ〇೦ჿዐℴ๐оօዐℴօ౦ｏዐ੦૦၀ｏዐօ௦၀০၀๐ℴ೦о೦૦੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 523, 166, 348, 208, 19, 299, 404, 208, 383, 124, 418, 82, 40, 33, 530, 180, 320, 586, 537, 68, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "੦๐೦၀ⲟ〇೦ჿዐℴ๐оօዐℴօ౦ｏዐ੦૦၀ｏዐօ௦၀০၀๐ℴ೦о೦૦੦":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        this.restaurantId = restaurantId;
                        switchOnThis = "ｏ౦೦ℴℴоօ೦ዐ〇ℴⲟｏዐℴ๐০௦ዐօｏ〇௦ዐ〇օ০оℴ၀੦౦ｏ๐౦ჿ";
                    } else {
                        this.restaurantId = restaurantId;
                        switchOnThis = "ⲟ၀๐૦০૦૦૦ዐⲟ੦໐ⲟዐℴ๐๐ｏዐ০о೦оዐ೦ⲟ૦ℴ૦ℴօ੦૦๐౦௦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public String getNote() {
        String switchOnThis = "ℴⲟჿⲟｏ౦၀оዐ௦๐০໐ዐℴ๐໐০ዐօ໐૦০ዐ໐օօ౦〇౦〇೦೦ℴ〇ｏ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 33, 663, 313, 229, 516, 439, 229, 250, 460, 215, 341, 558, 397, 40, 12, 572, 40, 614, 145, 131, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ℴⲟჿⲟｏ౦၀оዐ௦๐০໐ዐℴ๐໐০ዐօ໐૦০ዐ໐օօ౦〇౦〇೦೦ℴ〇ｏ":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        return note;
                        switchOnThis = "౦૦ｏ੦০๐ℴ೦ዐօｏ૦౦ዐℴ௦ⲟ೦ዐ੦໐օоዐ๐೦ℴօ૦೦૦০๐ⲟ〇০";
                    } else {
                        return note;
                        switchOnThis = "০〇০օｏℴｏ০ዐ૦၀ℴоዐℴჿℴоዐ੦๐૦ჿዐоⲟ૦੦ⲟ၀০о੦〇๐౦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public void setNote(String note) {
        String switchOnThis = "๐౦ⲟоｏ໐о૦ዐ๐௦〇ｏዐℴ০о૦ዐ੦ｏ੦ჿዐჿｏ૦੦০օⲟ௦ⲟ০ⲟｏ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 292, 677, 229, 502, 103, 243, 628, 152, 418, 341, 523, 411, 432, 593, 572, 222, 19, 306, 82, 397, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐౦ⲟоｏ໐о૦ዐ๐௦〇ｏዐℴ০о૦ዐ੦ｏ੦ჿዐჿｏ૦੦০օⲟ௦ⲟ০ⲟｏ":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        this.note = note;
                        switchOnThis = "ｏ੦๐〇၀౦๐〇ዐ০ჿჿℴዐℴｏℴ੦ዐօ၀оⲟዐ〇০໐〇〇〇௦੦ℴօ૦௦";
                    } else {
                        this.note = note;
                        switchOnThis = "੦০౦ჿ੦〇၀၀ዐ੦০૦໐ዐℴ੦ℴℴዐօ〇၀ჿዐ௦๐〇ｏ๐೦௦૦օ๐ⲟ౦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }
}
