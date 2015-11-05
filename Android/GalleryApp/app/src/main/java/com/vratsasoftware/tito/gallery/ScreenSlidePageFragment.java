package com.vratsasoftware.tito.gallery;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ScreenSlidePageFragment extends Fragment {
    private Integer itemData;
    private Bitmap myBitmap;
    private ImageView imageView;

    public static ScreenSlidePageFragment newInstance() {
        return new ScreenSlidePageFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
        imageView = (ImageView) rootView.findViewById(R.id.imageView);
        setImageInViewPager();
        return rootView;
    }

    public void setImageList(Integer integer) {
        this.itemData = integer;
    }

    public void setImageInViewPager() {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            myBitmap = BitmapFactory.decodeResource(getResources(), itemData,
                    options);
            if (options.outWidth > 1000 || options.outHeight > 1000) {
                options.inSampleSize = 2;
            }
            options.inJustDecodeBounds = false;
            myBitmap = BitmapFactory.decodeResource(getResources(), itemData,
                    options);
            if (myBitmap != null) {
                try {
                    if (imageView != null) {
                        imageView.setImageBitmap(myBitmap);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            System.gc();
        }

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (myBitmap != null) {
            myBitmap.recycle();
            myBitmap = null;
        }
    }
}
