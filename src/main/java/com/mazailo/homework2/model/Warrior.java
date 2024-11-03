package com.mazailo.homework2.model;

public class Warrior extends Hero {

    private final int WARRIOR_DAMAGE = 5;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + getName() + " is attacking the Enemy!");
        enemy.takeDamage(WARRIOR_DAMAGE);
    }
}
