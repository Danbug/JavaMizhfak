package org.pupa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.pupa.characters.Knight;
import org.pupa.characters.Warrior;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    @DisplayName("1. Battle")
    void Battle1(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 1);
        army_2.addUnits(() -> new Warrior(), 2);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(false,battle);
    }

    @Test
    @DisplayName("2. Battle")
    void Battle2(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 2);
        army_2.addUnits(() -> new Warrior(), 3);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(false,battle);
    }

    @Test
    @DisplayName("3. Battle")
    void Battle3(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 5);
        army_2.addUnits(() -> new Warrior(), 7);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(false,battle);
    }

    @Test
    @DisplayName("4. Battle")
    void Battle4(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 20);
        army_2.addUnits(() -> new Warrior(), 21);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(true,battle);
    }

    @Test
    @DisplayName("5. Battle")
    void Battle5(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 10);
        army_2.addUnits(() -> new Warrior(), 11);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(true,battle);
    }

    @Test
    @DisplayName("6. Battle")
    void Battle6(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 11);
        army_2.addUnits(() -> new Warrior(), 7);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(true,battle);
    }

    @Test
    @DisplayName("7. Custom Battle 1W 1K")
    void Battle7(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 1);
        army_2.addUnits(() -> new Knight(), 1);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(false,battle);
    }

    @Test
    @DisplayName("8. Custom Battle 1K 1K")
    void Battle8(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Knight(), 1);
        army_2.addUnits(() -> new Knight(), 1);
        var battle = Battle.fight(army_1,army_2);
        assertEquals(true,battle);
    }
}
