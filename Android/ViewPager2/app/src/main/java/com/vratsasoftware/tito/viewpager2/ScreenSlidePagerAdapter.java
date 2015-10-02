package com.vratsasoftware.tito.viewpager2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Tito on 29.9.2015 г..
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {


    private static final int NUM_PAGES = 5;

    public ScreenSlidePagerAdapter(FragmentManager fm) {

        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if (position % 2 == 0) {
            return new ScreenSlidePageFragment();
        } else {
            return new ScreenSlidePageFragment2();
        }

    }

    @Override
    public int getCount() {

        return NUM_PAGES;
    }
}