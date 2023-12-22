package com.javacodebase;

public class SampleCodeImplementationClass {
    public <T> Object genericMethod(T pichuk){
        return pichuk;

    }
    public static void main(String[] args) {
        SampleCodeImplementationClass sci=new SampleCodeImplementationClass();

        SampleCode<Integer> sc= new SampleCode<>();
        sc.setName(10);
        System.out.println(sc.getName());
        SampleCode<String> sc1= new SampleCode<>();
        sc1.setName("Meghana");
        System.out.println(sc1.getName());

        System.out.println(sci.genericMethod("Meghana is Queen"));
        System.out.println(sci.genericMethod(10));




    }
}
