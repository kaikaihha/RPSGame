package com.day6.toXiamen;

public class Person {
    public void drive(){
        new Car().powerOn();
        System.out.println("我在开车");
        new City().aim();
    }
}
