package com.vratsasoftware.tito.ninegag;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        int imageResult = getIntent().getIntExtra("image", 1);
        String nameResult = getIntent().getStringExtra("name");
        int pointsResult = getIntent().getIntExtra("points", 0);
        ImageView image = (ImageView) findViewById(R.id.imageView_details);
        image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        TextView name = (TextView) findViewById(R.id.txt_item_name_details);
        TextView points = (TextView) findViewById(R.id.txt_item_points_details);
        Button voteUp = (Button) findViewById(R.id.button3);
        Button voteDown = (Button) findViewById(R.id.button4);
        image.setImageResource(imageResult);
        name.setText(nameResult);
        points.setText(String.valueOf(pointsResult));


    }

}
