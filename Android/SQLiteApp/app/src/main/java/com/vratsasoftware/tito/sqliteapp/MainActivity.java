package com.vratsasoftware.tito.sqliteapp;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSave;
    Button btnShow;
    EditText etShow;
    EditText etMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etShow = (EditText) findViewById(R.id.et_main_show);
        etMain = (EditText) findViewById(R.id.et_main1);
        btnSave = (Button) findViewById(R.id.btn_main_save);
        btnSave.setOnClickListener(this);
        btnShow = (Button) findViewById(R.id.btn_main_show);
        btnShow.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_main_save) {
            DBPref pref = null;
            try {
                pref = new DBPref(getApplicationContext());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            pref.addRecord(etMain.getText().toString());
        } else {
            DBPref pref = null;
            try {
                pref = new DBPref(getApplicationContext());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Cursor c = pref.getVals();
            StringBuilder b = new StringBuilder();
            if (c.moveToFirst()) {
                do {
                    b.append(c.getString(c.getColumnIndex("val")));
                    b.append(" , ");
                } while (c.moveToNext());
            }
            c.close();
            pref.close();
            etShow.setText(b.toString());
        }
    }
}
