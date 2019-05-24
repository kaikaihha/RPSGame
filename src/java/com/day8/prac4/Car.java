package com.day8.prac4;

public class Car implements Runner {
    @Override
    public void start() {
        System.out.println("汽车开始跑");
    }

    @Override
    public void run() {
        System.out.println("车开始跑");
    }

    @Override
    public void stop() {
        System.out.println("车停止跑");
    }

    public void fillFuel(){
        System.out.println("车加油");
    }

    public void crack(){
        System.out.println("车crack");
    }
}
