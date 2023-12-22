//import javafx.util.Pair;
package com.javacodebase.StringOperations;

public class VowelsConsonantsCheck {
    public static void main(String[] args) {
        String s= "Hello this is meghana gushidi";

        int[] vowelsConsonants=getVowelConsonantCount(s);
        System.out.println(s+" has "+vowelsConsonants[0]+" vowels and " + vowelsConsonants[1]+" consonants.");
    }

    public static int[] getVowelConsonantCount(String s){
        char[] ch= s.toCharArray();
        int[] returnValues= new int[2];
        int vowelCount=0, consonantCount=0;
        for(int i=0; i< ch.length; i++){
           if(ch[i] == 'a' || ch[i] =='e' || ch[i] =='i'|| ch[i] =='o'|| ch[i] =='u'){
               vowelCount++;
           } else{
               consonantCount++;
           }
        }
        returnValues[0] = vowelCount;
        returnValues[1] = consonantCount;
        return returnValues;
    }



    ///Another approach
//    String vowels="aeiou";
//    String input="Hello";
//    input = input.toLowerCase().trim();
//    char ch1[]= input.toCharArray();
//        for(char c:ch1){
//        if(input.indexOf(c) != -1){
//            vowelsCount ++;
//        } else if(c != ' '){
//            consonantCount++;
//        }
//    }




}
