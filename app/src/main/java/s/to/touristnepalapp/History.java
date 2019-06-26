package s.to.touristnepalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        RecyclerView historyList = findViewById(R.id.historicalList);
        historyList.setLayoutManager(new LinearLayoutManager(this));
        String[] places = {"Muktinath", "Bolebambam", "Thamel", "Gosainkunda", "Swyambhunath", "Koteshwar", "Aryaghat", "Lumbini"};
        historyList.setAdapter(new HistoricalAdapter(places));
    }
}
