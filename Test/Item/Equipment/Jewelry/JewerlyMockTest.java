package Item.Equipment.Jewelry;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewerlyMockTest {
    JewerlyMock jewerlyMock;

    @BeforeEach
    void setUp() {
        jewerlyMock = new JewerlyMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerAttackJewerlyMock_returnValue() {
        double espected = 0;
        assertEquals(espected, jewerlyMock.powerAttack());
    }

    @Test
    void initialValue_protectionJewerlyMock_returnValue() {
        double espected = 0;
        assertEquals(espected, jewerlyMock.protection());
    }

    @Test
    void initialValue_weigthJewerlyMock_returnValue() {
        int espected = 0;
        assertEquals(espected, jewerlyMock.weigth());
    }

    @Test
    void initialValue_slotSpaceJewerlyMock_returnValue() {
        double espected = 0;
        assertEquals(espected, jewerlyMock.slotSpace());
    }
}