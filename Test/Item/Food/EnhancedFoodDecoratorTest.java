package Item.Food;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedFoodDecoratorTest {
    Apple apple;
    BeansWithCod beansWithCod;
    Bread bread;
    Chicken chicken;
    LeekCream leekCream;

    EnhancedFoodDecorator enhancedFoodDecoratorApple;
    EnhancedFoodDecorator enhancedFoodDecoratorBeansWithCod;
    EnhancedFoodDecorator enhancedFoodDecoratorBread;
    EnhancedFoodDecorator enhancedFoodDecoratorChicken;
    EnhancedFoodDecorator enhancedFoodDecoratorLeekCream;


    @BeforeEach
    void setUp() {
        apple = new Apple();
        beansWithCod = new BeansWithCod();
        bread = new Bread();
        chicken = new Chicken();
        leekCream = new LeekCream();
        enhancedFoodDecoratorApple = new EnhancedFoodDecorator(apple);
        enhancedFoodDecoratorBeansWithCod = new EnhancedFoodDecorator(beansWithCod);
        enhancedFoodDecoratorBread = new EnhancedFoodDecorator(bread);
        enhancedFoodDecoratorChicken = new EnhancedFoodDecorator(chicken);
        enhancedFoodDecoratorLeekCream = new EnhancedFoodDecorator(leekCream);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_powerEnhancedFoodDecoratorApple_returnValue() {
        double espected = 10;
        assertEquals(espected, enhancedFoodDecoratorApple.power());
    }

    @Test
    void initialValue_slotSpaceEnhancedFoodDecoratorApple_returnValue() {
        int espected = 1;
        assertEquals(espected, enhancedFoodDecoratorApple.slotSpace());
    }

    @Test
    void initialValue_weigthEnhancedFoodDecoratorApple_returnValue() {
        int espected = 1;
        assertEquals(espected, enhancedFoodDecoratorApple.weigth());
    }

    @Test
    void initialValue_powerEnhancedFoodDecoratorBeansWithCod_returnValue() {
        double espected = 200;
        assertEquals(espected, enhancedFoodDecoratorBread.power());
    }

    @Test
    void initialValue_slotSpaceEnhancedFoodDecoratorBeansWithCod_returnValue() {
        int espected = 1;
        assertEquals(espected, enhancedFoodDecoratorBread.slotSpace());
    }

    @Test
    void initialValue_weigthEnhancedFoodDecoratorBeansWithCodreturnValue() {
        int espected = 5;
        assertEquals(espected, enhancedFoodDecoratorBread.weigth());
    }

}