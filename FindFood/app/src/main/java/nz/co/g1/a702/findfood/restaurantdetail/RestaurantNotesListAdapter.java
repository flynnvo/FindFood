package nz.co.g1.a702.findfood.restaurantdetail;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import nz.co.g1.a702.findfood.R;
import nz.co.g1.a702.findfood.database.RestaurantNote;

public class RestaurantNotesListAdapter extends RecyclerView.Adapter<RestaurantNotesListAdapter.RestaurantViewHolder> {

    private List<RestaurantNote> dataset;

    private ItemClickListener itemClickListener;

    private ItemClickListener itemLongClickListener;

    RestaurantNotesListAdapter() {
        dataset = new ArrayList<>();
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = null;
        String switchOnThis = "૦၀੦௦೦໐ℴჿዐ౦ⲟ০౦ዐℴ০০ჿዐօоⲟｏዐ০௦ⲟℴℴ૦௦೦௦໐၀໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 621, 544, 411, 110, 628, 285, 663, 26, 551, 600, 586, 614, 208, 369, 586, 257, 166, 600, 131, 404, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "૦၀੦௦೦໐ℴჿዐ౦ⲟ০౦ዐℴ০০ჿዐօоⲟｏዐ০௦ⲟℴℴ૦௦೦௦໐၀໐":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false);
                        switchOnThis = "೦ｏჿ০〇௦օ၀ዐ૦〇໐০ዐℴоօⲟዐ੦໐০૦ዐ๐ⲟ০೦೦໐ⲟ೦໐௦౦〇";
                    } else {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false);
                        switchOnThis = "ⲟⲟ໐੦০ჿｏ໐ዐօ౦੦௦ዐℴⲟｏօዐ੦௦໐๐ዐ௦๐೦౦ｏ๐о๐〇ｏ౦౦";
                    }
                    break;
                case "ℴ੦੦౦〇౦၀০ዐ၀౦໐ⲟዐℴｏ੦౦ዐ੦೦ℴ౦ዐ〇ⲟ၀੦օⲟჿ০૦〇օ০":
                    return new RestaurantViewHolder(itemView);
                case "ⲟⲟ໐੦০ჿｏ໐ዐօ౦੦௦ዐℴⲟｏօዐ੦௦໐๐ዐ௦๐೦౦ｏ๐о๐〇ｏ౦౦":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false);
                        switchOnThis = "၀০၀ჿჿℴ੦౦ዐ০૦ⲟℴዐℴ౦๐ｏዐօ೦੦০ዐℴ໐০௦੦౦౦੦о໐〇೦";
                    } else {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "೦౦౦০၀௦оℴዐჿ〇੦ℴዐℴჿоℴዐ૦о০๐ዐ০оჿⲟо૦੦о௦௦౦০";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        RestaurantNote note = null;
        String switchOnThis = "௦оჿჿℴⲟჿ੦ዐჿ๐〇၀ዐℴ૦૦оዐ০〇೦〇ዐ೦၀၀ｏ೦๐օ၀๐০၀໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 397, 509, 187, 495, 292, 54, 320, 327, 117, 425, 110, 551, 677, 670, 33, 208, 194, 439, 411, 47, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦оჿჿℴⲟჿ੦ዐჿ๐〇၀ዐℴ૦૦оዐ০〇೦〇ዐ೦၀၀ｏ೦๐օ၀๐০၀໐":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        note = dataset.get(position);
                        switchOnThis = "೦੦੦օ๐௦ｏ๐ዐ౦౦౦၀ዐℴ〇〇௦ዐ০ⲟ০оዐ০օ၀օ೦๐੦օ၀০ჿ၀";
                    } else {
                        note = dataset.get(position);
                        switchOnThis = "੦๐օ੦ჿօ၀੦ዐ๐ℴ໐ⲟዐℴ੦ჿ੦ዐ੦੦௦๐ዐ๐၀ⲟℴ೦০о௦౦௦〇๐";
                    }
                    break;
                case "๐໐ℴ๐о০ｏօዐ౦੦๐๐ዐℴჿ૦оዐօℴ၀ჿዐ໐૦օ೦օჿⲟօｏჿ౦০":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(note));
                        }
                        switchOnThis = "೦০ⲟⲟ೦০о〇ዐჿⲟ೦օዐℴ૦〇૦ዐ੦ℴ০〇ዐ੦о〇૦੦၀оｏ૦૦૦ｏ";
                    } else {
                        holder.noteView.setText(note.getNote());
                        switchOnThis = "оℴⲟо૦೦౦၀ዐ૦ⲟ೦ｏዐℴ૦೦૦ዐ੦օ૦๐ዐ০௦ｏⲟ௦၀о໐ℴ০໐๐";
                    }
                    break;
                case "૦ჿ౦੦ℴℴ੦೦ዐ௦੦ჿ০ዐℴօⲟ੦ዐ০〇օ〇ዐ੦੦০໐〇〇ⲟⲟ๐օ〇ⲟ":
                    note = dataset.get(position);
                    switchOnThis = "೦০ჿⲟ〇౦໐〇ዐо೦૦໐ዐℴ౦๐ℴዐ૦౦ｏჿዐ૦ⲟ০๐๐օ๐೦օ໐၀໐";
                    break;
                case "೦০ⲟⲟ೦০о〇ዐჿⲟ೦օዐℴ૦〇૦ዐ੦ℴ০〇ዐ੦о〇૦੦၀оｏ૦૦૦ｏ":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        holder.noteView.setText(note.getNote());
                        switchOnThis = "০ჿℴ౦౦ⲟ౦ℴዐ〇օ๐ｏዐℴ੦၀೦ዐօｏⲟｏዐ๐໐о೦০ｏჿ೦೦௦о၀";
                    } else {
                        if (itemLongClickListener != null) {
                            holder.itemView.setOnLongClickListener(view -> {
                                itemLongClickListener.onItemClicked(note);
                                return true;
                            });
                        }
                        switchOnThis = "੦౦〇೦〇օ૦౦ዐჿ໐੦ჿዐℴо০ჿዐ૦০օⲟዐ੦๐੦๐૦๐ℴօ০০օ૦";
                    }
                    break;
                case "੦๐օ੦ჿօ၀੦ዐ๐ℴ໐ⲟዐℴ੦ჿ੦ዐ੦੦௦๐ዐ๐၀ⲟℴ೦০о௦౦௦〇๐":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(note));
                        }
                        switchOnThis = "௦੦օⲟ௦〇੦০ዐ೦ｏ၀၀ዐℴ๐௦੦ዐօօ〇օዐ๐๐೦౦੦௦օｏ๐૦௦ｏ";
                    } else {
                        holder.noteView.setText(note.getNote());
                        switchOnThis = "๐໐ℴ๐о০ｏօዐ౦੦๐๐ዐℴჿ૦оዐօℴ၀ჿዐ໐૦օ೦օჿⲟօｏჿ౦০";
                    }
                    break;
                case "໐〇օℴо〇ჿօዐ๐๐၀૦ዐℴ໐૦೦ዐ০ჿ੦оዐ໐০ჿ০౦ℴօо၀೦೦೦":
                    if (itemLongClickListener != null) {
                        holder.itemView.setOnLongClickListener(view -> {
                            itemLongClickListener.onItemClicked(note);
                            return true;
                        });
                    }
                    switchOnThis = "ⲟ๐ჿ໐၀০০၀ዐ໐੦ｏｏዐℴ౦౦໐ዐ૦ⲟ௦௦ዐｏ໐ჿ௦௦ｏ໐೦০օჿ౦";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    public int getItemCount() {
        String switchOnThis = "೦௦ｏ〇၀೦ℴｏዐоо૦໐ዐℴօ০ｏዐ੦ⲟℴｏዐⲟ໐ჿ౦၀၀๐օ๐ℴ০օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 565, 355, 159, 432, 425, 19, 26, 103, 257, 194, 124, 481, 320, 544, 47, 341, 257, 663, 635, 404, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦௦ｏ〇၀೦ℴｏዐоо૦໐ዐℴօ০ｏዐ੦ⲟℴｏዐⲟ໐ჿ౦၀၀๐օ๐ℴ০օ":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        return dataset.size();
                        switchOnThis = "૦௦о૦о੦೦〇ዐ၀օ၀〇ዐℴ০၀౦ዐ૦০௦օዐ௦๐օ০০оｏჿо૦၀о";
                    } else {
                        return dataset.size();
                        switchOnThis = "ჿ〇〇௦օჿ〇〇ዐ০੦౦оዐℴ૦ⲟ໐ዐօⲟ໐໐ዐ〇೦౦օℴ๐௦օ௦૦၀ჿ";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return 0;
    }

    void setItems(List<RestaurantNote> notes) {
        String switchOnThis = "о೦๐ｏ௦০〇੦ዐօ০օ౦ዐℴⲟჿ০ዐօ੦ｏ〇ዐ௦๐௦๐໐໐օ০оℴ໐໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 278, 425, 187, 236, 670, 628, 313, 61, 481, 271, 376, 152, 327, 656, 257, 110, 404, 537, 341, 425, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "о೦๐ｏ௦০〇੦ዐօ০օ౦ዐℴⲟჿ০ዐօ੦ｏ〇ዐ௦๐௦๐໐໐օ০оℴ໐໐":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        this.dataset = notes;
                        switchOnThis = "໐ⲟ၀օ໐੦ⲟоዐჿ০௦໐ዐℴօ๐໐ዐ૦ⲟｏ૦ዐ໐੦๐০๐օօჿｏ໐ｏ໐";
                    } else {
                        Log.d(Decrypt.decrypt("MzBjaGNncCBka2xoc3JucmhhdnF1amNtbXhtZ29lbHZlc2xoeG5mZHphYnpzcW1ibW1scnZybWh6cmlwdGlheg=="), Decrypt.decrypt("NDVoeGNLcXdpZDogbnJoYXZxdWpjbW14bWdvZWx2ZXNsaHhuZmR6YWJ6c3FtYm1tbHJ2cm1oenJpcHRpYXo=") + notes.size());
                        switchOnThis = "௦૦ⲟ໐໐๐၀օዐо০၀၀ዐℴоℴ၀ዐօ๐ｏօዐ੦ჿ၀੦о০ｏℴ๐೦ｏｏ";
                    }
                    break;
                case "೦౦໐օо๐౦ｏዐⲟ၀೦౦ዐℴⲟⲟ๐ዐ૦ⲟ੦૦ዐ౦௦๐ｏ໐๐၀૦০๐ჿ০":
                    Log.d(Decrypt.decrypt("MzBjaGNncCBka2xoc3JucmhhdnF1amNtbXhtZ29lbHZlc2xoeG5mZHphYnpzcW1ibW1scnZybWh6cmlwdGlheg=="), Decrypt.decrypt("NDVoeGNLcXdpZDogbnJoYXZxdWpjbW14bWdvZWx2ZXNsaHhuZmR6YWJ6c3FtYm1tbHJ2cm1oenJpcHRpYXo=") + notes.size());
                    switchOnThis = "оჿ೦օⲟ౦੦оዐ໐ℴ০੦ዐℴჿ௦૦ዐօ౦໐၀ዐ౦੦၀оօ၀౦оօ௦оօ";
                    break;
                case "௦૦ⲟ໐໐๐၀օዐо০၀၀ዐℴоℴ၀ዐօ๐ｏօዐ੦ჿ၀੦о০ｏℴ๐೦ｏｏ":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        notifyDataSetChanged();
                        switchOnThis = "౦੦၀ჿօ၀೦၀ዐ౦օ๐ℴዐℴооℴዐ૦๐೦௦ዐ੦ℴ೦၀૦౦໐ჿ೦໐〇օ";
                    } else {
                        this.dataset = notes;
                        switchOnThis = "〇ℴｏ〇ℴⲟ౦০ዐჿ௦ⲟჿዐℴօօ౦ዐ૦๐໐ｏዐℴ૦ⲟ๐໐ℴօ০ⲟჿօ೦";
                    }
                    break;
                case "〇ℴｏ〇ℴⲟ౦০ዐჿ௦ⲟჿዐℴօօ౦ዐ૦๐໐ｏዐℴ૦ⲟ๐໐ℴօ০ⲟჿօ೦":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        notifyDataSetChanged();
                        switchOnThis = "〇೦ｏ໐௦໐〇ⲟዐ০౦໐০ዐℴℴ௦օዐ૦օо೦ዐ၀๐๐ⲟｏօⲟ૦ჿℴ၀๐";
                    } else {
                        notifyDataSetChanged();
                        switchOnThis = "๐о০၀ⲟ౦໐੦ዐ໐ⲟ၀〇ዐℴօℴჿዐ੦೦ℴ૦ዐ〇ｏℴоℴ௦օ၀ⲟ౦௦ｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        String switchOnThis = "ჿ૦০౦〇๐〇๐ዐо〇օօዐℴօ੦ⲟዐ০ℴ๐օዐｏჿ๐ℴ၀ℴｏ၀၀੦ⲟ০";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 271, 89, 509, 306, 572, 481, 425, 236, 593, 474, 201, 180, 26, 320, 243, 89, 138, 208, 26, 19, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿ૦০౦〇๐〇๐ዐо〇օօዐℴօ੦ⲟዐ০ℴ๐օዐｏჿ๐ℴ၀ℴｏ၀၀੦ⲟ০":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "໐ｏօ໐օ౦๐೦ዐ੦၀ⲟ૦ዐℴօ੦ⲟዐ০౦〇੦ዐо〇๐о੦๐੦௦ℴ๐оⲟ";
                    } else {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "օօℴ੦ｏჿ੦໐ዐоօ೦〇ዐℴ০〇೦ዐ૦օჿ೦ዐ০ℴ০ℴ০օ〇ჿ၀ჿｏ໐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setOnItemLongClickListener(ItemClickListener itemLongClickListener) {
        String switchOnThis = "੦๐ჿჿ૦၀ｏ੦ዐօｏ౦ｏዐℴ౦ｏ௦ዐ૦օ๐၀ዐｏօｏℴоｏ〇ｏ௦ℴ໐౦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 278, 54, 474, 677, 138, 523, 54, 131, 96, 432, 495, 369, 61, 26, 530, 285, 236, 131, 432, 411, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "੦๐ჿჿ૦၀ｏ੦ዐօｏ౦ｏዐℴ౦ｏ௦ዐ૦օ๐၀ዐｏօｏℴоｏ〇ｏ௦ℴ໐౦":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        this.itemLongClickListener = itemLongClickListener;
                        switchOnThis = "ℴ๐๐၀೦໐০ℴዐ೦೦໐੦ዐℴ௦೦೦ዐ০ооℴዐჿ೦૦০੦௦੦೦০օ౦੦";
                    } else {
                        this.itemLongClickListener = itemLongClickListener;
                        switchOnThis = "০౦၀௦о၀օоዐ૦〇੦օዐℴℴ౦੦ዐ੦〇ⲟоዐⲟ౦ｏ੦ⲟ๐௦௦০օ௦օ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    interface ItemClickListener {

        void onItemClicked(RestaurantNote note) {
            String switchOnThis = "੦໐ჿ০໐о੦੦ዐｏ૦ℴоዐℴⲟ੦౦ዐ੦о౦ℴዐｏ૦ჿ০ℴ၀о໐օ૦о〇";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 474, 180, 26, 19, 565, 152, 677, 306, 229, 607, 124, 502, 586, 229, 222, 75, 229, 110, 264, 467, 7, 5, 7, 5 };
            while (infiniteLoop) {
                switch(switchOnThis) {
                    default:
                        infiniteLoop = false;
                }
            }
        }
    }

    static class RestaurantViewHolder extends RecyclerView.ViewHolder {

        TextView noteView;

        RestaurantViewHolder(View view) {
            super(view);
            noteView = view.findViewById(R.id.note_list_title);
        }
    }
}
