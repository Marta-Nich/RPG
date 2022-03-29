package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowTest {
    Bow bow;

    @BeforeEach
    void setUp() {
        bow = new Bow();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedBow_returnValue() {
        double espected = 4.5;
        assertEquals(espected, bow.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusBow_returnValue() {
        double espected = 3 * 4.5;
        assertEquals(espected, bow.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackBow_returnValue() {
        double espected = 3;
        assertEquals(espected, bow.powerAttack());
    }

    @Test
    void initialValue_protectionBow_returnValue() {
        double espected = 1;
        assertEquals(espected, bow.protection());
    }

    @Test
    void initialValue_weigthBow_returnValue() {
        double espected = 5;
        assertEquals(espected, bow.weigth());
    }

    @Test
    void initialValue_slotSpaceBow_returnValue() {
        double espected = 2;
        assertEquals(espected, bow.slotSpace());
    }
}