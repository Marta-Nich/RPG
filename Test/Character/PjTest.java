package Character;

import Character.Job.JobMock;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Food.*;
import Item.Potion.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PjTest {
    RaceMock raceMock;
    JobMock jobMock;

    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    Pj pj;

    Apple apple;
    BeansWithCod beansWithCod;
    Bread bread;
    Chicken chicken;
    LeekCream leekCream;

    PotionMock healingPotion;
    MiniorHealingPotionDecorator miniorHealingPotionDecorator;
    GreatHealingPotionDecorator greatHealingPotionDecorator;

    EnhancedFoodDecorator enhancedFoodDecoratorApple;
    EnhancedFoodDecorator enhancedFoodDecoratorBeansWithCod;
    EnhancedFoodDecorator enhancedFoodDecoratorBread;
    EnhancedFoodDecorator enhancedFoodDecoratorChicken;
    EnhancedFoodDecorator enhancedFoodDecoratorLeekCream;

    @BeforeEach
    void setUp() {
        raceMock = new RaceMock();
        jobMock = new JobMock();

        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);

        pj = new Pj("M", raceMock, jobMock, strength, dexterity, constitution, intelligence);

        apple = new Apple();
        beansWithCod = new BeansWithCod();
        bread = new Bread();
        chicken = new Chicken();
        leekCream = new LeekCream();

        healingPotion = new PotionMock();
        miniorHealingPotionDecorator = new MiniorHealingPotionDecorator(healingPotion);
        greatHealingPotionDecorator = new GreatHealingPotionDecorator(healingPotion);

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
    void nameExpected_GetNamePj_RetunName() {
        String expected = "M";
        assertEquals(expected, pj.getName());
    }

    @Test
    void raceExpected_GetRacePj_RetunRace() {
        assertEquals(raceMock, pj.getRace());
    }

    @Test
    void jobExpected_GetJobPj_RetuenJob() {
        assertEquals(jobMock, pj.getJob());
    }

    @Test
    void initialValue_maxWeigthPJ_ReturnVelocity() {
        double expected = 30;
        assertEquals(expected, pj.maxWeigth());
    }

    @Test
    void initialValue_VelocityPJ_ReturnVelocity() {
        double expected = 10;
        assertEquals(expected, pj.velocity());
    }

    @Test
    void initialValue_PowerPj_ReturnPower() {
        double expected = 10;
        assertEquals(expected, pj.power());
    }

    @Test
    void initialValue_MagicPj_ReturnMagic() {
        double expected = 10;
        assertEquals(expected, pj.velocity());
    }

    @Test
    void initialSting_TestToStringPj_ReturnString() {
        String expected = "My name is " + pj.getName() + "." + " I’m an " + pj.getRace() + " " + pj.getJob() +
                " My stats are: Strength: " + strength + " " +
                "Dexterity: " + dexterity + " " +
                "Constitution: " + constitution + " " +
                "Velocity: " + "10.0" + " " +
                "Power: " + "10.0" + " " +
                "Magic: " + "10.0" + " " +
                "Health: " + "125.0";
        assertEquals(expected, pj.toString());
    }

    @Test
    void initialHealth_MaxHealthPj_ReturnMaxHealth() {
        double expected = 125;
        assertEquals(expected, pj.maxHealth());
    }

    @Test
    void initialHealth_HealthPj_ReturnHealth() {
        double expected = 125;
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_Health0Pj_ReturnHealth() {
        double expected = 125 - 125;
        pj.receivesDamage(125);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialValue_iIDeadPj_ReturnTrue() {
        pj.receivesDamage(125);
        assertTrue(pj.isDead());
    }

    @Test
    void initialValue_iIDeadPj_ReturnFalse() {
        assertFalse(pj.isDead());
    }

    @Test
    void initialValue_receivesDamagePj_ReturnDamage() {
        double expected = 125 - 25;
        pj.receivesDamage(25);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialValue_receivesDamageAmountNegativoPj_ReturnDamage() {
        double expected = 125;
        pj.receivesDamage(-25);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_HealthMenos0Pj_ReturnHealth() {
        double expected = 0;
        pj.receivesDamage(1256);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_healsPj_ReturnHeals() {
        double expected = 125 - 70 + 5;
        pj.receivesDamage(70);
        pj.heals(5);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_healsNegativoPj_ReturnHeals() {
        double expected = 125 - 70 + 0;
        pj.receivesDamage(70);
        pj.heals(-5);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_heals0Pj_ReturnHeals() {
        double expected = 125 - 70 + 0;
        pj.receivesDamage(70);
        pj.heals(0);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesApple_ReturnHeals() {
        double expected = 125 - 70 + 5;
        pj.receivesDamage(70);
        pj.consumes(apple);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesBeansWithCod_ReturnHeals() {
        double expected = 125 - 100 + 100;
        pj.receivesDamage(100);
        pj.consumes(beansWithCod);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesBread_ReturnHeals() {
        double expected = 125 - 70 + 10;
        pj.receivesDamage(70);
        pj.consumes(bread);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesChicken_ReturnHeals() {
        double expected = 125 - 70 + 25;
        pj.receivesDamage(70);
        pj.consumes(chicken);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesLeekCream_ReturnHeals() {
        double expected = 125 - 70 + 50;
        pj.receivesDamage(70);
        pj.consumes(leekCream);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesMinorHealingPotionDecorator_ReturnHeals() {
        double expected = 125 - 100 + 25;
        pj.receivesDamage(100);
        pj.consumes(miniorHealingPotionDecorator);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesHealingPotion_ReturnHeals() {
        double expected = 125 - 100 + 50;
        pj.receivesDamage(100);
        pj.consumes(healingPotion);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesGreaterHealingPotionDecorator_ReturnHeals() {
        double expected = 125 - 100 + 100;
        pj.receivesDamage(100);
        pj.consumes(greatHealingPotionDecorator);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesEnhancedFoodDecoratorBeansWithCod_ReturnHeals() {
        //Cura 200
        double expected = 125;
        pj.receivesDamage(100);
        pj.consumes(enhancedFoodDecoratorBeansWithCod);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesEnhancedFoodDecoratorBread_ReturnHeals() {
        double expected = 125 - 100 + 20;
        pj.receivesDamage(100);
        pj.consumes(enhancedFoodDecoratorBread);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesEnhancedFoodDecoratorChicken_ReturnHeals() {
        double expected = 125 - 100 + 50;
        pj.receivesDamage(100);
        pj.consumes(enhancedFoodDecoratorChicken);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesEnhancedFoodDecoratorApple_ReturnHeals() {
        double expected = 125 - 105 + 10;
        pj.receivesDamage(105);
        pj.consumes(enhancedFoodDecoratorApple);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesEnhancedFoodDecoratorLeekCream_ReturnHeals() {
        double expected = 125 - 105 + 100;
        pj.receivesDamage(105);
        pj.consumes(enhancedFoodDecoratorLeekCream);
        assertEquals(expected, pj.health());
    }
}