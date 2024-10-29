package com.mazailo.lesson2.library.model;

public class Reader {
    private String id;
    private String name;
    private boolean isInBlackList;

    public Reader(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean isInBlackList() {
        return isInBlackList;
    }

    public void setInBlackList(boolean inBlackList) {
        isInBlackList = inBlackList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
