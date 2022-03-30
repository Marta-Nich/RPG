package Inventory;

import Character.Job.Archer;
import Character.Job.JobMock;
import Character.Race.Elf;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Food.Apple;
import Item.ItemMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.Pj;

import static org.junit.jupiter.api.Assertions.*;

class InventoryMockTest {
    InventoryMock inventoryMock;
    Pj pj;

    @BeforeEach
    void setUp() {
        inventoryMock = new InventoryMock();
        pj = new Pj("h", new RaceMock(), new JobMock(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(5));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_pickItemInventory_returnTrue() {
        inventoryMock.pickItem(new ItemMock());
        assertTrue(inventoryMock.callPickItem);
    }

    @Test
    void initialValue_dropItemInventory_returnValueTrue() {
        inventoryMock.dropItem(new ItemMock());
        assertTrue(inventoryMock.callDropItem);
    }

    @Test
    void initialValue_pickItemInventory_returnFalse() {
        assertFalse(inventoryMock.callPickItem);
    }

    @Test
    void initialValue_dropItemInventory_returnValueFalse() {
        assertFalse(inventoryMock.callDropItem);
    }

    @Test
    void initialValue_weigthListIPickableInventory_returnWeigth() {
        inventoryMock.pickItem(new Apple());
        double espected = 1;
        assertEquals(espected, inventoryMock.weigthListIPickable());
    }


    @Test
    void initialValue_getMaxWeightInventory_returnWeigth() {
        double espected = 30;
        assertEquals(espected, inventoryMock.maxWeight());
    }
}