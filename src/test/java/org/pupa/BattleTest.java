package org.pupa;

import org.pupa.characters.Defender;
import org.pupa.characters.Knight;
import org.pupa.characters.Warrior;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BattleTest {

    @Test
    @DisplayName("1.Fight")
    void fight1() {

    }

    @Test
    @DisplayName("2.Fight")
    void fight2() {
        var ramon = new Knight();
        var slevin = new Warrior();

        boolean fight = Battle.fight(ramon, slevin);
        assertTrue(fight);
    }

    @Test
    @DisplayName("3.Fight")
    void fight3() {
        var bob = new Warrior();
        var mars = new Warrior();

        Battle.fight(bob, mars);
        boolean alive = bob.isAlive();
        assertTrue(alive);
    }

    @Test
    @DisplayName("4.Fight")
    void fight4() {
        var zeus = new Knight();
        var godkiller  = new Warrior();

        Battle.fight(zeus, godkiller);
        boolean alive = zeus.isAlive();
        assertTrue(alive);
    }

    @Test
    @DisplayName("5.Fight")
    void fight5() {
        var husband = new Knight();
        var wife = new Warrior();

        Battle.fight(husband, wife);
        boolean alive = wife.isAlive();
        assertFalse(alive);
    }

    @Test
    @DisplayName("6.Fight")
    void fight6() {
        var dragon = new Warrior();
        var knight = new Knight();

        Battle.fight(dragon, knight);
        boolean alive = knight.isAlive();
        assertTrue(alive);
    }

    @Test
    @DisplayName("7.Fight")
    void fight7() {
        var unit_1 = new Warrior();
        var unit_2 = new Knight();
        var unit_3 = new Warrior();

        Battle.fight(unit_1, unit_2);
        boolean fight = Battle.fight(unit_2, unit_3);
        assertFalse(fight);
    }

    @Test
    @DisplayName("8.Fight")
    void fight8() {
        var unit_1 = new Warrior();
        var unit_2 = new Defender();

        boolean fight = Battle.fight(unit_1, unit_2);
        assertFalse(fight);
    }
}