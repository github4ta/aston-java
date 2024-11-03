package com.mazailo.homework2;

import com.mazailo.homework2.model.enemy.Enemy;
import com.mazailo.homework2.model.hero.Archer;
import com.mazailo.homework2.model.hero.Mage;
import com.mazailo.homework2.model.hero.Warrior;

public class TrainingGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(50);

        Warrior warrior = new Warrior("Titan", 20);
        warrior.attackEnemy(enemy);

        Mage mage = new Mage("Esmund", 30);
        mage.attackEnemy(enemy);

        Archer archer = new Archer("Landazar", 10);
        archer.attackEnemy(enemy);

        System.out.println(enemy.getHealth());
    }
}
