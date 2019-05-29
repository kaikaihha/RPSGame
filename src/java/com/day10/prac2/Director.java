package com.day10.prac2;

public class Director {
    public Person personDirector(PersonBuilder personBuilder){
        personBuilder.buildBody();;
        personBuilder.buildFoot();
        personBuilder.buildHead();
        return personBuilder.buildPerson();
    }
}
