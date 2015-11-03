package com.vratsasoftware.tito.texteditor;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InfoActivity extends Activity implements View.OnClickListener{
    private EditText textReplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button btnChange = (Button) findViewById(R.id.button_change);
        Button btnCancel = (Button) findViewById(R.id.button_cancel);
        btnChange.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        TextView textTitle = (TextView) findViewById(R.id.textView_title);
        Intent intent = getIntent();
        textTitle.setText(intent.getStringExtra("word"));
        TextView textDefinition = (TextView) findViewById(R.id.text_definition);
        textDefinition.setText(getIntent().getStringExtra("word") + " is some definition...");
        textReplace = (EditText) findViewById(R.id.editText_replace);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_search) {

                Uri uri = Uri.parse("http://www.google.com/#q=" + getIntent().getStringExtra("word"));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_cancel){
            finish();
        } else {
            Intent returnResult = new Intent();
            returnResult.putExtra("replace", String.valueOf(textReplace.getText()));
            setResult(RESULT_OK, returnResult);
            finish();
        }
    }
}
