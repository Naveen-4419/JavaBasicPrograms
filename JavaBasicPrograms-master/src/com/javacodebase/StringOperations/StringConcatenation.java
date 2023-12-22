package com.javacodebase.StringOperations;

public class StringConcatenation {

    public static void main(String[] args) {
        // Immutable
        String name= "Megha";
        String surName= "Gushidi";
        String fullName= name +" "+surName; // here name+" " --> forms a string and (name+" ")+surName --> forms another string

        String fullNameConcat = name.concat(" ").concat(surName); //here name.concat(" ") form new string and then appends with surName and forms another string

        //So while concatenating multiple strings are getting added

        //mutuable classes
        StringBuilder stringBuilder= new StringBuilder("Megha"); // Faster compared to buffer
        stringBuilder.append("Ram");
        stringBuilder.append(" ");
        stringBuilder.append("Gushidi");
        stringBuilder.insert(0, "Sai ");

        stringBuilder.delete(9,12);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer= new StringBuffer("Megha"); // this is thread-safe and synchronized
        stringBuffer.append("Ram");
        stringBuffer.append(" ");
        stringBuffer.append("Gushidi");
        stringBuffer.insert(0, "Sai ");

        stringBuffer.delete(9,12);
        System.out.println(stringBuffer);
    }
}
