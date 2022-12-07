package org.pupa.characters;

import org.pupa.Battle;
import org.pupa.army.Army;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealerTest {
    @Test
    @DisplayName("Smoke test for Healer task")
    void smokeTest5() {
        var myArmy = new Army()
                .addUnits(Defender::new, 2)
                .addUnits(Vampire::new, 2)
                .addUnits(Lancer::new, 4)
                .addUnits(Warrior::new, 1);

        var enemyArmy = new Army()
                .addUnits(Warrior::new, 2)
                .addUnits(Healer::new, 2)
                .addUnits(Defender::new, 2)
                .addUnits(Vampire::new, 3);

        var army3 = new Army()
                .addUnits(Warrior::new, 1)
                .addUnits(Healer::new, 1);

        var army4 = new Army()
                .addUnits(Warrior::new, 1);

        assertTrue(Battle.fight(myArmy, enemyArmy));
        assertTrue(Battle.fight(army3, army4));
    }
}