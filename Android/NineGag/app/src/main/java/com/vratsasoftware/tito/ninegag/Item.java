package com.vratsasoftware.tito.ninegag;


import android.widget.Button;

public class Item {

    private String name;



    private int points;
    private int image;

    public Item(String name, int value, int image) {
        this.name = name;
        this.points = value;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getImage() {
        return image;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
