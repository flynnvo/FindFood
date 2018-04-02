package nz.co.g1.a702.findfood;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
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


public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.ViewHolder> {
    private Context context;
    private List<Restaurant> dataset;
    private Location currentLocation;

    RestaurantListAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Restaurant restaurant = dataset.get(position);
        holder.iconView.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getType().getDrawableResId()));
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
        ImageView iconView;
        TextView nameView;
        TextView distanceView;

        ViewHolder(View view) {
            super(view);
            iconView = view.findViewById(R.id.restaurant_list_icon);
            nameView = view.findViewById(R.id.restaurant_list_title);
            distanceView = view.findViewById(R.id.restaurant_list_distance);
        }
    }
}
