package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShieldTest {
    Shield shield;

    @BeforeEach
    void setUp() {
        shield = new Shield();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedShield_returnValue() {
        double espected = 10;
        assertEquals(espected, shield.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusShield_returnValue() {
        double espected = 0 * 10;
        assertEquals(espected, shield.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackShield_returnValue() {
        double espected = 0;
        assertEquals(espected, shield.powerAttack());
    }

    @Test
    void initialValue_protectionShield_returnValue() {
        double espected = 9;
        assertEquals(espected, shield.protection());
    }

    @Test
    void initialValue_weigthShield_returnValue() {
        double espected = 6;
        assertEquals(espected, shield.weigth());
    }

    @Test
    void initialValue_slotSpaceShield_returnValue() {
        double espected = 1;
        assertEquals(espected, shield.slotSpace());
    }
}