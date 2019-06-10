package com.day15.prac1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    List<Book> books;
    public BookStore(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }

}
class test{
    @Test
    public void demo(){
        BookStore bookStore = new BookStore();
        bookStore.addBook(new NovelBook("aaa",34,"xxx"));

    }
}
