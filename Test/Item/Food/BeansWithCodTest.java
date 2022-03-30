package Item.Food;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeansWithCodTest {
    BeansWithCod beansWithCod;

    @BeforeEach
    void setUp() {
        beansWithCod = new BeansWithCod();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthBeansWithCod_returnValue() {
        int espected = 5;
        assertEquals(espected, beansWithCod.weigth());
    }

    @Test
    void initialValue_powerBeansWithCod_returnValue() {
        double espected = 100;
        assertEquals(espected, beansWithCod.power());
    }
}