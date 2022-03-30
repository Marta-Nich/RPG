package Item;

import Character.Job.JobMock;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Inventory.InventoryMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.Pj;

import static org.junit.jupiter.api.Assertions.*;

class ItemMockTest {
    ItemMock itemMock;
    InventoryMock inventoryMock;
    Pj pj;

    @BeforeEach
    void setUp() {
        itemMock = new ItemMock();
        pj = new Pj("n", new RaceMock(), new JobMock(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(5));
        inventoryMock = new InventoryMock(pj);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthItem_returnValue() {
        int espected = 0;
        assertEquals(espected, itemMock.weigthItem());

    }

    @Test
    void initialValue_pickUpByItem_returnTrue() {
        itemMock.pickUpBy(pj);
        assertTrue(itemMock.callPickUpBy);
    }

    @Test
    void initialValue_pickUpByItem_returnFalse() {
        assertFalse(itemMock.callPickUpBy);
    }

    @Test
    void initialValue_dropByItem_returnTrue() {
        itemMock.dropBy(pj);
        assertTrue(itemMock.callDropBy);
    }

    @Test
    void initialValue_dropByItem_returnFalse() {
        assertFalse(itemMock.callDropBy);
    }
}