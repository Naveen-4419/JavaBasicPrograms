package com.javacodebase.Collections;

import java.util.HashMap;

public class RepeatedWord {
    public static String []commonWords={"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","part"};

    public static void main(String[] args) {
        String text= "Lorem Lorem Lorem Ipsum Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.";
        String textArray[]= text.split(" ");
         String mostRepeatedWord= findMostRepeatedWord(textArray);
        System.out.println(mostRepeatedWord);
    }
    public static String findMostRepeatedWord(String []textArray){
        HashMap<String, Integer> hashMap= new HashMap<>();
        for(int i=0; i< textArray.length; i++){
            if(hashMap.containsKey(textArray[i]) && !isPresent(textArray[i])){
                   int value=hashMap.get(textArray[i]);
                hashMap.put(textArray[i], value+1);
                System.out.println(hashMap);
            }else{
                hashMap.put(textArray[i], 1);
            }
        }

        

        return "Megh";

    }

    public static boolean isPresent(String word){

        for(String item: commonWords){
            if(item.equals(word)){
                return true;
            }
        }
        return false;


    }

}
