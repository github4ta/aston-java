package com.mazailo.homework2.model;

public class Archer extends Hero {

    private final int ARCHER_DAMAGE = 2;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + getName() + " is attacking the Enemy!");
        enemy.takeDamage(ARCHER_DAMAGE);
    }
}
