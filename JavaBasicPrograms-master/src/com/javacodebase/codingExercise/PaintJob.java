package com.javacodebase.codingExercise;


public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double areaOftheWall = width*height;
            double bucketsNeeded= areaOftheWall/areaPerBucket;
            if(extraBuckets >= bucketsNeeded){
                bucketsNeeded=0;
                return (int)bucketsNeeded;
            }else if(extraBuckets >0){
                bucketsNeeded = bucketsNeeded-extraBuckets;
                bucketsNeeded = Math.ceil(bucketsNeeded);
            }
            else{
                bucketsNeeded= Math.ceil(bucketsNeeded);
            }
            System.out.println(areaOftheWall);
            return (int)bucketsNeeded;
        }

    }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
            return -1;
        } else{
            double areaOftheWall = width*height;
            double bucketsNeeded= areaOftheWall/areaPerBucket;
            if(Math.ceil(bucketsNeeded) > 0){
                return (int)(Math.ceil(bucketsNeeded));
            }
            return -1;

        }
    }

    public static int getBucketCount( double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0 ) {
            return -1;
        } else{
            double bucketsNeeded= area/areaPerBucket;
            if(Math.ceil(bucketsNeeded) > 0){
                return (int)(Math.ceil(bucketsNeeded));
            }
            return -1;

        }
    }



    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4,2.1,1.5));
    }
}