package Item.Equipment.Armor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BootsTest {
    Boots boots;

    @BeforeEach
    void setUp() {
        boots = new Boots();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerAttackBoots_returnValue() {
        double espected = 2;
        assertEquals(espected, boots.powerAttack());
    }

    @Test
    void initialValue_protectionBoots_returnValue() {
        double espected = 4;
        assertEquals(espected, boots.protection());
    }

    @Test
    void initialValue_weigthBoots_returnValue() {
        int espected = 3;
        assertEquals(espected, boots.weigthItem());
    }

    @Test
    void initialValue_slotSpaceBoots_returnValue() {
        double espected = 1;
        assertEquals(espected, boots.slotSpace());
    }
}