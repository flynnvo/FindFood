package nz.co.g1.a702.findfood;

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

    RestaurantListAdapter() {
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Restaurant restaurant = dataset.get(position);
        holder.nameView.setText(restaurant.getName());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    void setItems(List<Restaurant> restaurants) {
        this.dataset = restaurants;
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameView;

        ViewHolder(View view) {
            super(view);
            nameView = view.findViewById(android.R.id.text1);
        }
    }
}
