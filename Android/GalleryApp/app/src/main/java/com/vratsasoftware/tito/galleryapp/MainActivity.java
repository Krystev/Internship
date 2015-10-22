package com.vratsasoftware.tito.galleryapp;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;


public class MainActivity extends Activity {
    ViewPager viewPager;
    ImageAdapter adapter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }

}
