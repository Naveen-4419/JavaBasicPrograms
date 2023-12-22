package com.javacodebase.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        //Stream using Array
        String names[]= new String[]{
                "Meghana", "Ram", "Meera", "Gushidi", "Meesala"
        };
        Stream<String> streamOfArrayItem= Arrays.stream(names);
        streamOfArrayItem.forEach(System.out::println);

        //Stream using Lists
        List<String> fruitList = List.of("Apples", "Mango", "Cherry", "Bananas");
        Stream<String> fruitListStream = fruitList.stream();
        fruitListStream.forEach(System.out::print); // syntactic sugar(Method reference) of forEach(x -> System.out.println(x))

        //for parallelStreaming
        fruitList.parallelStream().forEach(System.out::println);

        //for boolean validation
        boolean isList = fruitList.stream().anyMatch(item -> item.equalsIgnoreCase("apples"));
        System.out.println(isList);

        //Filter

        Stream<String> hasE = fruitList.stream().filter(item -> item.startsWith("A"));

        //map
        List<Integer> listOfInteger = List.of(1,2,3,4);
        Stream<Integer> streamOfInt = listOfInteger.stream().map(i -> i*i);
        streamOfInt.forEach(System.out::println); // forEach(i-> s.o.t(i));
        List<Integer> doubledList= listOfInteger.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(doubledList);



    }
}
