package com.day15.prac1;

public abstract class Book implements IBook{
    public double price;
    public String author;
    public String name;

    @Override
    public double getPrice() {
        if(price > 40){
            return 0.9*40;
        }else {
            return 0.8*price;
        }
    }
}
