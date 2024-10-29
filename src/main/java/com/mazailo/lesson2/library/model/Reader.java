package com.mazailo.lesson2.library.model;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String id;
    private String name;
    private List<Book> books;

    public Reader(String name, String id) {
        this.name = name;
        this.id = id;
        books = new ArrayList<>();
    }

    public boolean order(Book book) {
        return books.add(book);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
