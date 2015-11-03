package com.vratsasoftware.tito.texteditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDefTxt, btnEnterTxt, btnOK;
    EditText editText;
    boolean isEnterPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDefTxt = (Button) findViewById(R.id.button_def_text);
        btnDefTxt.setOnClickListener(this);
        btnEnterTxt = (Button) findViewById(R.id.button_enter_text);
        btnEnterTxt.setOnClickListener(this);
        btnOK = (Button) findViewById(R.id.button_ok);
        btnOK.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.editText);
        isEnterPressed = false;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Text.class);;
        switch (v.getId()) {
            case (R.id.button_enter_text):
                if (isEnterPressed == false) {
                    editText.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                } else {
                    editText.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                }
                isEnterPressed = !isEnterPressed;
                break;
            case (R.id.button_def_text):
                startActivity(intent);
                break;
            case (R.id.button_ok):
                intent.putExtra("text", String.valueOf(editText.getText()));
                startActivity(intent);
        }
    }
}
