package Character;

import Character.Job.Archer;
import Character.Race.Elf;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
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


    @BeforeEach
    void setUp() {
        elf = new Elf();
        archer = new Archer();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
        pj = new Pj("M", elf, archer, strength, dexterity, constitution, intelligence);
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
    }

    //
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
        double expected = 375-375;
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
    void initialHealth_HealthMenos0Pj_ReturnHealth() {
        double expected = 0;
        pj.receivesDamage(376);
        assertEquals(expected, pj.health());
    }

    @Test
    void heals() {
    }
}