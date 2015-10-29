package com.vratsasoftware.tito.tictactoeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSinglePlayer, btnMultiplayer;
    ImageView imageViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMultiplayer = (Button) findViewById(R.id.button_multiplayer);
        btnMultiplayer.setOnClickListener(this);
        btnSinglePlayer = (Button) findViewById(R.id.button_single_player);
        btnSinglePlayer.setOnClickListener(this);
        imageViewTitle = (ImageView) findViewById(R.id.imageView);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        if (v.getId() == btnMultiplayer.getId()) {
            intent = new Intent(this, Multiplayer.class);
            startActivity(intent);
        } else {
            intent = new Intent(this, SinglePlayer.class);
            startActivity(intent);
        }
    }
}
