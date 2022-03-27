package Character;

import Character.Job.Archer;
import Character.Race.Elf;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Food.*;
import Item.Potion.GreaterHealingPotion;
import Item.Potion.HealingPotion;
import Item.Potion.MinorHealingPotion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PjTest {
    Pj pj;
    Elf elf;
    Archer archer;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;
    Apple apple;
    BeansWithCod beansWithCod;
    Bread bread;
    Chicken chicken;
    LeekCream leekCream;
    MinorHealingPotion minorHealingPotion;
    HealingPotion healingPotion;
    GreaterHealingPotion greaterHealingPotion;

    @BeforeEach
    void setUp() {
        elf = new Elf();
        archer = new Archer();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
        pj = new Pj("M", elf, archer, strength, dexterity, constitution, intelligence);
        apple = new Apple();
        beansWithCod = new BeansWithCod();
        bread = new Bread();
        chicken = new Chicken();
        leekCream = new LeekCream();
        minorHealingPotion = new MinorHealingPotion();
        healingPotion = new HealingPotion();
        greaterHealingPotion = new GreaterHealingPotion();
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
        assertEquals(elf, pj.getRace());
    }

    @Test
    void jobExpected_GetJobPj_RetuenJob() {
        assertEquals(archer, pj.getJob());
    }

    @Test
    void initialValue_VelocityPJ_ReturnVelocity() {
        double expected = 30;
        assertEquals(expected, pj.velocity());
    }

    @Test
    void initialValue_PowerPj_ReturnPower() {
        double expected = 30;
        assertEquals(expected, pj.power());
    }

    @Test
    void initialValue_MagicPj_ReturnMagic() {
        double expected = 30;
        assertEquals(expected, pj.velocity());
    }

    @Test
    void initialSting_TestToStringPj_ReturnString() {
        String expected = "My name is " + pj.getName() + "." + " I’m an " + pj.getRace() + " " + pj.getJob() +
                " My stats are: Strength: " + strength + " " +
                "Dexterity: " + dexterity + " " +
                "Constitution: " + constitution + " " +
                "Velocity: " + "30.0" + " " +
                "Power: " + "30.0" + " " +
                "Magic: " + "30.0" + " " +
                "Health: " + "375.0";
        assertEquals(expected, pj.toString());
    }

    @Test
    void initialHealth_MaxHealthPj_ReturnMaxHealth() {
        double expected = 375;
        assertEquals(expected, pj.maxHealth());
    }

    @Test
    void initialHealth_HealthPj_ReturnHealth() {
        double expected = 375;
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_Health0Pj_ReturnHealth() {
        double expected = 375 - 375;
        pj.receivesDamage(375);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialValue_iIDeadPj_ReturnTrue() {
        pj.receivesDamage(375);
        assertTrue(pj.isDead());
    }

    @Test
    void initialValue_iIDeadPj_ReturnFalse() {
        assertFalse(pj.isDead());
    }

    @Test
    void initialValue_receivesDamagePj_ReturnDamage() {
        double expected = 375 - 25;
        pj.receivesDamage(25);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialValue_receivesDamageAmountNegativoPj_ReturnDamage() {
        double expected = 375;
        pj.receivesDamage(-25);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_HealthMenos0Pj_ReturnHealth() {
        double expected = 0;
        pj.receivesDamage(376);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_healsPj_ReturnHeals() {
        double expected = 375 - 70 + 5;
        pj.receivesDamage(70);
        pj.heals(5);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_healsNegativoPj_ReturnHeals() {
        double expected = 375 - 70 + 0;
        pj.receivesDamage(70);
        pj.heals(-5);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_heals0Pj_ReturnHeals() {
        double expected = 375 - 70 + 0;
        pj.receivesDamage(70);
        pj.heals(0);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesApple_ReturnHeals() {
        double expected = 375 - 70 + 5;
        pj.receivesDamage(70);
        pj.consumes(apple);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesBeansWithCod_ReturnHeals() {
        double expected = 375 - 150 + 100;
        pj.receivesDamage(150);
        pj.consumes(beansWithCod);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesBread_ReturnHeals() {
        double expected = 375 - 70 + 10;
        pj.receivesDamage(70);
        pj.consumes(bread);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesChicken_ReturnHeals() {
        double expected = 375 - 70 + 25;
        pj.receivesDamage(70);
        pj.consumes(chicken);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesLeekCream_ReturnHeals() {
        double expected = 375 - 70 + 50;
        pj.receivesDamage(70);
        pj.consumes(leekCream);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesMinorHealingPotion_ReturnHeals() {
        double expected = 375 - 100 + 25;
        pj.receivesDamage(100);
        pj.consumes(minorHealingPotion);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesHealingPotion_ReturnHeals() {
        double expected = 375 - 100 + 50;
        pj.receivesDamage(100);
        pj.consumes(healingPotion);
        assertEquals(expected, pj.health());
    }

    @Test
    void initialHealth_consumesGreaterHealingPotion_ReturnHeals() {
        double expected = 375 - 100 + 100;
        pj.receivesDamage(100);
        pj.consumes(greaterHealingPotion);
        assertEquals(expected, pj.health());
    }
}