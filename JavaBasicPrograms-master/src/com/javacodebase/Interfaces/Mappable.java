package com.javacodebase.Interfaces;


enum Geometry{
    LINE,POINT,POLYGON;
}

enum Color{
    BLACK,BLUE,GREEN,PINK,YELLOW;
}

enum PointMarkers{
    CIRCLE,TRIANGLE, STAR, PUSH_PIN, SQUARE, DIAMOND;
}
enum LineMarkers{
    DASHED,DOTTED,SOLID;
}

enum Type{
    Building, UtilityLine;
}
public interface Mappable {
    String JSON_PROPERTY= """
            "properties":{%s}
            """;
    String getLabel();
    String getMarker();
    Geometry getShape();
    default String toJSON(){
        return """
                "type":"%s", "label":"%s", "marker":"%s"
                """.formatted(getShape(),getLabel(),getMarker());
    }
    static void mapIt(Mappable mappable){
        System.out.println("In interface "+JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
