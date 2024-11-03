package com.mazailo.homework2.model.hero;

import com.mazailo.homework2.behaviour.Mortal;
import com.mazailo.homework2.model.enemy.Enemy;

public class Archer extends Hero implements Mortal {

    private final int ARCHER_DAMAGE = 2;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + getName() + " is attacking the " + enemy.getClass().getSimpleName() + "!");
        enemy.takeDamage(ARCHER_DAMAGE);
    }
}
