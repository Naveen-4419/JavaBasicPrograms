package com.javacodebase.basics;

public class LoopCode {
    public static void main(String args[]){
    boolean isAlive = true;
    if( isAlive == true){
        // this == or equality operator tests whether these two values are equal and then
        //   returns the boolean value as the return
        System.out.println("I'm alive " +isAlive);
    }

    double firstVariable = 20;
    double secondVar = 80;
    double product = (firstVariable + secondVar) * 100;
    double restVal = product % 40;
    boolean val = (restVal == 0.00) ? true : false;

    System.out.println(val);

    if(!val){
        System.out.println("got some remainder");
    }


    }
}
