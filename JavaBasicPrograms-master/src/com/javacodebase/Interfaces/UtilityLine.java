package com.javacodebase.Interfaces;

public class UtilityLine implements Mappable{

    private String name;
    private UsageType usage;

    public UtilityLine(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }
    @Override
    public String getLabel() {
        return name+"("+usage+")";
    }

    @Override
    public String getMarker() {
        return switch(usage){
            case Sports -> Color.BLACK +"" + PointMarkers.CIRCLE;
            case Residental -> Color.BLUE +"" + PointMarkers.SQUARE;
            case Government -> Color.PINK +"" + PointMarkers.STAR;
            case Entertainment -> Color.GREEN +"" + PointMarkers.TRIANGLE;
            default -> Color.BLACK +"" +PointMarkers.DIAMOND;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }
}
