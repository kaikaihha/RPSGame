package com.day7.prac3;

public class DoorDoor extends Door {

    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    public void theftProof(){
        System.out.println("防盗");
    };

    public void waterProof(){
        System.out.println("防水");
    }

    public void bulletProof(){
        System.out.println("防弹");
    }



}
