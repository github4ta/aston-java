package com.mazailo.homework2.model;

public class Mage extends Hero {

    private final int MAGE_DAMAGE = 10;

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage " + getName() + " is attacking the Enemy!");
        enemy.takeDamage(MAGE_DAMAGE);
    }
}
