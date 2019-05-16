package com.day2;

public class Odd {
    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(isOdd(-8));
    }
    public static boolean isOdd(int num){
        return (num&1)==0;
    }
}
