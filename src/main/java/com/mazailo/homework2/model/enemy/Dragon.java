package com.mazailo.homework2.model.enemy;

import com.mazailo.homework2.model.hero.Hero;

public class Dragon extends Enemy {

    private final int DRAGON_DAMAGE = 10;

    public Dragon(int health) {
        super(health);
    }

    public void attackHero(Hero hero) {
        System.out.println("Dragon is attacking the hero " + hero.getClass().getSimpleName() + " " + hero.getName());
        hero.takeDamage(DRAGON_DAMAGE);
    }
}
