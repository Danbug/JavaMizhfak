package org.pupa;

import org.pupa.characters.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Supplier;

public class Army {
    Queue<Warrior> troops = new LinkedList<>();

    // fluent interface
    public Army addUnits(Warrior warrior){
        troops.add(warrior);
        return this;
    }

    public Army addUnits(Supplier<Warrior> factory,
                         int quantity){
        for (int i = 0; i < quantity; i++) {
            addUnits(factory.get());
        }
        return null;
    }

    Warrior peekFirst(){
        return troops.peek();
    }

    void removeFirst(){
        troops.remove();
    }

}
