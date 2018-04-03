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
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_list_item, parent, false);
        return new RestaurantViewHolder(itemView);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = dataset.get(position);
        holder.iconView.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getType().getDrawableResId()));
        holder.nameView.setText(restaurant.getName());
        holder.distanceView.setText(restaurant.distanceFrom(currentLocation));
        if (itemClickListener != null) {
            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(restaurant));
        }
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    void setItems(List<Restaurant> restaurants) {
        this.dataset = restaurants;
        notifyDataSetChanged();
    }

    public void setDistanceLocation(Location location) {
        currentLocation = location;
    }

    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    interface ItemClickListener {
        void onItemClicked(Restaurant restaurant);
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
