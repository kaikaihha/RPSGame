package com.day17;

public class Prac2 implements Runnable{

    private int num = 1000;

    @Override
    public  void run() {
        for(;num>0;num--){
            System.out.println(Thread.currentThread().getName()+"\ti ="+num);
        }
    }
}
class test2{
    public static void main(String[] args) throws InterruptedException {
        Prac2  prac2 = new Prac2();
        synchronized (prac2){
            Thread thread = new Thread(prac2);
            Thread thread1 = new Thread(prac2);
            thread.start();
            thread1.start();
        }
    }
}
