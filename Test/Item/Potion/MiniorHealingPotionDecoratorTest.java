package Item.Potion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniorHealingPotionDecoratorTest {
    HealingPotion healingPotion;
    MiniorHealingPotionDecorator miniorHealingPotionDecorator;

    @BeforeEach
    void setUp() {
        healingPotion = new HealingPotion();
        miniorHealingPotionDecorator = new MiniorHealingPotionDecorator(healingPotion);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_slotSpaceMinionHealingPotionDecorator_returnValue() {
        int espected = 1;
        assertEquals(espected, miniorHealingPotionDecorator.slotSpace());
    }

    @Test
    void initialValue_weigthMinionHealingPotionDecorator_returnValue() {
        int espected = 1;
        assertEquals(espected, miniorHealingPotionDecorator.weigth());
    }

    @Test
    void initialValue_powerMinionHealingPotionDecorator_returnValue() {
        double espected = 25;
        assertEquals(espected, miniorHealingPotionDecorator.power());
    }
}