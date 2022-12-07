package org.pupa.characters;

public class Warrior {
    private static final int ATTACK = 5;
    private int health = 50;
    private static final int MAXHP = 50;
    private Warrior nextWarrior;
    private Warrior behindWarrior;

    public Warrior() {
    }

    public Warrior(int health) {
        this.health = health;
    }

    public int getAttack(){
        return ATTACK;
    }

    public int getHealth(){
        return health;
    }

    public int getMaxhp() {
        return MAXHP;
    }

    public boolean isAlive(){
        return getHealth() > 0;
    }

    public void setHealth(int health) {
        this.health = Math.min(health, getMaxhp());
    }

    protected void healBy(int healthPoints) {
        setHealth(getHealth() + healthPoints);
    }

    public void dealDamage(Warrior warrior) {
        warrior.getDamage(getAttack());
        processCommand(OurChampionHasHit.INSTANCE, null);
    }

    public void getDamage(int damage){
        setHealth(getHealth() - damage);
    }

    public boolean hasBehind() {
        if (behindWarrior != null)
            return true;
        return false;
    }

    public boolean hasNext() {
        if (nextWarrior != null)
            return true;
        return false;
    }

    public Warrior getNextWarrior() {
        return nextWarrior;
    }

    public void setNextWarrior(Warrior nextWarrior) {
        this.nextWarrior = nextWarrior;
    }

    protected Warrior getBehindWarrior() {
        return behindWarrior;
    }

    protected void processCommand(Command command, Warrior sender) {
        var next = this.getBehindWarrior();
        if (next != null) {
            next.processCommand(command, this);
        }
    }
    public void setBehindWarrior(Warrior behindWarrior) {
        this.behindWarrior = behindWarrior;
    }
}
