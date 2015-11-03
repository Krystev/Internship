package com.vratsasoftware.tito.texteditor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Text extends AppCompatActivity {

    private static final int REPLACE_REQUEST = 1;
    private Button btnConfirm;
    private EditText searchTxt;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        btnConfirm = (Button) findViewById(R.id.button_confirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int intIndex = String.valueOf(text.getText()).toLowerCase().indexOf(String.valueOf(searchTxt.getText()).toLowerCase());

                if (intIndex == -1) {
                    Toast.makeText(Text.this, "Word not found!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Text.this, InfoActivity.class);
                    intent.putExtra("word", String.valueOf(searchTxt.getText()));
                    startActivityForResult(intent, REPLACE_REQUEST);
                }

            }
        });
        text = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String getText = intent.getStringExtra("text");
        if (getText != null) {
            text.setText(getText);
        }
        searchTxt = (EditText) findViewById(R.id.search_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_search) {
            searchTxt.setVisibility(View.VISIBLE);
            btnConfirm.setVisibility(View.VISIBLE);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REPLACE_REQUEST) {
            if (resultCode == RESULT_OK) {
                String replaceWord = data.getStringExtra("replace");
                text.setText(String.valueOf(text.getText()).replace(String.valueOf(searchTxt.getText()), replaceWord), TextView.BufferType.SPANNABLE);
                Spannable s = (Spannable) text.getText();
                int index = 0;
                while (index != -1) {
                    int start = String.valueOf(text.getText()).indexOf(replaceWord, index);
                    int end = start + replaceWord.length();
                    s.setSpan(new ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    index = String.valueOf(text.getText()).indexOf(replaceWord, index + 1);
                }


            }
        }

    }
}
