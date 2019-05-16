package com.day3;

public class SumOdd {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 1000;i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        System.out.println("1-1000奇数和为："+sum);
    }
    public static boolean isOdd(int num){
        return (num&1)==1;
    }
}
