package Item.Food;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {
    Chicken chicken;

    @BeforeEach
    void setUp() {
        chicken = new Chicken();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthChicken_returnValue() {
        int espected = 3;
        assertEquals(espected, chicken.weigthItem());
    }

    @Test
    void pinitialValue_powerChicken_returnValue() {
        double espected = 25;
        assertEquals(espected, chicken.power());
    }
}