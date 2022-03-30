package Item.Equipment.Armor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChestplateTest {
    Chestplate chestplate;

    @BeforeEach
    void setUp() {
        chestplate = new Chestplate();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerAttackChestplate_returnValue() {
        double espected = 5;
        assertEquals(espected, chestplate.powerAttack());
    }

    @Test
    void initialValue_protectionChestplate_returnValue() {
        double espected = 7;
        assertEquals(espected, chestplate.protection());
    }

    @Test
    void initialValue_weigthChestplate_returnValue() {
        int espected = 7;
        assertEquals(espected, chestplate.weigthItem());
    }

    @Test
    void initialValue_slotSpaceChestplate_returnValue() {
        double espected = 1;
        assertEquals(espected, chestplate.slotSpace());
    }
}