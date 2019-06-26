package s.to.touristnepalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private Context mContext;
    private List<GuideList> guideList;

    public Adapter(Context mContext, List<GuideList> guideList) {
        this.mContext = mContext;
        this.guideList = guideList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.guidelist, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GuideList guide = guideList.get(position);

        holder.textViewName.setText( guide.getName() );
        holder.roundedImageView.setImageDrawable( mContext.getResources().getDrawable( guide.getImage() ,null));
    }

    @Override
    public int getItemCount() {
        return guideList.size(); //Important to return size or length of list
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RoundedImageView roundedImageView;
        TextView textViewName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView= itemView.findViewById( R.id.rimageViewguide);
            textViewName = itemView.findViewById( R.id.textguide);
        }
    }
}
