package com.day9.prac1;


public class OneTo1000 {
    public void fun1(){
        long startTime = System.nanoTime();
        int sum = 0;
        for(int i = 1;i <= 1000;i++){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("时间为："+(System.nanoTime()-startTime));
    }
    public void fun2(){
        long startTime = System.nanoTime();
        int sum = 0;
        int i = 1;
        while (i<=1000){
            sum+=i;
            i++;
        }
        System.out.println(sum);
        System.out.println("时间为："+(System.nanoTime()-startTime));
    }
    public void fun3(){
        long startTime = System.nanoTime();
        int sum = 0;
        sum = 1000*500+500;
        System.out.println(sum);
        System.out.println("时间为："+(System.nanoTime()-startTime));
    }
}
class test{
    public static void main(String[] args) {
        OneTo1000 oneTo1000 = new OneTo1000();
        oneTo1000.fun1();
        oneTo1000.fun2();
        oneTo1000.fun3();
    }
}
