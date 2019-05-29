package com.day10.prac2;

public class ManBuilder implements PersonBuilder{
    private Person person;
    public ManBuilder(){
        person=new Person();
    }

    @Override
    public void buildBody() {
        person.setBody("man body");
    }

    @Override
    public void buildFoot() {
        person.setFoot("man foot");
    }

    @Override
    public void buildHead() {
        person.setHead("man head");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
