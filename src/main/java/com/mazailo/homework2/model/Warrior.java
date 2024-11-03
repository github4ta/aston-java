package com.mazailo.homework2.model;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Warrior " + getName() + " is attacking the Enemy!");
    }
}
