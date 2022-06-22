package com.company.books;

public class Book5 extends Book4{
    int numberOfVolumes;

    Book5(String name, int year, String author, int numberOfPages, int numberOfVolumes) {
        super(name, year, author, numberOfPages);
        this.numberOfVolumes = numberOfVolumes;
    }

    void broadcast () {
        System.out.print(name + " " + year + " " + author + " " + numberOfPages + " " + numberOfVolumes);
    }
}
