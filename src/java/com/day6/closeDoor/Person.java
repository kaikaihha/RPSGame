package com.day6.closeDoor;

public class Person {
    public void closeDoor(){
        System.out.println("Me:I'm closing the door!");
        new Door().close();
    }
}
