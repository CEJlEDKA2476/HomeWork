package com.company.books;

public class Book4 extends Book3{
    protected int numberOfPages;

    Book4(String name, int year, String author, int numberOfPages) {
        super(name,year,author);
        this.numberOfPages = numberOfPages;
    }
}
