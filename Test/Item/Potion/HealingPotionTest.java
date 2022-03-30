package Item.Potion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealingPotionTest {
    HealingPotion healingPotion;

    @BeforeEach
    void setUp() {
        healingPotion = new HealingPotion();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthHealingPotion_returnValue() {
        int espected = 2;
        assertEquals(espected, healingPotion.weigth());
    }

    @Test
    void initialValue_powerHealingPotion_returnValue() {
        double espected = 50;
        assertEquals(espected, healingPotion.power());
    }
}