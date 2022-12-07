package org.pupa.characters;

public class Healer extends Warrior{
    private static final int HEAL_POWER = 2;
    private static final int MAXHP = 60;

    public Healer() {
        super(MAXHP);
    }

    @Override
    public void dealDamage(Warrior warrior) {
    }

    @Override
    public int getAttack() {
        return 0;
    }

    @Override
    protected void processCommand(Command command, Warrior sender) {
        if (command instanceof OurChampionHasHit) {
            heal(sender);
        }
        super.processCommand(command, sender);
    }

    private void heal(Warrior warrior) {
        warrior.healBy(getHealPower());
    }

    public int getHealPower() {
        return HEAL_POWER;
    }
}
