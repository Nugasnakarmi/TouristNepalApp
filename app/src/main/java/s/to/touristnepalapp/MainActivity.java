package s.to.touristnepalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView historyCard, guideCard, contactsCard, directionCard, Card5, Card6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining the 6 cards
        historyCard = (CardView) findViewById(R.id.historyCard);
        guideCard= (CardView) findViewById(R.id.guideCard);
        contactsCard =(CardView) findViewById(R.id.contactsCard);
        directionCard = (CardView) findViewById(R.id.directionCard);
        Card5=(CardView) findViewById(R.id.Card5);
        Card6=(CardView) findViewById(R.id.Card6);

        //Add click listener
        historyCard.setOnClickListener(this);
        guideCard.setOnClickListener(this);
        contactsCard.setOnClickListener(this);
        directionCard.setOnClickListener(this);
        Card5.setOnClickListener(this);
        Card6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            //on click of CardViews, these Activity(classes) and their layouts are respectively activated
            case R.id.historyCard:
                i = new Intent(this, History.class);
                startActivity(i);
                break;

            case R.id.guideCard:
                i = new Intent(this, Guide.class);
                startActivity(i);
                break;

            case R.id.contactsCard:
                i = new Intent(this, Contacts.class);
                startActivity(i);
                break;

            case R.id.directionCard:
                i = new Intent(this, Directions.class);
                startActivity(i);
                break;

            case R.id.Card5:
                i = new Intent(this,   Card5.class);
                startActivity(i);
                break;

            case R.id.Card6:
                i = new Intent(this, Card6.class);
                startActivity(i);
                break;

            default: break;
        }

    }
}
