package com.day9.prac2;

public class Str {
    public void fun1(){
        long startTime = System.nanoTime();
        int i = 0;
        String s = "a";
        while(i<100000){
            s= s+"c";
            i++;
        }
        System.out.println("时间为："+(System.nanoTime()-startTime));
    }
    public void fun2(){
        long startTime = System.nanoTime();
        int i = 0;
        String s = "a";
        while(i<100000){
            s.concat("c");
            i++;
        }
        System.out.println("时间为："+(System.nanoTime()-startTime));
    }
    public void fun3(){

        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        while(i<100000){
            stringBuffer.append("c");
            i++;
        }
        System.out.println("时间为："+(System.nanoTime()-startTime));
    }
    public void fun4(){

        int i = 0;
        StringBuilder stringBuilder = new StringBuilder("a");
        long startTime = System.nanoTime();
        while(i<100000){
            stringBuilder.append("c");
            i++;
        }
        System.out.println("时间为："+(System.nanoTime()-startTime));
    }
}
class test{
    public static void main(String[] args) {
        Str str = new Str();
        str.fun1();
        str.fun2();
        str.fun3();
        str.fun4();
    }
}
