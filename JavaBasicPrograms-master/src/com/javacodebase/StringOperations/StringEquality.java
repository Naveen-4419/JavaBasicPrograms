package com.javacodebase.StringOperations;

public class StringEquality {
    public static void main(String[] args) {
        String literalA= "Megha";
        String literalB= "Megha";
        String newStringA= new String("Megha");
        String newStringB= new String("Megha");

        //using ==
        System.out.println(literalA == literalB); //True, since stringLiteral uses string pool, same literal values refer to same reference
        System.out.println(literalA == newStringA); //False
        System.out.println(literalB == newStringB); //False

        //using equals()
        System.out.println(literalA.equals(literalB)); //true
        System.out.println(literalA.equals(newStringA)); //true
        System.out.println(literalB.equals(newStringB)); //true
    }
}
