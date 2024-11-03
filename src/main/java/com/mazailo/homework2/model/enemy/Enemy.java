package com.mazailo.homework2.model.enemy;

import com.mazailo.homework2.behaviour.Mortal;
import com.mazailo.homework2.model.hero.Hero;

public class Enemy implements Mortal {

    private final int ENEMY_DAMAGE = 3;
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
        System.out.println("Enemy is attacking the hero " + hero.getName());
        hero.takeDamage(ENEMY_DAMAGE);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
