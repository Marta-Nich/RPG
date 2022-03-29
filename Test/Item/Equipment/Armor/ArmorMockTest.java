package Item.Equipment.Armor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorMockTest {
    ArmorMock armorMock;

    @BeforeEach
    void setUp() {
        armorMock = new ArmorMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerAttackArmorMock_returnValue() {
        assertEquals(espected, armorMock.powerAttack());
    }

    @Test
    void initialValue_protectionArmorMock_returnValue() {
        double espected = 0;
        assertEquals(espected, armorMock.protection());
    }

    @Test
    void initialValue_weigthArmorMock_returnValue() {
        int espected = 0;
        assertEquals(espected, armorMock.weigth());
    }

    @Test
    void initialValue_slotSpaceArmorMock_returnValue() {
        double espected = 0;
        assertEquals(espected, armorMock.slotSpace());
    }  double espected = 0;

}