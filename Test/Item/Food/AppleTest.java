package Item.Food;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple apple;

    @BeforeEach
    void setUp() {
        apple = new Apple();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthApple_returnValue() {
        int espected = 1;
        assertEquals(espected, apple.weigth());
    }

    @Test
    void initialValue_powerApple_returnValue() {
        double espected = 5;
        assertEquals(espected, apple.power());
    }
}