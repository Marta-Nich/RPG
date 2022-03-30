package Item.Potion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatHealingPotionDecoratorTest {
    HealingPotion healingPotion;
    GreatHealingPotionDecorator greatHealingPotionDecorator;

    @BeforeEach
    void setUp() {
        healingPotion = new HealingPotion();
        greatHealingPotionDecorator = new GreatHealingPotionDecorator(healingPotion);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_weigthGreatHealingPotionDecorator_retunValue() {
        int espected = 3;
        assertEquals(espected, greatHealingPotionDecorator.weigthItem());
    }

    @Test
    void initialValue_powerGreatHealingPotionDecorator_retunValue() {
        double espected = 100;
        assertEquals(espected, greatHealingPotionDecorator.power());
    }
}