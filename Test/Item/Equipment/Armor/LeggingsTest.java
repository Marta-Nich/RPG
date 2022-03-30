package Item.Equipment.Armor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeggingsTest {
    Leggings leggings;

    @BeforeEach
    void setUp() {
        leggings = new Leggings();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerAttackLeggings_returnValue() {
        double espected = 4;
        assertEquals(espected, leggings.powerAttack());
    }

    @Test
    void initialValue_protectionLeggings_returnValue() {
        double espected = 6;
        assertEquals(espected, leggings.protection());
    }

    @Test
    void initialValue_weigthLeggings_returnValue() {
        int espected = 6;
        assertEquals(espected, leggings.weigthItem());
    }

    @Test
    void initialValue_slotSpaceLeggings_returnValue() {
        double espected = 1;
        assertEquals(espected, leggings.slotSpace());
    }
}