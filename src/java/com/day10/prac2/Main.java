package com.day10.prac2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Person person = director.personDirector(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
