package Item.Food;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonousFoodDecoratorTest {
    Apple apple;
    BeansWithCod beansWithCod;
    Bread bread;
    Chicken chicken;
    LeekCream leekCream;

    PoisonousFoodDecorator poisonousFoodDecoratorApple;
    PoisonousFoodDecorator poisonousFoodDecoratorBeansWithCod;
    PoisonousFoodDecorator poisonousFoodDecoratorBread;
    PoisonousFoodDecorator poisonousFoodDecoratorChicken;
    PoisonousFoodDecorator poisonousFoodDecoratorLeekCream;


    @BeforeEach
    void setUp() {
        apple = new Apple();
        beansWithCod = new BeansWithCod();
        bread = new Bread();
        chicken = new Chicken();
        leekCream = new LeekCream();
        poisonousFoodDecoratorApple = new PoisonousFoodDecorator(apple);
        poisonousFoodDecoratorBeansWithCod = new PoisonousFoodDecorator(beansWithCod);
        poisonousFoodDecoratorBread = new PoisonousFoodDecorator(bread);
        poisonousFoodDecoratorChicken = new PoisonousFoodDecorator(chicken);
        poisonousFoodDecoratorLeekCream = new PoisonousFoodDecorator(leekCream);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerPoisonousFoodDecoratorApple_returnValue() {
        double espected = -5;
        assertEquals(espected, poisonousFoodDecoratorApple.power());
    }

    @Test
    void initialValue_weigthPoisonousFoodDecoratorApple_returnValue() {
        int espected = 1;
        assertEquals(espected, poisonousFoodDecoratorApple.weigth());
    }

    @Test
    void initialValue_powerPoisonousFoodDecoratorBeansWithCod_returnValue() {
        double espected = -100;
        assertEquals(espected, poisonousFoodDecoratorBeansWithCod.power());
    }

    @Test
    void initialValue_weigthPoisonousFoodDecoratorBeansWithCod_returnValue() {
        int espected = 5;
        assertEquals(espected, poisonousFoodDecoratorBeansWithCod.weigth());
    }

    @Test
    void initialValue_powerPoisonousFoodDecoratorBread_returnValue() {
        double espected = -10;
        assertEquals(espected, poisonousFoodDecoratorBread.power());
    }

    @Test
    void initialValue_weigthPoisonousFoodDecoratorBread_returnValue() {
        int espected = 2;
        assertEquals(espected, poisonousFoodDecoratorBread.weigth());
    }

    @Test
    void initialValue_powerPoisonousFoodDecoratorChicken_returnValue() {
        double espected = -25;
        assertEquals(espected, poisonousFoodDecoratorChicken.power());
    }

    @Test
    void initialValue_weigthPoisonousFoodDecoratorChicken_returnValue() {
        int espected = 3;
        assertEquals(espected, poisonousFoodDecoratorChicken.weigth());
    }

    @Test
    void initialValue_powerPoisonousFoodDecoratorLeekCream_returnValue() {
        double espected = -50;
        assertEquals(espected, poisonousFoodDecoratorLeekCream.power());
    }

    @Test
    void initialValue_weigthPoisonousFoodDecoratorLeekCream_returnValue() {
        int espected = 4;
        assertEquals(espected, poisonousFoodDecoratorLeekCream.weigth());
    }
}