package com.javacodebase.basics;

public class typeConversion {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Byte b= 10;
        short s=20;
        int i= 50;
        long l= 50000L + 10*(b + s + i);
        int byteValue = b;
        System.out.println(l);
        System.out.println(byteValue);
        short sum= (short) (1000 + 10 * (b+s+i));
        System.out.println(sum);

        int result= 10;
        result =(int) (result - 5.5);
        System.out.println("result:" + result);
    }
}
