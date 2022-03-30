package Item.Potion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotionMockTest {
    PotionMock potionMock;

    @BeforeEach
    void setUp() {
        potionMock = new PotionMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthPotion_returnValue() {
        int espected = 0;
        assertEquals(espected, potionMock.weigth());
    }

    @Test
    void initialValue_powerPotion_returnValue() {
        double espected = 0;
        assertEquals(espected, potionMock.power());
    }
}