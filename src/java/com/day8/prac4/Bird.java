package com.day8.prac4;

public class Bird implements Runner{
    @Override
    public void start() {
        System.out.println("鸟开始跑");
    }

    @Override
    public void run() {
        System.out.println("鸟正在跑");
    }

    @Override
    public void stop() {
        System.out.println("鸟停止跑");
    }

    public void fly(){
        System.out.println("鸟飞");
    }
}
