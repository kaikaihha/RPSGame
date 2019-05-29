package com.day10.prac4;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandImpl(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
