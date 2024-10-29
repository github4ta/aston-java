package com.mazailo.lesson2.library.model;

import java.util.Objects;

public class Order {
    private static int CURRENT_ORDER = 0;
    private int id;
    private Reader reader;
    private Book book;

    public Order(Reader reader, Book book) {
        this.reader = reader;
        this.book = book;
        id = CURRENT_ORDER++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(reader, order.reader) && Objects.equals(book, order.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reader, book);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", reader=" + reader +
                ", book=" + book +
                '}';
    }
}
