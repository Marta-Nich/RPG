package Inventory;

import Character.Job.Archer;
import Character.Pj;
import Character.Race.Elf;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Food.Apple;
import Item.ItemMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryMockTest {
    InventoryMock inventoryMock;
    Pj pj;

    @BeforeEach
    void setUp() {
        pj = new Pj("h", new Elf(), new Archer(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(54));
        inventoryMock = new InventoryMock(pj);
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
        Apple apple = new Apple();
        inventoryMock.pickItem(apple);
        double espected = apple.weigthItem();
        assertEquals(espected, inventoryMock.weigthListIPickable());
    }

    @Test
    void initialValue_getMaxWeightInventory_returnWeigth() {
        double espected = pj.maxWeigth();
        assertEquals(espected, inventoryMock.maxWeight());
    }
}