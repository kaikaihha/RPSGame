package com.day15.prac1;

public class NovelBook extends Book{

    public NovelBook(String _name,double _price,String _author){
        name = _name;
        price = _price;
        author = _author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
