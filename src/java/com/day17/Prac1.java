package com.day17;

public class Prac1 implements Runnable {

    private long time;
    private String name;

    public Prac1(String name,long sleeptime) {
        this.name = name;
        this.time = sleeptime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+"\t时间"+this.time);
    }
}
class test{
    public static void main(String[] args) throws InterruptedException {
        Prac1 my1 = new Prac1("线程1",1000*10);
        Prac1 my2 = new Prac1("线程2",1000*20);
        Prac1 my3 = new Prac1("线程3",1000*30);
        Thread thread1 = new Thread(my1);
        Thread thread2 = new Thread(my2);
        Thread thread3 = new Thread(my3);
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
