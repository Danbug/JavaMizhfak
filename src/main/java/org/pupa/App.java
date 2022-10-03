package org.pupa;

import org.pupa.characters.Knight;
import org.pupa.characters.Warrior;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        var army1 = new Army()
                .addUnits(()  -> new Warrior(),5)
                .addUnits(Knight::new, 3);


        // fluent interface
        var army = new Army()
                .addUnits(new Warrior())
                .addUnits(new Warrior())
                .addUnits(new Knight())
                .addUnits(new Warrior());

    }

}
