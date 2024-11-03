package com.mazailo.homework2.model;

public abstract class Hero {
    private final int HERO_DAMAGE = 1;
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Hero " + getName() + " is attacking the Enemy!");
        enemy.takeDamage(HERO_DAMAGE);
    }
}
