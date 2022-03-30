package Item.Equipment.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponMockTest {
    WeaponMock weaponMock;

    @BeforeEach
    void setUp() {
        weaponMock = new WeaponMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_getSpeedWeaponMock_returnValue() {
        double espected = 0;
        assertEquals(espected, weaponMock.getSpeed());
    }

    @Test
    void initialValue_totalAttackBonusWeaponMock_returnValue() {
        double espected = 0;
        assertEquals(espected, weaponMock.totalAttackBonus());
    }

    @Test
    void initialValue_powerAttackWeaponMock_returnValue() {
        double espected = 0;
        assertEquals(espected, weaponMock.powerAttack());
    }

    @Test
    void initialValue_protectionWeaponMock_returnValue() {
        double espected = 0;
        assertEquals(espected, weaponMock.protection());
    }

    @Test
    void initialValue_weigthWeaponMock_returnValue() {
        int espected = 0;
        assertEquals(espected, weaponMock.weigthItem());
    }

    @Test
    void initialValue_slotSpaceWeaponMock_returnValue() {
        double espected = 0;
        assertEquals(espected, weaponMock.slotSpace());
    }
}