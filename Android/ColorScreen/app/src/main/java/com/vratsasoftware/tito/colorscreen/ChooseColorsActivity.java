package com.vratsasoftware.tito.colorscreen;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class ChooseColorsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4;
    Random random;
    int color1, color2, color3, color4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_colors);
        btn1 = (Button) findViewById(R.id.button_1);
        btn2 = (Button) findViewById(R.id.button_2);
        btn3 = (Button) findViewById(R.id.button_3);
        btn4 = (Button) findViewById(R.id.button_4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        random = new Random();

    }

    @Override
    protected void onResume() {
        super.onResume();

        color1 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        color2 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        color3 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        color4 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

        btn1.setBackgroundColor(color1);
        btn2.setBackgroundColor(color2);
        btn3.setBackgroundColor(color3);
        btn4.setBackgroundColor(color4);

    }

    @Override
    public void onClick(View v) {
        Intent returnResult = new Intent();
        switch (v.getId()) {
            case R.id.button_1:
                returnResult.putExtra("RESULT_COLOR", color1);
                setResult(RESULT_OK, returnResult);
                finish();
                break;
            case R.id.button_2:
                returnResult.putExtra("RESULT_COLOR", color2);
                setResult(RESULT_OK, returnResult);
                finish();
                break;
            case R.id.button_3:
                returnResult.putExtra("RESULT_COLOR", color3);
                setResult(RESULT_OK, returnResult);
                finish();
                break;
            case R.id.button_4:
                returnResult.putExtra("RESULT_COLOR", color4);
                setResult(RESULT_OK, returnResult);
                finish();
                break;
            default:
                break;
        }

    }
}
