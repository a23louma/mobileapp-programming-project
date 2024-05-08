package com.example.project;

import com.google.gson.annotations.SerializedName;

public class RecyclerViewItem {
    @ SerializedName ("name")
    private String title;
   // private String ID;
    @ SerializedName ("location")
    private String origin;
    @ SerializedName ("size")
    private int sizeInCentimeters;
    @ SerializedName ("cost")
    private int waterTemperature;
    @ SerializedName ("company")
    private String difficulty;

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    //public String getID() { return ID; }

    public String getOrigin() {
        return origin;
    }

    public int getSizeInCentimeters() {
        return sizeInCentimeters;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public String getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return "Namn: " + title + "\n" +
                "Härkomst: " + origin + "\n" +
                "Storlek i centimeter: " + sizeInCentimeters + "\n" +
                "Vattentemperatur: " + waterTemperature + "\n" +
                "Svårighetsgrad: " + difficulty + "\n";
    }
}
