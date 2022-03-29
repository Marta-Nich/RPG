package Item.Equipment.Jewelry;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NecklaceTest {
    Necklace necklace;

    @BeforeEach
    void setUp() {
        necklace = new Necklace();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerAttackNecklace_returnValue() {
        double espected = 2;
        assertEquals(espected, necklace.powerAttack());
    }

    @Test
    void initialValue_protectionNecklace_returnValue() {
        double espected = 1;
        assertEquals(espected, necklace.protection());
    }

    @Test
    void initialValue_weigthNecklace_returnValue() {
        int espected = 2;
        assertEquals(espected, necklace.weigth());
    }

    @Test
    void initialValue_slotSpaceNecklace_returnValue() {
        double espected = 1;
        assertEquals(espected, necklace.slotSpace());
    }
}