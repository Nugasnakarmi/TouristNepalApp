package s.to.touristnepalapp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.cardview.widget.CardView;

import android.view.View;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView historyCard, guideCard, contactsCard, funCard, cultureCard, travelCard;
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
        funCard =  findViewById(R.id.funCard);
        cultureCard =  findViewById(R.id.cultureCard);
        travelCard =  findViewById(R.id.travelCard);

        //Add click listener
        historyCard.setOnClickListener(this);
        guideCard.setOnClickListener(this);
        contactsCard.setOnClickListener(this);
        funCard.setOnClickListener(this);
        cultureCard.setOnClickListener(this);
        travelCard.setOnClickListener(this);

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

            case R.id.funCard:
                i = new Intent(this, Fun.class);
                startActivity(i);
                break;

            case R.id.cultureCard:
                i = new Intent(this, Culture.class);
                startActivity(i);
                break;

            case R.id.travelCard:
                i = new Intent(this, Travel.class);
                startActivity(i);
                break;

            default:
                break;
        }

    }
}
