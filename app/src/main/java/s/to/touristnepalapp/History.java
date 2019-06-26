package s.to.touristnepalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        RecyclerView historyList = findViewById(R.id.historicalList);
        historyList.setLayoutManager(new LinearLayoutManager(this));


        List<Data> data = fill_with_data();


        historyList.setAdapter(new HistoricalAdapter(data));
    }


    /* Add data here */
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Pashupatinath", "Birthplace of Shiva", R.drawable.pashupatinath));
        data.add(new Data("Shwoyambhunath", "Buddha's Wisdom Place", R.drawable.swayambhunath));
        data.add(new Data("Baghbhairab", "Where the Tiger Bhairav resides", R.drawable.bagh_bhairav));
        data.add(new Data("Lumbini", "Where Buddha was born", R.drawable.lumbini));
        data.add(new Data("Janakpur", "Janaki was born here", R.drawable.janaki_temple));
        data.add(new Data("Muktinath", "The place of salvation", R.drawable.muktinath));

        return data;
    }
}
