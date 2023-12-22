package com.javacodebase.codingExercise;


public class FlourPack {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal > 0 && bigCount >= 0 && smallCount >= 0) {
            if (goal >= 5 && bigCount != 0) {
                int minGoalForBigCount = goal / 5;
                int minGoalForSmallCount = goal % 5, endGoal, actualBigCount=5*bigCount;
                if (bigCount >= minGoalForBigCount) {
                    endGoal = goal > actualBigCount ? goal - 5 * bigCount: goal-5*minGoalForBigCount ;
                    if (endGoal <= minGoalForSmallCount && endGoal <= smallCount) {
                        return true;
                    }
                    if (endGoal == 0) {

                        return true;
                    }
                    return false;
                }


            } else {
                System.out.println("Im here");
                if (smallCount >= goal) {
                    System.out.println("mjnj");
                    return true;
                }
                return false;
            }
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canPack(2,10,18));
    }
}