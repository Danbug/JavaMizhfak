package org.pupa;

import org.pupa.characters.Warrior;

// only static methods classes can be named utility class
public class Battle {

    // attack or receive damage?
    public static boolean fight(Warrior warrior1, Warrior warrior2){
        while(warrior1.isAlive() && warrior2.isAlive()){
            warrior1.hit(warrior2);
            if(warrior2.isAlive()){
                warrior2.hit(warrior1);
            }
        }
        return warrior1.isAlive();
    }

    public static boolean fight(Army army1, Army army2){
        while(army1.peekFirst() != null && army2.peekFirst() != null){
            if(fight(army1.peekFirst(), army2.peekFirst()) == true){
                army2.removeFirst(); // first won
            } else {
                army1.removeFirst(); // second won
            }
        }
        return army1.peekFirst() != null; // if first is null, then second army won
    }

/*    public static boolean fight(Warrior warrior1, Warrior warrior2){
        while(warrior1.isAlive() && warrior2.isAlive()){
            warrior2.setHealth(warrior2.getHealth() - warrior1.getAttack());
            if(warrior2.isAlive()){
                warrior1.setHealth(warrior1.getHealth() - warrior2.getAttack());
            }
        }
        return warrior1.isAlive();
    }*/
}
