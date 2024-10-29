package com.mazailo.lesson2.library.model;

import java.util.*;

public class Catalog {

    private static final Set<Book> books = new HashSet<>();

    private Catalog() { }

    public static Set<Book> getBooks() {
        return books;
    }
    public static boolean hasBook(Book book) {
        for (Book item : books) {
            if (item.equals(book)) {
                book.setOrdered(true);
                return true;
            }
        }
        return false;
    }

    public static boolean isOrdered(Book book) {
        if (hasBook(book)) {
            return book.isOrdered();
        }
        return false;
    }

    public static boolean order(Book book) {
        if (!isOrdered(book)) {
            book.setOrdered(true);
            books.remove(book);
        }
        return books.add(book);
    }
}
