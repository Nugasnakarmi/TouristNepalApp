package s.to.touristnepalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Guide extends AppCompatActivity {
    RecyclerView recyclerViewGuide;
    Adapter adapterGuide;

    List<GuideList> guideList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        guideList = new ArrayList<>();

       recyclerViewGuide  = findViewById( R.id.recyclerView_guide );
       recyclerViewGuide.setHasFixedSize( true ); // doesnt matter if element size fluctuates if defined true

        recyclerViewGuide.setLayoutManager( new LinearLayoutManager(this ));

        guideList.add(
                new GuideList(

                        "Ravi Tamang",
                        R.drawable.basantapursquare
                )
        );
        guideList.add(
                new GuideList(

                        "Sagun Nakarmi",
                        R.drawable.suspensionbridge
                )
        );

        guideList.add(
                new GuideList(

                        "Purak Adhikari",
                        R.drawable.bhakta_golden_gate
                )
        );

        guideList.add(
                new GuideList(

                        "Gaurav Subedi",
                        R.drawable.prayer_wheels
                )
        );

        guideList.add(
                new GuideList(

                        "Sagar Nakarmi",
                        R.drawable.mountains
                )
        );


        adapterGuide = new Adapter(this, guideList);
        recyclerViewGuide.setAdapter( adapterGuide );
    }
}
