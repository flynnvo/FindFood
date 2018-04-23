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

/**
 * List adapter for the notes list for a restaurant
 */
public class RestaurantNotesListAdapter extends RecyclerView.Adapter<RestaurantNotesListAdapter.RestaurantViewHolder> {

    /**
     * Notes on the restaurant to display
     */
    private List<RestaurantNote> dataset;

    /**
     * Listener for any items clicked in the list
     */
    private ItemClickListener itemClickListener;

    /**
     * Listener for any items long-clicked in the list
     */
    private ItemClickListener itemLongClickListener;

    RestaurantNotesListAdapter() {
        dataset = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_list_item, parent, false);
        return new RestaurantViewHolder(itemView);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        RestaurantNote note = dataset.get(position);
        holder.noteView.setText(note.getNote());
        if (itemClickListener != null) {
            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(note));
        }
        if (itemLongClickListener != null) {
//            Log.d("LONG", "onBindViewHolder: LONG");
//            holder.itemView.setLongClickable(true);
            holder.itemView.setOnLongClickListener(view -> {
                itemLongClickListener.onItemClicked(note);
                return true;
            });
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
     * @param notes the notes to display
     */
    void setItems(List<RestaurantNote> notes) {
        Log.d("notes loaded", "setItems: " + notes.size());
        this.dataset = notes;
        notifyDataSetChanged();
    }

    /**
     * @param itemClickListener the item click listener to set
     */
    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    /**
     * @param itemLongClickListener the item click listener to set
     */
    public void setOnItemLongClickListener(ItemClickListener itemLongClickListener) {
        this.itemLongClickListener = itemLongClickListener;
    }

    /**
     * Generic interface for listening to list item clicks
     */
    interface ItemClickListener {

        /**
         * Method to call when an item is clicked
         *
         * @param note the note that is clicked
         */
        void onItemClicked(RestaurantNote note);
    }

    /**
     * Holder used to keep list item's views
     */
    static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        TextView noteView;

        RestaurantViewHolder(View view) {
            super(view);
            noteView = view.findViewById(R.id.note_list_title);
        }
    }
}
