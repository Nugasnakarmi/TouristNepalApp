package s.to.touristnepalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Guide extends AppCompatActivity {
    RecyclerView recyclerViewGuide;
    Guide_Adapter adapterGuide;

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

                        "Achyut Hari Rijal",
                        "English/Japanese",
                        "98510-71493",
                        "achyut_rijal@hotmail.com",
                        R.drawable.achut_hari

                )
        );
        guideList.add(
                new GuideList(

                        "Achyut Sigdel",
                        "Chinese/English",
                        "985113732",
                        "achyutsigdel@hotmail.com",
                        R.drawable.achyut_sigdel
                )
        );

        guideList.add(
                new GuideList(

                        "Adwait Man Pradhan",
                        "English/German",
                        " 4411333",
                        " ad_pradhan@gmail.com",
                        R.drawable.adwait
                )
        );

        guideList.add(
                new GuideList(

                        "Ajay K. Dahal",
                        "English/German",
                        " 9851045599",
                        " ajayktm@gmail.com",
                        R.drawable.ajay
                )
        );

        guideList.add(
                new GuideList(

                        "Amar Lamjel",
                        "Chinese/English",
                        " 9851241579,9841358488",

                        " amarsaathi@hotmail.com",
                        R.drawable.amal_lumjel
                )
        );


        adapterGuide = new Guide_Adapter(this, guideList);
        recyclerViewGuide.setAdapter( adapterGuide );
    }
}
