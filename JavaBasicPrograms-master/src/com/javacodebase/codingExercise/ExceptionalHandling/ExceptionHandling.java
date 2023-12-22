package com.javacodebase.codingExercise.ExceptionalHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            throw new MyException();
        } catch(MyException me){
            System.out.println("My Exception");
        }
    }

}
