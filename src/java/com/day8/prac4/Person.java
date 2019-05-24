package com.day8.prac4;

public class Person implements Runner{
    @Override
    public void start() {
        System.out.println("人开始跑");
    }

    @Override
    public void run() {
        System.out.println("人正在跑");
    }

    @Override
    public void stop() {
        System.out.println("人停止跑");
    }

    public void dance(){
        System.out.println("人跳舞");
    }
}
