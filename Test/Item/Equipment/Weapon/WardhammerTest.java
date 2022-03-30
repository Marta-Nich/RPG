package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WardhammerTest {
    Wardhammer wardhammer;

    @BeforeEach
    void setUp() {
        wardhammer = new Wardhammer();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedWardhammerk_returnValue() {
        double espected = 2;
        assertEquals(espected, wardhammer.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusWardhammer_returnValue() {
        double espected = 7 * 2;
        assertEquals(espected, wardhammer.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackWardhammer_returnValue() {
        double espected = 7;
        assertEquals(espected, wardhammer.powerAttack());
    }

    @Test
    void initialValue_protectionWardhammer_returnValue() {
        double espected = 2;
        assertEquals(espected, wardhammer.protection());
    }

    @Test
    void initialValue_weigthWardhammer_returnValue() {
        int espected = 8;
        assertEquals(espected, wardhammer.weigthItem());
    }

    @Test
    void initialValue_slotSpaceWardhammer_returnValue() {
        double espected = 2;
        assertEquals(espected, wardhammer.slotSpace());
    }
}