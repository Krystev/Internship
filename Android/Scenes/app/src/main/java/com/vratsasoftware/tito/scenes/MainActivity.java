package com.vratsasoftware.tito.scenes;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Scene mAScene;
    Scene mAnotherScene;
    Button btn;
    Transition mFadeTransition;
    Transition mChangeBounds;
    Boolean isAnotherScene = false;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isAnotherScene == false) {
                    TransitionManager.go(mAnotherScene, mChangeBounds);
                    isAnotherScene = !isAnotherScene;
                } else {
                    TransitionManager.go(mAScene, mFadeTransition);
                    isAnotherScene = !isAnotherScene;
                }

            }
        });
        ViewGroup mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);
        mAScene = Scene.getSceneForLayout(mSceneRoot, R.layout.a_scene, this);
        mAnotherScene =
                Scene.getSceneForLayout(mSceneRoot, R.layout.another_scene, this);
        mChangeBounds = TransitionInflater.from(this).inflateTransition(R.transition.changebounds);
        mFadeTransition =
                TransitionInflater.from(this).
                        inflateTransition(R.transition.fade_transition);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
