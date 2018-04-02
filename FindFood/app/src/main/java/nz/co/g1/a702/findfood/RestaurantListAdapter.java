package nz.co.g1.a702.findfood;

import android.annotation.SuppressLint;
import android.location.Location;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nz.co.g1.a702.findfood.placesapi.Restaurant;


public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.ViewHolder> {
    private List<Restaurant> dataset;
    private Location currentLocation;

    RestaurantListAdapter() {
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_2, parent, false);
        return new ViewHolder(itemView);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Restaurant restaurant = dataset.get(position);
        holder.nameView.setText(restaurant.getName());
        holder.distanceView.setText(restaurant.distanceFrom(currentLocation));
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

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameView;
        TextView distanceView;

        ViewHolder(View view) {
            super(view);
            nameView = view.findViewById(android.R.id.text1);
            distanceView = view.findViewById(android.R.id.text2);
        }
    }
}
