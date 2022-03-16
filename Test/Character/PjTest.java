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
    void nameExpected_getNamePj_RetunName() {
        String expected = "M";
        assertEquals(expected, pj.getName());
    }

    @Test
    void raceExpected_getRacePj_RetunRace() {
        assertEquals(elf, pj.getRace());
    }

    @Test
    void jobExpected_getJobPj_RetuenJob() {
        assertEquals(archer, pj.getJob());
    }

    @Test
    void initialValue_velocityPJ_ReturnVelocity() {
        double expected = 30;
        assertEquals(expected, pj.velocity());
    }

    @Test
    void initialValue_powerPj_ReturnPower() {
        double expected = 30;
        assertEquals(expected,pj.power());
    }

    @Test
    void initialValue_magicPj_ReturnMagic() {
        double expected = 30;
        assertEquals(expected,pj.velocity());
    }

    @Test
    void initialSting_testToStringPj_ReturnString() {
    }
}