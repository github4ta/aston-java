package com.mazailo.homework2.model.hero;

import com.mazailo.homework2.behaviour.Mortal;
import com.mazailo.homework2.model.enemy.Enemy;

public class Mage extends Hero implements Mortal {

    private final int MAGE_DAMAGE = 10;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage " + getName() + " is attacking the Enemy!");
        enemy.takeDamage(MAGE_DAMAGE);
    }
}
