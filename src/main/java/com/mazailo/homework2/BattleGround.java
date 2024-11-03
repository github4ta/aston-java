package com.mazailo.homework2;

import com.mazailo.homework2.model.enemy.Enemy;
import com.mazailo.homework2.model.enemy.Giant;
import com.mazailo.homework2.model.hero.Archer;
import com.mazailo.homework2.model.hero.Hero;
import com.mazailo.homework2.model.hero.Mage;
import com.mazailo.homework2.model.hero.Warrior;

public class BattleGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(50);
        Giant giant = new Giant(100);
        Enemy[] enemies = new Enemy[]{enemy, giant};

        Hero archer = new Archer("Landazar", 10);
        Hero warrior = new Warrior("Titan", 20);
        Hero mage = new Mage("Esmund", 30);
        Hero[] heroes = new Hero[]{archer, warrior, mage};

        Hero hero;
        Enemy enemyInBattle;

        printEnemiesHealth(enemies);
        printHeroesHealth(heroes);
        System.out.println("Lets start the battle!");

        while (isAnyEnemyAlive(enemies) && isAnyHeroAlive(heroes)) {
            hero = getRandomHero(heroes);
            if (hero.isAlive()) {
                enemyInBattle = getRandomEnemy(enemies);
                hero.attackEnemy(enemyInBattle);
                enemyInBattle.attackHero(hero);
                System.out.println("Hero " + hero.getName() + " health ..." + hero.getHealth());
                System.out.println("Enemy " + enemyInBattle.getHealth() + " health ..." + enemyInBattle.getHealth());
            }
        }

        System.out.println("Game over.");
        printEnemiesHealth(enemies);
        printHeroesHealth(heroes);
    }

    public static Hero getRandomHero(Hero[] heroes) {
        int length = heroes.length;
        int index = (int) (Math.random() * length);
        return heroes[index];
    }

    public static Enemy getRandomEnemy(Enemy[] enemies) {
        int length = enemies.length;
        int index;
        Enemy enemy;
        do {
            index = (int) (Math.random() * length);
            enemy = enemies[index];
        } while (!enemy.isAlive());
        return enemy;
    }

    public static boolean isAnyEnemyAlive(Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            if (enemy.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnyHeroAlive(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public static void printHeroesHealth(Hero[] heroes) {
        for (Hero hero : heroes) {
            System.out.println(hero.getClass().getSimpleName() + " " + hero.getName() + " health " + hero.getHealth());
        }
    }

    public static void printEnemiesHealth(Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            System.out.println(enemy.getClass().getSimpleName() + " health " + enemy.getHealth());
        }
    }
}
