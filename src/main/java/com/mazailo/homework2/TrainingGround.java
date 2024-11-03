package com.mazailo.homework2;

import com.mazailo.homework2.model.Archer;
import com.mazailo.homework2.model.Hero;
import com.mazailo.homework2.model.Mage;
import com.mazailo.homework2.model.Warrior;

public class TrainingGround {

    public static void main(String[] args) {
        Hero hero = new Hero("Wolf");
        hero.attackEnemy();

        Warrior warrior = new Warrior("Titan");
        warrior.attackEnemy();

        Mage mage = new Mage("Esmund");
        mage.attackEnemy();

        Archer archer = new Archer("Landazar");
        archer.attackEnemy();
    }
}
