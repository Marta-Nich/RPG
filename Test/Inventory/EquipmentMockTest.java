package Inventory;

import Character.Job.Archer;
import Character.Race.Elf;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Equipment.Weapon.Sword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.Pj;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentMockTest {
    EquipmentMock equipmentMock;
    Pj pj;
    Sword sword;

    @BeforeEach
    void setUp() {
        pj = new Pj("h", new Elf(), new Archer(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(54));
        equipmentMock = new EquipmentMock(pj);
        sword = new Sword();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_equipIEquipableEquipment_retunTrue() {
        equipmentMock.equipIEquipable(sword);
        assertTrue(equipmentMock.callEquipIEquipable);
    }

    @Test
    void initialValue_equipIEquipableEquipment_retunFalse() {
        assertFalse(equipmentMock.callEquipIEquipable);
    }

    @Test
    void initialValue_unEquipIEquipableEquipment_retunTrue() {
        equipmentMock.equipIEquipable(sword);
        equipmentMock.unEquipIEquipable(sword);
        assertTrue(equipmentMock.callUnEquipIEquipable);
    }

    @Test
    void initialValue_unEquipIEquipableEquipment_retunFalse() {
        assertFalse(equipmentMock.callUnEquipIEquipable);
    }
}