package com.vratsasoftware.tito.gallery;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {


    private ArrayList<Integer> images;

    public ScreenSlidePagerAdapter(FragmentManager fm, ArrayList<Integer> images) {
        super(fm);
        this.images = images;
    }


    @Override
    public Fragment getItem(int position) {
        ScreenSlidePageFragment screen = ScreenSlidePageFragment.newInstance();
        screen.setImageList(images.get(position));
        return screen;
    }

    @Override
    public int getCount() {

        return images.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}