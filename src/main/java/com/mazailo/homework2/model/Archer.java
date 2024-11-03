package com.mazailo.homework2.model;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Archer " + getName() + " is attacking the Enemy!");
    }
}
