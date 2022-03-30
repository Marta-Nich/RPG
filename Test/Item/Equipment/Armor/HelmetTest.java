package Item.Equipment.Armor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelmetTest {
    Helmet helmet;

    @BeforeEach
    void setUp() {
        helmet = new Helmet();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerAttackHelmet_returnValue() {
        double espected = 3;
        assertEquals(espected, helmet.powerAttack());
    }

    @Test
    void initialValue_protectionHelmet_returnValue() {
        double espected = 5;
        assertEquals(espected, helmet.protection());
    }

    @Test
    void initialValue_weigthHelmet_returnValue() {
        int espected = 4;
        assertEquals(espected, helmet.weigthItem());
    }

    @Test
    void initialValue_slotSpaceHelmet_returnValue() {
        double espected = 1;
        assertEquals(espected, helmet.slotSpace());
    }
}