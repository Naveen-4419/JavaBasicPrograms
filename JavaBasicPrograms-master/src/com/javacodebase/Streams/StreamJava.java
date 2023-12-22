package com.javacodebase.Streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class StreamJava {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s="Hello World";

        Map<String, Long> map= Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> collect = map.entrySet().stream().filter(i -> i.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
       //you can also find non-duplicates in one line as below
        Map<String, Long> collect1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("collect1"+collect1);

        //find duplicate keys
        List<String> collect2 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(collect2);
        System.out.println(collect);
        System.out.println(map);

        System.out.println("Hello, World!");
        String str="Hello World";

        String strArray[]={"Me", "We", "Me", "Hello"};

        Map<String, Long> map3= Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> map1= Arrays.asList(strArray).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(map1);

        //find first non-repeat element from a given string
        String firstNonRepeatKey = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();

        System.out.println("firstNonRepeatKey: "+firstNonRepeatKey);
        //first repeated character

      String firstRepeatKey  = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(i->i.getValue() > 1).findFirst().get().getKey();
        System.out.println("firstRepeatKey: "+firstRepeatKey);

        int[] numbers={5,9,10,12,15};
        //highest number
        int highestNum= Arrays.stream(numbers).reduce(0, (a,b)-> a > b? a:b);
        System.out.println(highestNum);
        //second highest number

       Integer collect3 = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(collect3);

        String[] strArrays= {"Hello", "HI", "Meghana", "we"};
        String firstLargest = Arrays.stream(strArrays).reduce("", (a, b) -> a.length() > b.length() ? a : b);
        System.out.println(firstLargest);



        //find elements which starts with 1
        int num[]={1,2,3,4,5,6,17,21,19,1111};
        List<String> collect4 = Arrays.stream(num).boxed().map(i -> i + "").collect(Collectors.toList());
       Arrays.stream(num).boxed().map(i->i+"").filter(i->i.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
    //join in string=> String.join method

        Arrays.asList("1","2","3","4");

        List<String> joiningWords=Arrays.asList("Hello","World", "123");
        String joinedWord= joiningWords.stream().collect(Collectors.joining("-", "[", "]"));
        System.out.println(joinedWord);

        //we can also use java 8 feature String.join()
        String otherFormofJoining=String.join("-",joiningWords);
        System.out.println(otherFormofJoining);

        //skip & limit method use case considering 1 to 10
        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);

        //sort a list & map
        List<Integer> intList= List.of(9,5,2,7,1,3);
        intList.stream().sorted();

        List<EmployeeStream> employees=new ArrayList<>(){{
           add(new EmployeeStream(1L, "Meghana", new String[]{"Gushidi", "Meesala"}, List.of(98765, 9876)));
           add(new EmployeeStream(2L, "Ram Mohan", new String[]{"Venkata", "Surya", "Meesala"}, List.of(12345, 143143)));
        }};

        employees.stream().collect(Collectors.groupingBy(EmployeeStream::getId, Collectors.mapping(EmployeeStream::toString,toSet())));

        //map(one to one) example employee to employee id & flatMap(one to many) example employee has many mobile numbers
        //map() for transformation
        //flatMap is for transformation & flattering(converts stream<stream> to a single stream)

        String small[]={"a", "b"};
        Arrays.stream(small).map(i-> i.toUpperCase()).forEach(System.out::println);
        int[][] numOfNum ={{1,2},{3,4}};
        Arrays.stream(numOfNum).flatMap(i-> Arrays.stream(i).boxed()).forEach(System.out::println);


        List<String> stringList= List.of("Megh", "Ram", "Arnav", "Arav");

        stringList.stream().filter(i->i.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
        List<PersonStream> personStream= new ArrayList<>(){{
            add(new PersonStream("Meghana", 27));
            add(new PersonStream("Sita", 30));
            add(new PersonStream("Ram", 33));

        }};

        List<Map.Entry<Integer, String>> collect5 = personStream.stream().collect(Collectors.toMap(PersonStream::getAge, PersonStream::getName)).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList());
      personStream.stream().sorted(Comparator.comparing(PersonStream::getAge).reversed()).collect(Collectors.toList()).forEach(pstr->System.out.println(pstr.getAge()+" "+pstr.getName()));
        System.out.println(collect5);

        personStream.stream().sorted(Comparator.comparing(PersonStream::getAge).reversed()).collect(Collectors.toList());

        String name="Meghana";
      char[] c=name.toCharArray();
      String reverseName="";
      for(char ch:c){
          reverseName=ch + reverseName;
      }
        System.out.println(reverseName);

        String reverse = new StringBuilder(name).reverse().chars().mapToObj(ch-> String.valueOf((char) ch)).collect(Collectors.joining());


        //remove duplicates from a list

        List<String> duplicates=new ArrayList<>(){{
           add("Meghana"); add("Ram"); add("Sai"); add("Sai");
        }};

        Set<String> collect6 = duplicates.stream().collect(toSet());
        System.out.println("collect6"+collect6);

        List<String> stringStream = duplicates.stream().collect(Collectors.groupingBy(Function.identity())).entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(stringStream);

        List<String> inputList = Arrays.asList("Hello world", "I am learning Java");
        List<String> wordsList = inputList.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(wordsList);
        List<Integer> inputList2 = Arrays.asList(1, 10, 2, 3, 4, 5);
        List<Integer> transformedList = inputList2.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(transformedList);

        Integer sum = inputList2.stream().reduce(0, (a, b) -> a + b);
        int sum1 = inputList2.stream().mapToInt(i -> i).sum();
        System.out.println("sum using reduce"+sum+" "+sum1);
        System.out.println(String.format("sum %d %d", sum, sum1));

        OptionalDouble average = inputList2.stream().mapToInt(i -> i * i).filter(i -> i < 100).average();
        System.out.println(average.getAsDouble());

        Optional<Integer> max = inputList2.stream().max(Integer::compare);
        System.out.println(max.get());

        System.out.println(inputList2.stream().min(Integer::compare).get());

        System.out.println(inputList.stream().collect(Collectors.joining(",", "[","]")));

        System.out.println(inputList2.stream().sorted().collect(Collectors.toList()));


    }
}
