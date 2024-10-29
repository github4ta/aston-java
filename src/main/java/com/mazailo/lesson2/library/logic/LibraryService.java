package com.mazailo.lesson2.library.logic;

import com.mazailo.lesson2.library.model.Book;
import com.mazailo.lesson2.library.model.Catalog;
import com.mazailo.lesson2.library.model.Order;
import com.mazailo.lesson2.library.model.Reader;

import java.util.List;
import java.util.NoSuchElementException;

public class LibraryService {

    public static Order placeOrder(Reader reader, Book book) {
        return new Order(reader, book);
    }

    public static void deliveryOrderTo(Order order, String place) {
        order.setPlace(place);
    }

    public static void putReaderIntoBlackList(Order order) {
        if (!order.isReturned()) {
            Reader reader = order.getReader();
            reader.setInBlackList(true);
        }
    }

    public static Book getBookByTitle(String title) {
        List<Book> books = Catalog.getBooks();
        for(Book book : books) {
            if (book.getTitle() == title) {
                return book;
            }
        }
        throw new NoSuchElementException("The book with title \"" + title + "\" not found.");
    }

    public static Book getBookByAuthor(String author) {
        List<Book> books = Catalog.getBooks();
        for(Book book : books) {
            if (book.getAuthor() == author) {
                return book;
            }
        }
        throw new NoSuchElementException("The book with author " + author + " not found.");
    }

    public static Book getBookByIsbn(String isbn) {
        List<Book> books = Catalog.getBooks();
        for(Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        throw new NoSuchElementException("The book with ISBN " + isbn + " not found.");
    }
}
