package s.to.touristnepalapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class HistoricalAdapter extends RecyclerView.Adapter<HistoricalAdapter.historicalViewHolder> {

    private String[] data;


    public HistoricalAdapter(String[] data) {
        this.data = data;
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
        String title = data[position];
        holder.placeName.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class historicalViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView placeName;
        CardView historicalCardView;

        public historicalViewHolder(View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            placeName = (TextView) itemView.findViewById(R.id.placeName);
            historicalCardView = (CardView) itemView.findViewById(R.id.historicalCardView);
        }
    }
}
