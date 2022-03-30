package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {
    Wand wand;

    @BeforeEach
    void setUp() {
        wand = new Wand();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedWand_returnValue() {
        double espected = 7.5;
        assertEquals(espected, wand.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusWand_returnValue() {
        double espected = 2 * 7.5;
        assertEquals(espected, wand.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackWand_returnValue() {
        double espected = 2;
        assertEquals(espected, wand.powerAttack());
    }

    @Test
    void initialValue_protectionWand_returnValue() {
        double espected = 1;
        assertEquals(espected, wand.protection());
    }

    @Test
    void initialValue_weigthWand_returnValue() {
        int espected = 4;
        assertEquals(espected, wand.weigthItem());
    }

    @Test
    void initialValue_slotSpaceWand_returnValue() {
        double espected = 2;
        assertEquals(espected, wand.slotSpace());
    }
}