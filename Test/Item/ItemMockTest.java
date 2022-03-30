package Item;

import Inventory.InventoryMock;
import Item.Food.Apple;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemMockTest {
    ItemMock itemMock;
    InventoryMock inventoryMock;

    @BeforeEach
    void setUp() {
        itemMock = new ItemMock();
        inventoryMock = new InventoryMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthItem_returnValue() {
        int espected = 0;
        assertEquals(espected, itemMock.weigth());

    }

    @Test
    void initialValue_pickUpByItem_returnTrue() {
        itemMock.pickUpBy(inventoryMock);
        assertTrue(itemMock.callPickUpBy);
    }

    @Test
    void initialValue_pickUpByItem_returnFalse() {
        assertFalse(itemMock.callPickUpBy);
    }

    @Test
    void initialValue_dropByItem_returnTrue() {
        itemMock.dropBy(inventoryMock);
        assertTrue(itemMock.callDropBy);
    }

    @Test
    void initialValue_dropByItem_returnFalse() {
        assertFalse(itemMock.callDropBy);
    }
}