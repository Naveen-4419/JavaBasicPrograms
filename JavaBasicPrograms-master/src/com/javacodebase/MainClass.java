package com.javacodebase;

public class MainClass {
    public static void main(String[] args) {

       int arrayNumber[]= {1,2,3,4,5,6,70,71, 78,101};
       int userInput=78;
        int searchResult= binarySearch(arrayNumber,userInput);
        System.out.println(searchResult);

    }
    public static  int binarySearch(int[] arrayNumbers, int userInput){
        int low=0, right=arrayNumbers.length-1;
        while (low<=right) {
            int midValue = low + (right - low);///2; //low=0,right=5, mid = 0+5-0 = 5

            if (arrayNumbers[midValue] == userInput){
                return midValue;
            }
            else if(arrayNumbers[midValue] < userInput){
                low = midValue +1;
            } else{
                right = midValue -1;
            }
        }
        return -1;
    }
}
