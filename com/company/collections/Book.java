package com.company.collections;

import java.util.Objects;

public class Book {
    private String name;
    private String author;

    Book(String name, String author){
        this.author = author;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
//        if(obj instanceof Book){
//            Book objBook = (Book) obj;
//            return this.name.equals(objBook.getName()) && this.author.equals(objBook.author);
//        }
//        return false;

        return Objects.equals(this, obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
