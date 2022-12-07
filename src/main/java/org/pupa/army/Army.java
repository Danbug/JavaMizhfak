package org.pupa.army;

import org.pupa.characters.Warrior;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Supplier;

public class Army {
    private Deque<Warrior> army;

    public Army() {
        army = new LinkedList<>();
    }

    public Army addUnits(Warrior warrior) {
        warrior.setNextWarrior(army.peekLast());
        if (isLastWarrior(army.peekLast())) {
            army.peekLast().setBehindWarrior(warrior);
        }
        army.add(warrior);
        return this;
    }

    public Army addUnits(Supplier<Warrior> factory,
                         int quantity){
        for (int i = 0; i < quantity; i++) {
            addUnits(factory.get());
        }
        return this;
    }

    public Queue<Warrior> getArmy() {
        return army;
    }

    public Boolean isArmyEmpty() {
        return army.isEmpty();
    }

    private boolean isLastWarrior(Warrior warrior){
        if (warrior == null)
            return false;
        return true;
    }
}
