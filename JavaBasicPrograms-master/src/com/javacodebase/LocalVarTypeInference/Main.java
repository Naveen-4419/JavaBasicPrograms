package com.javacodebase.LocalVarTypeInference;

import java.util.List;

public class Main {
    //var name="ljsls"; throws error
    public static void main(String[] args) {

        //Restricted only for local variable, compiler will know which data type we are specifying based on value provided
        var listOfInt= List.of(1,2,3,4,5,6);
        var name="Meghana";
        var salary=12345.00;
    }
}
