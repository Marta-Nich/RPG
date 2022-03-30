package Inventory;

import Character.Job.Archer;
import Character.Race.Elf;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Equipment.Armor.Boots;
import Item.Equipment.Jewelry.Necklace;
import Item.Equipment.Weapon.Sword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.Pj;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {
    Equipment equipment;
    Pj pj;
    Sword sword;
    Necklace necklace;
    Boots boots;

    @BeforeEach
    void setUp() {
        pj = new Pj("h", new Elf(), new Archer(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(54));
        equipment = new Equipment(pj);
        sword = new Sword();
        necklace = new Necklace();
        boots = new Boots();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_entersEquipment_retunTrue() {
        assertTrue(equipment.enters(sword));
    }

    @Test
    void initialValue_entersEquipment_retunFalse() {
        equipment.equipIEquipable(boots);
        assertFalse(equipment.enters(boots));
    }

    @Test
    void initialValue_totalBonusAttackEquipment_retunValue() {
        equipment.equipIEquipable(boots);
        equipment.equipIEquipable(sword);
        equipment.equipIEquipable(necklace);
        double especed = 14;
        assertEquals(especed,equipment.totalBonusAttack());
    }

    @Test
    void initialValue_totalBonusWeigthEquipment_retunValue() {
        equipment.equipIEquipable(boots);
        equipment.equipIEquipable(sword);
        equipment.equipIEquipable(necklace);
        double especed = 20;
        assertEquals(especed,equipment.totalBonusWeigth());
    }

    @Test
    void initialValue_totalBonusProtectionEquipment_retunValue() {
        equipment.equipIEquipable(boots);
        equipment.equipIEquipable(sword);
        equipment.equipIEquipable(necklace);
        double especed = 16;
        assertEquals(especed,equipment.totalBonusProtection());
    }
}