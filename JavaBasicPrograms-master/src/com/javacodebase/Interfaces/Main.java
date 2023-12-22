package com.javacodebase.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables= new ArrayList<Mappable>();

        mappables.add(new Building("MeghanaRam Mansion", UsageType.Residental));
        mappables.add(new Building("RamMeghana Bungalow",UsageType.Entertainment ));
        mappables.add(new Building("Stadium", UsageType.Sports));
        mappables.add(new UtilityLine("MegRa", UsageType.Residental));


        for(var m : mappables){
            Mappable.mapIt(m);
        }


    }
}
