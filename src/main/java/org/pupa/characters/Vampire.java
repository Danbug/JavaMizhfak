package org.pupa.characters;

public class Vampire extends Warrior {
    static final int ATTACK = 4;
    public static final int VAPIRISM = 50;
    public static final int MAXHP = 40;

    public Vampire() {
        setHealth(MAXHP);
    }

    @Override
    public void dealDamage(Warrior warrior) {
        int prevWarriorHealth = warrior.getHealth();
        warrior.getDamage(getAttack());
        int dealedDamage = prevWarriorHealth - warrior.getHealth();
        heal(dealedDamage);
    }

    public void heal(int dealedDamage) {
        int restoredHP = (dealedDamage * VAPIRISM) / 100;
        if (getHealth() + restoredHP > MAXHP) {
            setHealth(MAXHP);
        }
        else {
            setHealth(getHealth() + restoredHP);
        }
    }

    @Override
    public int getAttack(){
        return ATTACK;
    }
}
