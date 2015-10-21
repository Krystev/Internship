package com.vratsasoftware.tito.colorscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static int GET_COLOR_REQUEST = 1;
    Button chooseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chooseButton = (Button) findViewById(R.id.button_choose);
        chooseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ChooseColorsActivity.class);
        startActivityForResult(intent, GET_COLOR_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GET_COLOR_REQUEST) {
            if (resultCode == RESULT_OK) {
                int result = data.getIntExtra("RESULT_COLOR", 0);
                setActivityBackgroundColor(result);
            }
        }
    }

    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}
