package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwordTest {
    Sword sword;

    @BeforeEach
    void setUp() {
        sword = new Sword();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedSword_returnValue() {
        double espected = 5.5;
        assertEquals(espected, sword.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusSword_returnValue() {
        double espected = 3 * 5.5;
        assertEquals(espected, sword.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackSword_returnValue() {
        double espected = 3;
        assertEquals(espected, sword.powerAttack());
    }

    @Test
    void initialValue_protectionSword_returnValue() {
        double espected = 3;
        assertEquals(espected, sword.protection());
    }

    @Test
    void initialValue_weigthSword_returnValue() {
        double espected = 5;
        assertEquals(espected, sword.weigth());
    }

    @Test
    void initialValue_slotSpaceSword_returnValue() {
        double espected = 1;
        assertEquals(espected, sword.slotSpace());
    }
}