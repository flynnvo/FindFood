package nz.co.g1.a702.findfood;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import nz.co.g1.a702.findfood.placesapi.Restaurant;

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder> {

    private Context context;

    private List<Restaurant> dataset;

    private Location currentLocation;

    private ItemClickListener itemClickListener;

    RestaurantListAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = null;
        String switchOnThis = "౦০૦੦০೦๐౦ዐ၀〇໐օዐℴｏⲟ໐ዐ૦օℴօዐ૦௦ⲟⲟⲟ〇૦௦ⲟ௦໐๐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 551, 418, 278, 656, 292, 418, 131, 530, 369, 390, 460, 82, 173, 530, 642, 264, 467, 54, 299, 411, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿօ೦૦ｏо௦〇ዐ၀๐оჿዐℴ๐૦ℴዐ੦ℴօ০ዐ〇〇ⲟ૦౦ℴｏ໐၀০೦ｏ":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "ℴ০օ๐〇օ๐੦ዐ౦೦ℴ໐ዐℴ໐о૦ዐօ၀๐〇ዐ૦০౦౦໐၀੦о໐০௦〇";
                    } else {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "౦о〇૦০௦૦౦ዐ〇ჿ〇໐ዐℴℴ๐ⲟዐ੦০օ౦ዐоо๐о૦օօоօ૦၀ℴ";
                    }
                case "౦০૦੦০೦๐౦ዐ၀〇໐օዐℴｏⲟ໐ዐ૦օℴօዐ૦௦ⲟⲟⲟ〇૦௦ⲟ௦໐๐":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "၀о০၀๐০௦০ዐⲟℴℴ௦ዐℴｏ၀໐ዐ০оｏⲟዐｏ௦о০၀๐၀оℴօℴჿ";
                    } else {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
                        switchOnThis = "ჿօ೦૦ｏо௦〇ዐ၀๐оჿዐℴ๐૦ℴዐ੦ℴօ০ዐ〇〇ⲟ૦౦ℴｏ໐၀০೦ｏ";
                    }
                    break;
                case "ℴ໐০੦ｏ၀〇๐ዐｏ੦၀၀ዐℴⲟ၀০ዐ੦〇ჿｏዐ〇௦〇ჿ๐ⲟ〇օ૦೦ｏօ":
                    return new RestaurantViewHolder(itemView);
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = null;
        String switchOnThis = "๐ⲟ૦০〇ｏ০ｏዐ౦ℴ〇оዐℴ௦ｏоዐօ০ｏ੦ዐⲟ੦ℴ૦೦౦о૦౦໐೦၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 544, 271, 320, 362, 481, 138, 236, 495, 278, 523, 68, 600, 306, 334, 642, 131, 54, 89, 642, 621, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "о೦೦၀௦〇օ၀ዐｏ၀о০ዐℴ๐ⲟ౦ዐօჿ೦೦ዐ೦о೦оо໐〇੦ჿ๐ℴ೦":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        holder.distanceView.setText(restaurant.distanceFrom(currentLocation));
                        switchOnThis = "ⲟ೦၀๐੦০〇ｏዐ੦ჿ೦๐ዐℴｏօ০ዐօ੦౦օዐ〇೦〇ｏ౦౦௦〇ⲟ၀၀૦";
                    } else {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(restaurant));
                        }
                        switchOnThis = "૦၀੦೦ｏօ০๐ዐ೦օჿоዐℴⲟ၀೦ዐ૦ⲟｏօዐｏⲟℴ౦௦੦੦օℴ০๐໐";
                    }
                    break;
                case "оჿℴｏ০〇௦੦ዐჿօｏ౦ዐℴ০၀౦ዐ૦ჿ૦օዐ૦ｏℴ໐ℴⲟօ౦ℴ໐〇ℴ":
                    holder.distanceView.setText(restaurant.distanceFrom(currentLocation));
                    switchOnThis = "০ℴ౦౦೦๐օ૦ዐｏ૦оｏዐℴ໐໐૦ዐ૦೦૦〇ዐоօ໐ℴ૦໐၀໐օоℴჿ";
                    break;
                case "ｏօ০ｏ၀໐〇ⲟዐ〇օℴｏዐℴ੦ℴ໐ዐօо૦ℴዐ೦੦ｏℴⲟ০੦ჿℴ૦ｏ೦":
                    if (OPAQUES[16] % OPAQUES[20] == OPAQUES[21]) {
                        holder.iconView.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getType().getDrawableResId()));
                        switchOnThis = "၀〇೦೦ჿｏ௦ｏዐｏ၀〇ｏዐℴℴ০੦ዐ০౦ⲟ໐ዐ૦০੦੦ჿ೦ⲟ〇၀ｏ௦၀";
                    } else {
                        holder.nameView.setText(restaurant.getName());
                        switchOnThis = "௦օ๐૦๐оℴｏዐ૦๐০૦ዐℴо০ჿዐ૦౦ｏоዐℴ〇၀၀ｏℴჿо၀௦໐ｏ";
                    }
                    break;
                case "๐ⲟ૦০〇ｏ০ｏዐ౦ℴ〇оዐℴ௦ｏоዐօ০ｏ੦ዐⲟ੦ℴ૦೦౦о૦౦໐೦၀":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        holder.nameView.setText(restaurant.getName());
                        switchOnThis = "০о၀๐ⲟ০〇໐ዐ໐০ｏ໐ዐℴ೦ℴ੦ዐ૦ｏ၀ℴዐⲟჿօ๐ჿⲟоօℴ〇౦ⲟ";
                    } else {
                        restaurant = dataset.get(position);
                        switchOnThis = "ｏօ০ｏ၀໐〇ⲟዐ〇օℴｏዐℴ੦ℴ໐ዐօо૦ℴዐ೦੦ｏℴⲟ০੦ჿℴ૦ｏ೦";
                    }
                    break;
                case "௦೦оօօ௦૦๐ዐօ໐౦੦ዐℴℴ၀੦ዐօ௦〇੦ዐ০๐ｏⲟ০о੦၀੦໐௦ⲟ":
                    holder.distanceView.setText(restaurant.distanceFrom(currentLocation));
                    switchOnThis = "ⲟооⲟ၀౦௦ჿዐ௦օ౦ℴዐℴ੦ჿⲟዐ૦૦໐০ዐჿ౦౦੦о၀๐ჿ੦౦௦๐";
                    break;
                case "ⲟ೦၀๐੦০〇ｏዐ੦ჿ೦๐ዐℴｏօ০ዐօ੦౦օዐ〇೦〇ｏ౦౦௦〇ⲟ၀၀૦":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        holder.iconView.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getType().getDrawableResId()));
                        switchOnThis = "ⲟо೦օⲟ੦〇၀ዐℴ೦ⲟ੦ዐℴჿჿ౦ዐ੦০੦০ዐ〇০ℴⲟ௦ⲟ௦௦ｏჿօ໐";
                    } else {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(restaurant));
                        }
                        switchOnThis = "০௦೦૦๐ჿ௦੦ዐ๐௦૦౦ዐℴℴ໐ｏዐ০໐ｏჿዐℴ૦๐ℴ๐ჿ໐〇๐ｏо๐";
                    }
                    break;
                case "၀〇೦೦ჿｏ௦ｏዐｏ၀〇ｏዐℴℴ০੦ዐ০౦ⲟ໐ዐ૦০੦੦ჿ೦ⲟ〇၀ｏ௦၀":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        holder.nameView.setText(restaurant.getName());
                        switchOnThis = "о೦೦၀௦〇օ၀ዐｏ၀о০ዐℴ๐ⲟ౦ዐօჿ೦೦ዐ೦о೦оо໐〇੦ჿ๐ℴ೦";
                    } else {
                        restaurant = dataset.get(position);
                        switchOnThis = "๐օ໐ℴ੦௦ჿօዐоօ〇օዐℴ௦໐ჿዐ০ჿօ๐ዐℴ๐ჿ໐౦໐օჿ໐੦ｏ૦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    public int getItemCount() {
        String switchOnThis = "ჿℴ೦০০ჿ௦౦ዐ০૦ｏჿዐℴ௦ⲟℴዐ૦ℴ೦ჿዐｏ૦໐၀০০੦๐ｏ౦೦๐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 264, 278, 649, 677, 397, 334, 313, 425, 89, 628, 397, 334, 460, 523, 341, 26, 201, 495, 271, 376, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿℴ೦০০ჿ௦౦ዐ০૦ｏჿዐℴ௦ⲟℴዐ૦ℴ೦ჿዐｏ૦໐၀০০੦๐ｏ౦೦๐":
                    if (OPAQUES[15] % OPAQUES[22] == OPAQUES[20]) {
                        return dataset.size();
                        switchOnThis = "оօ૦௦ჿ੦ｏ೦ዐ০ჿ౦ℴዐℴ੦੦ჿዐ০〇੦ⲟዐ၀ⲟ૦౦໐ｏ੦օ০о೦၀";
                    } else {
                        return dataset.size();
                        switchOnThis = "౦ⲟ௦ℴ౦௦ⲟ০ዐჿ੦๐оዐℴ๐၀၀ዐօ၀〇໐ዐ໐໐໐੦໐ⲟ০০௦ⲟ০ｏ";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return 0;
    }

    void setItems(List<Restaurant> restaurants) {
        String switchOnThis = "໐૦๐ℴ౦ⲟ౦၀ዐ૦ჿ૦၀ዐℴ০০೦ዐ૦〇௦ჿዐ૦౦ℴ૦౦〇૦๐〇ჿｏ੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 215, 649, 166, 586, 82, 68, 523, 285, 229, 264, 439, 82, 376, 558, 502, 299, 558, 194, 677, 663, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "օ੦౦০೦૦௦ჿዐ౦о〇ჿዐℴоօ౦ዐ০ⲟ၀〇ዐоჿ〇໐〇౦оℴ೦০໐೦":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        notifyDataSetChanged();
                        switchOnThis = "ⲟ〇௦၀၀೦੦оዐ੦օ๐〇ዐℴ੦௦໐ዐ০೦໐ｏዐｏ〇〇〇໐օⲟ၀օ௦ℴℴ";
                    } else {
                        notifyDataSetChanged();
                        switchOnThis = "૦੦౦ℴ໐〇ⲟ૦ዐ௦๐੦၀ዐℴℴჿ೦ዐօօ௦௦ዐⲟоჿჿ௦ℴ௦੦೦๐௦၀";
                    }
                    break;
                case "໐૦๐ℴ౦ⲟ౦၀ዐ૦ჿ૦၀ዐℴ০০೦ዐ૦〇௦ჿዐ૦౦ℴ૦౦〇૦๐〇ჿｏ੦":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        this.dataset = restaurants;
                        switchOnThis = "๐೦໐໐о໐ჿｏዐ〇ｏ௦ℴዐℴ౦೦০ዐ੦೦૦ℴዐჿ੦໐օ๐〇౦ｏ೦੦〇ჿ";
                    } else {
                        this.dataset = restaurants;
                        switchOnThis = "օ੦౦০೦૦௦ჿዐ౦о〇ჿዐℴоօ౦ዐ০ⲟ၀〇ዐоჿ〇໐〇౦оℴ೦০໐೦";
                    }
                    break;
                case "օ໐о૦〇౦ℴ๐ዐ૦о๐౦ዐℴｏ၀〇ዐ૦૦〇ℴዐ૦ℴօℴо౦ｏ၀௦оⲟ੦":
                    notifyDataSetChanged();
                    switchOnThis = "੦໐౦〇〇ｏ໐ⲟዐⲟо౦௦ዐℴ೦〇૦ዐ০օⲟ੦ዐ໐о၀๐ℴ၀౦ჿ〇၀౦๐";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setDistanceLocation(Location location) {
        String switchOnThis = "໐૦ℴ〇〇໐੦౦ዐ၀၀օℴዐℴ〇օｏዐ૦೦ℴ௦ዐ০౦ჿ੦ｏоⲟ০ⲟჿℴℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 362, 404, 460, 481, 306, 628, 68, 593, 82, 355, 565, 145, 509, 152, 586, 292, 439, 530, 467, 523, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "໐૦ℴ〇〇໐੦౦ዐ၀၀օℴዐℴ〇օｏዐ૦೦ℴ௦ዐ০౦ჿ੦ｏоⲟ০ⲟჿℴℴ":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        currentLocation = location;
                        switchOnThis = "〇ℴ๐๐ჿⲟ౦၀ዐ၀օ໐ჿዐℴℴℴ〇ዐօ০੦౦ዐ௦੦౦ჿ૦օℴ౦ｏ௦૦౦";
                    } else {
                        currentLocation = location;
                        switchOnThis = "ｏⲟ੦ჿօ౦೦၀ዐℴ૦౦ჿዐℴ೦ჿ౦ዐօ၀ⲟ૦ዐ০ℴ၀໐౦ｏ၀օ౦ⲟ໐၀";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        String switchOnThis = "௦๐օ೦〇௦০০ዐ০௦০ჿዐℴоℴօዐ੦໐〇০ዐⲟჿ〇ⲟоჿо೦೦০օ௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 495, 152, 68, 383, 635, 68, 383, 530, 474, 425, 516, 362, 75, 586, 677, 257, 33, 96, 481, 495, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦๐օ೦〇௦০০ዐ০௦০ჿዐℴоℴօዐ੦໐〇০ዐⲟჿ〇ⲟоჿо೦೦০օ௦":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "օ〇౦๐০ⲟ૦੦ዐօ੦օ০ዐℴ౦〇ℴዐ੦о੦၀ዐ၀օ๐໐੦〇૦оօ૦০౦";
                    } else {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "ｏо௦೦૦౦ⲟ၀ዐоⲟօ೦ዐℴ೦೦೦ዐ੦๐০ჿዐ〇౦૦੦౦ჿօ၀ⲟჿ০օ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    interface ItemClickListener {

        void onItemClicked(Restaurant restaurant) {
            String switchOnThis = "ℴ০օ๐၀૦੦০ዐ၀ჿ၀ｏዐℴ૦௦౦ዐ੦ℴ௦ⲟዐⲟо০օ๐ⲟ০๐໐ℴ௦๐";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 579, 194, 544, 649, 33, 229, 642, 257, 299, 68, 285, 47, 243, 376, 285, 47, 656, 635, 642, 621, 7, 5, 7, 5 };
            while (infiniteLoop) {
                switch(switchOnThis) {
                    default:
                        infiniteLoop = false;
                }
            }
        }
    }

    static class RestaurantViewHolder extends RecyclerView.ViewHolder {

        ImageView iconView;

        TextView nameView;

        TextView distanceView;

        RestaurantViewHolder(View view) {
            super(view);
            iconView = view.findViewById(R.id.restaurant_list_icon);
            nameView = view.findViewById(R.id.restaurant_list_title);
            distanceView = view.findViewById(R.id.restaurant_list_distance);
        }
    }
}
