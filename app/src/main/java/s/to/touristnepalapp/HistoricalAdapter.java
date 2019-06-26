package s.to.touristnepalapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class HistoricalAdapter extends RecyclerView.Adapter<HistoricalAdapter.historicalViewHolder> {

    List<Data> list = Collections.emptyList();

    public HistoricalAdapter(List<Data> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public historicalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.hist_item_layout, parent, false);
        return new historicalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull historicalViewHolder holder, int position) {
        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.placeName.setText(list.get(position).placeName);
        holder.imgIcon.setImageResource(list.get(position).imageId);
        holder.placeDesc.setText(list.get(position).placeDesc);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    /* View Holder for our View */

    public class historicalViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView placeName;
        TextView placeDesc;
        CardView historicalCardView;

        public historicalViewHolder(View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            placeName = itemView.findViewById(R.id.placeName);
            historicalCardView = itemView.findViewById(R.id.historicalCardView);
            placeDesc = itemView.findViewById(R.id.placeDesc);
        }
    }
}
