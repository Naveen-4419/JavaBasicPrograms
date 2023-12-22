package com.javacodebase.codingExercise.patternPrograms;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(5);
    }
    public static void pattern31(int number){
        int val=0;
        int n=2*number;
        for(int rows=1; rows<=n-1; rows++){
            for(int columns=1; columns <= n-1; columns++) {
                val= number- Math.min(Math.min(rows,columns), Math.min(n - rows,n-columns));
                System.out.print(val +" ");
            }
            System.out.println();
        }

    }
}

//output:
//val = Math.min(rows,columns)
//        1 1 1 1 1 1 1 1 1
//        1 2 2 2 2 2 2 2 2
//        1 2 3 3 3 3 3 3 3
//        1 2 3 4 4 4 4 4 4
//        1 2 3 4 5 5 5 5 5
//        1 2 3 4 5 6 6 6 6
//        1 2 3 4 5 6 7 7 7
//        1 2 3 4 5 6 7 8 8
//        1 2 3 4 5 6 7 8 9


//val= Math.min(Math.min(rows,columns), Math.min(2*number - rows,2*number-columns));
//        1 1 1 1 1 1 1 1 1
//        1 2 2 2 2 2 2 2 1
//        1 2 3 3 3 3 3 2 1
//        1 2 3 4 4 4 3 2 1
//        1 2 3 4 5 4 3 2 1
//        1 2 3 4 4 4 3 2 1
//        1 2 3 3 3 3 3 2 1
//        1 2 2 2 2 2 2 2 1
//        1 1 1 1 1 1 1 1 1

//val= number- Math.min(Math.min(rows,columns), Math.min(2*number - rows,2*number-columns));
//4 4 4 4 4 4 4 4 4
//        4 3 3 3 3 3 3 3 4
//        4 3 2 2 2 2 2 3 4
//        4 3 2 1 1 1 2 3 4
//        4 3 2 1 0 1 2 3 4
//        4 3 2 1 1 1 2 3 4
//        4 3 2 2 2 2 2 3 4
//        4 3 3 3 3 3 3 3 4
//        4 4 4 4 4 4 4 4 4