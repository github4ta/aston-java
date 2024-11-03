package com.mazailo.lesson2.library.enums;

public enum Place {
    READING_ROOM("Reading Room"),
    DELIVERY_DESK("Delivery Desk");

    private final String label;

    private Place(String label) {
        this.label = label;
    }

    public String toString() {
        return label;
    }
}
