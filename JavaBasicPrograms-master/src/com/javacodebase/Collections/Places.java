package com.javacodebase.Collections;

public class Places {
    private String placeName;
    private double distance;

    @Override
    public String toString() {
        return "Places{" +
                "placeName='" + placeName + '\'' +
                ", distance=" + distance +
                '}';
    }

    public Places() {
    }

    public Places(String placeName, double distance) {
        this.placeName = placeName;
        this.distance = distance;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
