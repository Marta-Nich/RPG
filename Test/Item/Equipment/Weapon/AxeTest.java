package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AxeTest {
    Axe axe;

    @BeforeEach
    void setUp() {
        axe = new Axe();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedAxe_returnValue() {
        double espected = 3;
        assertEquals(espected, axe.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusAxe_returnValue() {
        double espected = 5 * 3;
        assertEquals(espected, axe.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackAxe_returnValue() {
        double espected = 5;
        assertEquals(espected, axe.powerAttack());
    }

    @Test
    void initialValue_protectionAxe_returnValue() {
        double espected = 2;
        assertEquals(espected, axe.protection());
    }

    @Test
    void initialValue_weigthAxe_returnValue() {
        double espected = 7;
        assertEquals(espected, axe.weigth());
    }

    @Test
    void initialValue_slotSpaceAxe_returnValue() {
        double espected = 1;
        assertEquals(espected, axe.slotSpace());
    }
}