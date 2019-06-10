package com.day15.prac1;

public class ComputerBook extends Book {

    String field;

    public ComputerBook(String _name,double _price,String _author,String _field){
        name = _name;
        price = _price;
        author = _author;
        field = _field;
    }

    @Override
    public String getName() {
        return null;
    }


    @Override
    public String getAuthor() {
        return null;
    }
}
