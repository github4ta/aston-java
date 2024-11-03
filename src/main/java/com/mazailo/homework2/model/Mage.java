package com.mazailo.homework2.model;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Mage " + getName() + " is attacking the Enemy!");
    }
}
