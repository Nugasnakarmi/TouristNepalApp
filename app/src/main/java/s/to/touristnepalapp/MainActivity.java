package s.to.touristnepalapp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.cardview.widget.CardView;

import android.view.View;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView historyCard, guideCard, contactsCard, directionCard, Card5, Card6;
    private GridView mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining the 6 cards
        historyCard =  findViewById(R.id.historyCard);
        guideCard =  findViewById(R.id.guideCard);
        guideCard.setBackgroundTintMode(PorterDuff.Mode.OVERLAY);
        contactsCard =  findViewById(R.id.contactsCard);
        directionCard =  findViewById(R.id.directionCard);
        Card5 =  findViewById(R.id.Card5);
        Card6 =  findViewById(R.id.Card6);

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
                i = new Intent(this, Card5.class);
                startActivity(i);
                break;

            case R.id.Card6:
                i = new Intent(this, Card6.class);
                startActivity(i);
                break;

            default:
                break;
        }

    }
}
