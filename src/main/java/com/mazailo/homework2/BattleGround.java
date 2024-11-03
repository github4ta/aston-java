package com.mazailo.homework2;

import com.mazailo.homework2.model.*;

public class BattleGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(50);
        Hero archer = new Archer("Landazar");
        Hero warrior = new Warrior("Titan");
        Hero mage = new Mage("Esmund");
        Hero[] heroes = new Hero[] {archer, warrior, mage};
        Hero hero;
        System.out.println("Lets start the battle!");
        System.out.println("Enemy health ..." + enemy.getHealth());
        while (enemy.isAlive()) {
            hero = getRandomHero(heroes);
            hero.attackEnemy(enemy);
            System.out.println("Enemy health ..." + enemy.getHealth());
        }
        System.out.println("Game over.");
        System.out.println("Enemy health ..." + enemy.getHealth());
    }

    public static Hero getRandomHero(Hero[] heroes) {
        int length = heroes.length;
        int index = (int) (Math.random() * length);
        return heroes[index];
    }
}
