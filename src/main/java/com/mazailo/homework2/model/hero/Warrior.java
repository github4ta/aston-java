package com.mazailo.homework2.model.hero;

import com.mazailo.homework2.behaviour.Mortal;
import com.mazailo.homework2.model.enemy.Enemy;

public class Warrior extends Hero implements Mortal {

    private final int WARRIOR_DAMAGE = 5;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + getName() + " is attacking the Enemy!");
        enemy.takeDamage(WARRIOR_DAMAGE);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
