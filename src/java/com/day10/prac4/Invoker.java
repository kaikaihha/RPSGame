package com.day10.prac4;

public class Invoker {
    private Command command;
    public Invoker(Command c){
        this.command = c;
    }
    public void action(){
        command.exe();
    }
}
