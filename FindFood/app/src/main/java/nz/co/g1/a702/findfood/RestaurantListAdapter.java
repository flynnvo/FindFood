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

/**
 * List adapter for the restaurant list
 */
public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder> {

    /**
     * Current activity's context
     */
    private Context context;

    /**
     * Restaurants to display
     */
    private List<Restaurant> dataset;

    /**
     * Device's current or last known location
     */
    private Location currentLocation;

    /**
     * Listener for any items clicked in the list
     */
    private ItemClickListener itemClickListener;

    RestaurantListAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_list_item, parent, false);
        return new RestaurantViewHolder(itemView);
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public int getItemCount() {
        return dataset.size();
    }

    /**
     * Sets the data for this adapter
     *
     * @param restaurants the restaurants to display
     */
    void setItems(List<Restaurant> restaurants) {
        this.dataset = restaurants;
        notifyDataSetChanged();
    }

    /**
     * Set the location to use for calculating restaurant distances
     *
     * @param location the location to use
     */
    public void setDistanceLocation(Location location) {
        currentLocation = location;
    }

    /**
     * @param itemClickListener the item click listener to set
     */
    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    /**
     * Generic interface for listening to list item clicks
     */
    interface ItemClickListener {

        /**
         * Method to call when an item is clicked
         *
         * @param restaurant the restaurant that is clicked
         */
        void onItemClicked(Restaurant restaurant);
    }

    /**
     * Holder used to keep list item's views
     */
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
