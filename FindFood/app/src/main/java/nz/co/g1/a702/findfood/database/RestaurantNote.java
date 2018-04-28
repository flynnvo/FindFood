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
        String switchOnThis = "ℴⲟჿ〇၀੦໐օዐ੦૦೦੦ዐℴⲟ๐ⲟዐ૦ⲟ〇ℴዐ௦૦ჿ೦௦၀ⲟჿо๐০օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 607, 565, 180, 488, 306, 47, 348, 19, 558, 61, 383, 54, 621, 173, 537, 145, 383, 215, 481, 166, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ℴⲟჿ〇၀੦໐օዐ੦૦೦੦ዐℴⲟ๐ⲟዐ૦ⲟ〇ℴዐ௦૦ჿ೦௦၀ⲟჿо๐০օ":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        return rnId;
                        switchOnThis = "ℴо૦๐ｏ০௦ⲟዐ౦๐౦௦ዐℴ੦ℴჿዐ૦〇౦໐ዐ௦૦ჿ၀౦໐૦оⲟ〇օ๐";
                    } else {
                        return rnId;
                        switchOnThis = "ჿ๐ℴօℴｏ၀оዐ০໐೦౦ዐℴ〇੦〇ዐօ૦೦ℴዐ〇ჿ๐ჿօ၀ｏօｏ๐ℴ૦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return 0;
    }

    public void setRnId(int rnId) {
        String switchOnThis = "о໐〇௦〇оｏ૦ዐｏｏ೦๐ዐℴℴоｏዐ০оｏℴዐ๐ⲟ౦ℴჿ౦օо೦ჿｏо";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 376, 649, 572, 607, 47, 614, 236, 439, 89, 593, 68, 656, 530, 334, 537, 488, 341, 292, 677, 677, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "о໐〇௦〇оｏ૦ዐｏｏ೦๐ዐℴℴоｏዐ০оｏℴዐ๐ⲟ౦ℴჿ౦օо೦ჿｏо":
                    if (OPAQUES[8] % OPAQUES[20] == OPAQUES[21]) {
                        this.rnId = rnId;
                        switchOnThis = "೦໐၀໐౦ｏ௦೦ዐ໐〇௦ⲟዐℴ၀๐〇ዐ੦〇օ೦ዐ০೦օ໐ℴօｏ๐ℴ੦೦๐";
                    } else {
                        this.rnId = rnId;
                        switchOnThis = "оо૦೦௦၀০੦ዐоⲟ੦〇ዐℴｏ೦оዐօ૦౦๐ዐоℴ০ჿｏ௦੦о௦০০〇";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public String getRestaurantId() {
        String switchOnThis = "〇օℴ౦ⲟ੦ℴℴዐօօ໐၀ዐℴｏ௦໐ዐօ၀ℴ〇ዐ๐ჿ๐೦૦〇〇੦օℴ၀ⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 348, 635, 33, 670, 117, 663, 194, 201, 628, 341, 614, 341, 131, 418, 124, 509, 516, 138, 229, 621, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "〇օℴ౦ⲟ੦ℴℴዐօօ໐၀ዐℴｏ௦໐ዐօ၀ℴ〇ዐ๐ჿ๐೦૦〇〇੦օℴ၀ⲟ":
                    if (OPAQUES[16] % OPAQUES[20] != OPAQUES[21]) {
                        return restaurantId;
                        switchOnThis = "о௦ⲟｏօⲟ၀๐ዐօ၀ⲟоዐℴｏ၀੦ዐ૦оօℴዐｏ౦೦၀૦ｏ๐౦๐ℴо੦";
                    } else {
                        return restaurantId;
                        switchOnThis = "ｏℴ๐০ｏℴ০оዐ೦੦օ๐ዐℴ໐о௦ዐօჿⲟ၀ዐჿ೦০ჿ〇๐૦ｏооჿ๐";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public void setRestaurantId(String restaurantId) {
        String switchOnThis = "౦о੦ｏℴ০〇੦ዐ〇౦௦၀ዐℴ੦໐ⲟዐ૦੦૦ჿዐօ௦ჿ૦໐๐ჿ০੦০ℴ૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 166, 390, 467, 635, 495, 117, 12, 320, 600, 166, 537, 495, 187, 208, 285, 425, 68, 607, 138, 278, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦о੦ｏℴ০〇੦ዐ〇౦௦၀ዐℴ੦໐ⲟዐ૦੦૦ჿዐօ௦ჿ૦໐๐ჿ০੦০ℴ૦":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        this.restaurantId = restaurantId;
                        switchOnThis = "๐๐ｏ〇ჿ〇օօዐⲟ໐໐೦ዐℴ০ⲟ໐ዐ૦೦ооዐоჿ௦໐౦ჿ੦օｏ౦૦ჿ";
                    } else {
                        this.restaurantId = restaurantId;
                        switchOnThis = "੦〇૦ჿ〇ⲟօℴዐ೦౦໐оዐℴⲟօ໐ዐ૦ⲟ၀оዐｏｏⲟ౦໐ⲟ੦๐০〇೦〇";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public String getNote() {
        String switchOnThis = "೦ℴ໐ℴჿ໐໐ℴዐо໐ⲟ০ዐℴⲟⲟჿዐ੦ℴｏ੦ዐℴ໐૦໐೦ｏօօ૦၀๐о";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 642, 355, 68, 628, 82, 12, 558, 418, 439, 488, 481, 236, 600, 12, 439, 278, 516, 369, 607, 656, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦ℴ໐ℴჿ໐໐ℴዐо໐ⲟ০ዐℴⲟⲟჿዐ੦ℴｏ੦ዐℴ໐૦໐೦ｏօօ૦၀๐о":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        return note;
                        switchOnThis = "૦૦၀੦๐๐ｏｏዐ০੦၀๐ዐℴ০໐๐ዐ૦ℴℴօዐ೦ჿ၀௦੦౦౦০๐ｏ௦о";
                    } else {
                        return note;
                        switchOnThis = "໐০о౦૦၀օⲟዐⲟⲟ০໐ዐℴ௦੦૦ዐ૦ｏ੦၀ዐ〇〇օ໐ჿо০оჿ໐੦〇";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public void setNote(String note) {
        String switchOnThis = "௦о০೦೦о๐๐ዐօ૦೦໐ዐℴо೦೦ዐ০ℴ౦০ዐℴ೦ჿ໐ℴⲟｏ౦ⲟｏօ০";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 404, 474, 446, 166, 75, 250, 621, 159, 124, 187, 40, 68, 194, 565, 586, 397, 54, 586, 488, 593, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦о০೦೦о๐๐ዐօ૦೦໐ዐℴо೦೦ዐ০ℴ౦০ዐℴ೦ჿ໐ℴⲟｏ౦ⲟｏօ০":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        this.note = note;
                        switchOnThis = "ｏоｏ೦๐ჿооዐ๐೦၀੦ዐℴⲟօ〇ዐ૦ⲟ๐օዐჿ૦ჿ౦〇๐оｏ໐০౦௦";
                    } else {
                        this.note = note;
                        switchOnThis = "௦౦૦ｏⲟჿｏ೦ዐ੦ჿ౦౦ዐℴ၀౦๐ዐ૦၀೦օዐօ〇০੦૦௦૦〇૦ⲟ໐၀";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }
}
