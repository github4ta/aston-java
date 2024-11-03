package com.mazailo.homework2.model.enemy;

import com.mazailo.homework2.model.hero.Hero;

public class Giant extends Enemy {

    private final int GIANT_DAMAGE = 3;

    public Giant(int health) {
        super(health);
    }

    public void attackHero(Hero hero) {
        System.out.println("Enemy is attacking the hero " + hero.getName());
        hero.takeDamage(GIANT_DAMAGE);
    }
}
