package org.pupa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.pupa.characters.Knight;
import org.pupa.characters.Warrior;

class ArmyTest {

    @Test
    @DisplayName("Smoke test for Army")
    void smokeTestArmy(){
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();
        var mark = new Warrior();

        assert Battle.fight(chuck, bruce) == true;
        assert Battle.fight(dave, carl) == false;
        assert chuck.isAlive() == true;
        assert bruce.isAlive() == false;
        assert carl.isAlive() == true;
        assert dave.isAlive() == false;
        assert Battle.fight(carl, mark) == false;
        assert carl.isAlive() == false;

        var myArmy = new Army();
        myArmy.addUnits(() -> new Knight(), 3);

        var enemyArmy = new Army();
        enemyArmy.addUnits(() -> new Warrior(), 3);

        var army3 = new Army();
        army3.addUnits(() -> new Warrior(), 20);
        army3.addUnits(() -> new Knight(), 5);

        var army4 = new Army();
        army4.addUnits(() -> new Warrior(), 30);

        assert Battle.fight(myArmy, enemyArmy) == true;
        assert Battle.fight(army3, army4) == false;
    }
}
