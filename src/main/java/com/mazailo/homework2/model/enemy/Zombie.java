package com.mazailo.homework2.model.enemy;

import com.mazailo.homework2.model.hero.Hero;

public class Zombie extends Enemy {

    private final int ZOMBIE_DAMAGE = 1;
    private int lifes = 5;
    private int initialHealth;

    public Zombie(int health) {
        super(health);
        initialHealth = health;
    }

    public void attackHero(Hero hero) {
        System.out.println("Zombie is attacking the " + hero.getClass().getSimpleName() + " " + hero.getName());
        hero.takeDamage(ZOMBIE_DAMAGE);
    }

    @Override
    public boolean isAlive() {
        if (lifes > 0) {
            if (getHealth() > 0) {
                return true;
            } else {
                if (lifes > 0) {
                    lifes -= 1;
                    setHealth(initialHealth);
                    System.out.println("Zombie is reincarnated! Lifes left " + lifes);
                    return true;
                }
            }
        } else {
            setHealth(0);
        }
        return false;
    }
}
