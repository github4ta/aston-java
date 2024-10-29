package com.mazailo.lesson2.library;

import com.mazailo.lesson2.library.logic.LibraryService;
import com.mazailo.lesson2.library.model.Book;
import com.mazailo.lesson2.library.model.Catalog;
import com.mazailo.lesson2.library.model.Order;
import com.mazailo.lesson2.library.model.Reader;

import static com.mazailo.lesson2.library.enums.Place.DELIVERY_DESK;
import static com.mazailo.lesson2.library.enums.Place.READING_ROOM;

public class App {
    public static void main(String[] args) {
        Reader reader = new Reader("John Black", "123");
        Book book = new Book("Red wings", "Tim White", "1234567890");
        Order order = LibraryService.placeOrder(reader, book);

        Catalog.addBook(book);
        Book searchedBook = LibraryService.getBookByAuthor("Tim White");
        searchedBook = LibraryService.getBookByTitle("Red wings");
        searchedBook = LibraryService.getBookByIsbn("1234567890");

        LibraryService.deliveryOrderTo(order, DELIVERY_DESK);
        LibraryService.deliveryOrderTo(order, READING_ROOM);

        LibraryService.putReaderIntoBlackList(order);
    }
}
