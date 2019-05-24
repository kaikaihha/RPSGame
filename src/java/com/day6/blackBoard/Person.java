package com.day6.blackBoard;

public class Person {
    public void draw(){
        System.out.println("我拿起粉笔");
        new Pen().write();
        new Board().show();
    }
}
