package org.pupa.characters;

public class Lancer extends Warrior {
    public static final int ATTACK = 6;
    public int getAttack(){
        return ATTACK;
    }

    public void dealDamage(Warrior warrior){
        warrior.getDamage(getAttack());
        if (warrior.hasBehind()) {
            warrior.getBehindWarrior().getDamage((getAttack() * 50)/100);
        }
    }
}
