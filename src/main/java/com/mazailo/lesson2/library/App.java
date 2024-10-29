package com.mazailo.lesson2.library;

import com.mazailo.lesson2.library.logic.LibraryService;
import com.mazailo.lesson2.library.model.Book;
import com.mazailo.lesson2.library.model.Catalog;
import com.mazailo.lesson2.library.model.Order;
import com.mazailo.lesson2.library.model.Reader;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Red wings", "John Black", "123456789");
        Reader reader = new Reader("John", "123");
        Order order = LibraryService.placeOrderForBook(reader, book);
        System.out.println(order);
        System.out.println(Catalog.getBooks());

        book = new Book("Red wings", "John White", "123456789");
        order = LibraryService.placeOrderForBook(reader, book);
        System.out.println(order);
        System.out.println(Catalog.getBooks());

        book = new Book("Red wings", "John Black", "123456789");
        order = LibraryService.placeOrderForBook(reader, book);
        System.out.println(order);
        System.out.println(Catalog.getBooks());
    }
}
