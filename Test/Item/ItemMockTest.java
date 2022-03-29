package Item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemMockTest {
    ItemMock itemMock;

    @BeforeEach
    void setUp() {
        itemMock = new ItemMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_slotSapaceItem_returnValue() {
        int espected = 0;
        assertEquals(espected, itemMock.slotSpace());
    }

    @Test
    void initialValue_weigthItem_returnValue() {
        int espected = 0;
        assertEquals(espected, itemMock.weigth());

    }

    @Test
    void initialValue_pickUpByItem_returnValue() {

    }

    @Test
    void initialValue_dropByItem_returnValue() {

    }
}