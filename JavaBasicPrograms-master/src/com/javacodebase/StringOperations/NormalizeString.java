package com.javacodebase.StringOperations;

import java.util.List;
import java.util.stream.Collectors;

public class NormalizeString {
    public static void main(String[] args) {
        String hen="Hen-Chicken";
        String cow="Cow-Beef";
        String pig="Pig-pork";
        String emptyString=" ";

        List<String> animalMeat = List.of(hen,cow,pig,emptyString);
        animalMeat.stream().forEach(i-> System.out.println(i.trim()));

        List<String> listOfAnimal= animalMeat.stream().map(i-> (i.trim())).collect(Collectors.toList());
        System.out.println(listOfAnimal);

        List<String> animalList= animalMeat.stream().filter(i->!i.isBlank()).collect(Collectors.toList());

        System.out.println(animalList);
    }
}
