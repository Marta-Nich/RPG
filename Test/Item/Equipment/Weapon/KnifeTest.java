package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {
    Knife knife;

    @BeforeEach
    void setUp() {
        knife = new Knife();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedKnife_returnValue() {
        double espected = 7.5;
        assertEquals(espected, knife.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusKnife_returnValue() {
        double espected = 1 * 7.5;
        assertEquals(espected, knife.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackKnife_returnValue() {
        double espected = 1;
        assertEquals(espected, knife.powerAttack());
    }

    @Test
    void initialValue_protectionKnife_returnValue() {
        double espected = 1;
        assertEquals(espected, knife.protection());
    }

    @Test
    void initialValue_weigthKnife_returnValue() {
        double espected = 2;
        assertEquals(espected, knife.weigthItem());
    }

    @Test
    void initialValue_slotSpaceKnife_returnValue() {
        double espected = 1;
        assertEquals(espected, knife.slotSpace());
    }
}