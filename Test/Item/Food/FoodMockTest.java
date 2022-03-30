package Item.Food;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodMockTest {
    FoodMock foodMock;

    @BeforeEach
    void setUp() {
        foodMock = new FoodMock();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void initialValue_weigthFoodMock_returnValue() {
        int espected = 0;
        assertEquals(espected, foodMock.weigth());
    }

    @Test
    void initialValue_powerFoodMock_returnValue() {
        int espected = 0;
        assertEquals(espected, foodMock.weigth());
    }
}