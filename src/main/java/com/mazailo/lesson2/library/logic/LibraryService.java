package com.mazailo.lesson2.library.logic;

import com.mazailo.lesson2.library.model.Book;
import com.mazailo.lesson2.library.model.Catalog;
import com.mazailo.lesson2.library.model.Order;
import com.mazailo.lesson2.library.model.Reader;

public class LibraryService {

    public static Order placeOrderForBook(Reader reader, Book book) {
        /*book.setOrdered(true);
        Catalog.order(book);
        reader.order(book);
        return new Order(reader, book);*/
        if (!Catalog.isOrdered(book)) {
            book.setOrdered(true);
            Catalog.order(book);
            reader.order(book);
            return new Order(reader, book);
        }
        throw new ArrayStoreException("Can not place order");
    }
}
