package com.day10.prac4;

public class CommandImpl implements Command{

    private Receiver receiver;

    public CommandImpl(Receiver r){
        this.receiver = r;
    }
    @Override
    public void exe() {
        receiver.action();
    }
}
