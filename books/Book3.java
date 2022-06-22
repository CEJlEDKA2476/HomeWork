package com.company.books;

public class Book3 extends Book2{
    protected String author;

    Book3 (String name, int year, String author) {
        super(name, year);
        this.author = author;
    }
}
