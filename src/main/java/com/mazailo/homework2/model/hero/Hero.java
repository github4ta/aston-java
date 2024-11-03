package com.mazailo.homework2.model.hero;

import com.mazailo.homework2.behaviour.Mortal;
import com.mazailo.homework2.model.enemy.Enemy;

public abstract class Hero implements Mortal {
    private final int HERO_DAMAGE = 1;
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Hero " + getName() + " is attacking the " + enemy.getClass().getSimpleName() + "!");
        enemy.takeDamage(HERO_DAMAGE);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
