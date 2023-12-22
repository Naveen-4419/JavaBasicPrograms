package com.javacodebase.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberUsingQueue {

    public static void main(String[] args) {
        int n=9;

        printBinaryFormat(n);
        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        for(int i=1; i<=n;i++){
           Integer current=queue.remove();
            System.out.println(current);
           queue.add(current*10);
           queue.add(current*10+1);
        }
    }


    public static void printBinaryFormat(int num){
        for(int i=1; i<=num ; i++){
            System.out.println(Integer.toBinaryString(i));
        }
        System.out.println("\n\n");
    }
}

//output:
//1
//10
//11
