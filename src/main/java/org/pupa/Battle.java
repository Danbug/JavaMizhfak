package org.pupa;

import org.pupa.army.Army;
import org.pupa.characters.Warrior;

public class Battle {
    public static boolean fight(Warrior warrior1, Warrior warrior2){
        while(warrior1.isAlive() && warrior2.isAlive()){
            warrior1.dealDamage(warrior2);
            if(warrior2.isAlive()){
                warrior2.dealDamage(warrior1);
            }
        }
        return warrior1.isAlive();
    }

    public static boolean fight(Army army1, Army army2){
        while (!army1.isArmyEmpty() && !army2.isArmyEmpty()) {
            boolean fightResult = fight(army1.getArmy().peek(), army2.getArmy().peek());
            if (fightResult)
                army2.getArmy().remove();
            else
                army1.getArmy().remove();
        }
        return !army1.isArmyEmpty();
    }
}
