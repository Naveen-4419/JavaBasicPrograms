package com.javacodebase.keywordsAndExpressions;

public class Main {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        int calculatedFinalValue= calculateFinal(gameover, score, levelCompleted, bonus);
        int calculatedFinalValueSecond= calculateFinal(gameover, 10000, 8, 200);
        System.out.println(calculatedFinalValue);
        System.out.println(calculatedFinalValueSecond);
    }

    public static int calculateFinal(boolean gameover, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameover) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score " + finalScore);
        }
        return finalScore;
    }
}
