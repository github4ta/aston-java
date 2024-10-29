package com.mazailo.lesson2.library.model;

import java.util.*;

public class Catalog {

    private static final List<Book> books = new ArrayList<>();

    private Catalog() { }

    public static List<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        books.add(book);
    }
}
