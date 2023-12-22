package com.javacodebase.codingExercise;

public class Challenge1 {
    public static void main(String[] args) {
        int scoreValue= calculateHighScorePosition(1500);
        displayHighScorePosition("Meghana",  scoreValue);
         scoreValue= calculateHighScorePosition(999);
        displayHighScorePosition("Ram Mohan",  scoreValue);
         scoreValue= calculateHighScorePosition(499);
        displayHighScorePosition("Pavan",  scoreValue);
         scoreValue= calculateHighScorePosition(99);
        displayHighScorePosition("Bharathi",  scoreValue);
         scoreValue= calculateHighScorePosition(-1000);
        displayHighScorePosition("Lakshmana",  scoreValue);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition +" on the high score list");
    }
    public static int calculateHighScorePosition(int score){
        return score >= 1000 ? 1: (score >=500) ? 2: (score >= 100) ? 3: 4;

//        int position = 4;
//        if(score >= 1000){
//            position= 1;
//        } else if(score >= 500 ){
//            position= 2;
//        } else if(score >= 100 ){
//            position= 3;
//        }

//       position;



    }
}
