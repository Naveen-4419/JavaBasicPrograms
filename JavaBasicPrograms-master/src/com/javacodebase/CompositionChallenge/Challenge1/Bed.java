package com.javacodebase.CompositionChallenge.Challenge1;

public class Bed {
    private String style;
    private int pillows;
    private int heights;
    private int sheets;

    public Bed(String style, int pillows, int heights, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.heights = heights;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    private int quilt;

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeights() {
        return heights;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
    public void make(){
        System.out.print("Bed -> Making | ");
    }
}