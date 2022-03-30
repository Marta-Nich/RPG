package Item.Food;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreadTest {
    Bread bread;

    @BeforeEach
    void setUp() {
        bread = new Bread();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthBread_returnValue() {
        int espected = 2;
        assertEquals(espected, bread.weigthItem());
    }

    @Test
    void initialValue_powerBread_returnValue() {
        double espected = 10;
        assertEquals(espected, bread.power());
    }
}