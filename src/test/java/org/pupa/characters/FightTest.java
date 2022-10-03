package org.pupa.characters;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.pupa.Battle;


/**
 * Unit test for simple App.
 */
class Fight {

    @Test
    @DisplayName("Smoke test for Warrior and Knight task")
    void smokeTest1() {
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();

        assertTrue(Battle.fight(chuck, bruce));
        assertFalse(Battle.fight(dave, carl));
        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }

    @Test
    @DisplayName("1. Fight")
    public void fight() {
        // GIVEN
        var carl = new Warrior();
        var jim = new Knight();

        // WHEN
        var res = Battle.fight(carl,jim);

        // THEN
        assertEquals(false, res);
    }

    @Test
    @DisplayName("2. Fight")
    public void fight2() {
        // GIVEN
        var ramon = new Knight();
        var slevin = new Warrior();

        // WHEN
        var res = Battle.fight(ramon, slevin);

        // THEN
        assertEquals(true, res);
    }

    @Test
    @DisplayName("3. Fight")
    public void fight3() {
        // GIVEN
        var bob = new Warrior();
        var mars = new Warrior();

        Battle.fight(bob, mars);

        // WHEN
        var res = bob.isAlive();

        // THEN
        assertEquals(true, res);
    }

    @Test
    @DisplayName("4. Fight")
    public void fight4() {
        // GIVEN
        var zeus = new Knight();
        var godkiller = new Warrior();

        Battle.fight(zeus, godkiller);

        // WHEN
        var res = zeus.isAlive();

        // THEN
        assertEquals(true, res);
    }

    @Test
    @DisplayName("5. Fight")
    public void fight5() {
        // GIVEN
        var husband = new Warrior();
        var wife = new Warrior();

        Battle.fight(husband, wife);

        // WHEN
        var res = wife.isAlive();

        // THEN
        assertEquals(false, res);
    }

    @Test
    @DisplayName("6. Fight")
    public void fight6() {
        // GIVEN
        var dragon = new Warrior();
        var knight = new Knight();

        Battle.fight(dragon, knight);

        // WHEN
        var res = knight.isAlive();

        // THEN
        assertEquals(true, res);
    }

    @Test
    @DisplayName("7. Fight")
    public void fight7() {
        // GIVEN
        var unit_1 = new Warrior();
        var unit_2 = new Knight();
        var unit_3 = new Warrior();

        Battle.fight(unit_1, unit_2);

        // WHEN
        var res = Battle.fight(unit_2, unit_3);

        // THEN
        assertEquals(false, res);
    }

    /*// Test driven approach = First make tests, then implementation.
    @Test
    @DisplayName("Smoke test")
    public void name() {
        // Arrange  | Given
        var chuck = new Warrior();
        var bruce = new Warrior();

        // Act  | When
        var res = Battle.fight(chuck,bruce);

        // Assert   | Then
        assertTrue(res);
        // YAGNI
        // You aren't gonna geed it
    }*/
}
