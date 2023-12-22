package com.javacodebase.StringOperations;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String content= """ 
                So many elements come together to make this a fine dining experience unlike any other. 
                The 360 Experience on Discovery Princess was one of the best foodie events I have ever experienced. 
                It was playful and engaging with food that was both perfectly plated and delicious.
                But this was like going through a pinball machine of the senses.
                An Extraordinary Experience is one of the most-unique ventures I've had the pleasure to do.""";
        String[] sentences= content.split("\\."); //sentence count
        System.out.println(Arrays.toString(sentences));
        System.out.println(sentences.length);

        String[] words=content.split(" |-");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

    }
}
