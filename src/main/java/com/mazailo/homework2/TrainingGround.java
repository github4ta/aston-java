package com.mazailo.homework2;

import com.mazailo.homework2.model.*;

public class TrainingGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(50);

        Hero hero = new Hero("Wolf");
        hero.attackEnemy(enemy);

        Warrior warrior = new Warrior("Titan");
        warrior.attackEnemy(enemy);

        Mage mage = new Mage("Esmund");
        mage.attackEnemy(enemy);

        Archer archer = new Archer("Landazar");
        archer.attackEnemy(enemy);

        System.out.println(enemy.getHealth());
    }
}
