package org.pupa.characters;

public class Warrior {
    static final int ATTACK = 5;
    private int health = 50;

    // potentially virtual method
    public int getAttack(){
        return ATTACK;
    }

    public int getHealth(){
        return health;
    }

    public boolean isAlive(){
        return getHealth() > 0;
    }

    public void setHealth(int health) {
        if(health < 0){
            this.health = 0;
        } else {
            this.health = health;
        }
    }


    // two methods = Pattern commands
    // main thing about design = low coupling

    /**
     * @param opponent Enemy warrior that we should attack
     */
    public void hit(Warrior opponent){
        opponent.receiveDamage(this.getAttack());
    }

    /**
     * @param damage Amount of damage that will be dealt
     */
    protected void receiveDamage(int damage){
        this.setHealth(this.getHealth() - damage);
    }
}
