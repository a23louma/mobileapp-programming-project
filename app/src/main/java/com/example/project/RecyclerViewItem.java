package com.example.project;

import com.google.gson.annotations.SerializedName;

public class RecyclerViewItem {
    @ SerializedName ("ID")
    private String title;
    private String name;
    @ SerializedName ("location")
    private String origin;
    @ SerializedName ("size")
    private int sizeInCentimeters;
    @ SerializedName ("cost")
    private int waterTemperature;
    @ SerializedName ("company")
    private int difficulty;

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getSizeInCentimeters() {
        return sizeInCentimeters;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    @Override
    public String toString() {
        return "Namn: " + name + "\n" +
                "Härkomst: " + origin + "\n" +
                "Storlek i centimeter: " + sizeInCentimeters + "\n" +
                "Vattentemperatur: " + waterTemperature + "\n";
    }
}
