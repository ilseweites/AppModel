package com.example.appmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView favorites,audios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining main cards
        favorites = (CardView) findViewById(R.id.favorites);
        audios = (CardView) findViewById(R.id.audios);
        //Add Click listener to the cards
        favorites.setOnClickListener(this);
        audios.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.favorites:
                i = new Intent(this, Favorites.class);
                startActivity(i);
                break;
            case R.id.audios:
                i = new Intent(this, Audios.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}

