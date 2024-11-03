package com.mazailo.homework2.model;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy() {
        System.out.println("Hero " + getName() + " is attacking the Enemy!");
    }
}
