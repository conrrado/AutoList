package com.ccamacho.autolist;

import android.graphics.Bitmap;

public class AutoModel {

    private int imageResource;
    private String name;
    private String power;
    private String year;

    public AutoModel(int imageResource, String name, String power, String year) {
        this.imageResource = imageResource;
        this.name = name;
        this.power = power;
        this.year = year;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public String getYear() {
        return year;
    }
}
