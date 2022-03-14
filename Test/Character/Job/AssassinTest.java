package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssassinTest {
    Assassin assassin;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        assassin = new Assassin();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierAssassinStrength_ValueModified() {
        int expected = 1;
        int valueModified = assassin.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierAssassinIntelligence_ValueModified() {
        int expected = 0;
        int valueModified = assassin.modifier(intelligence);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierAssassinDexterity_ValueModified() {
        int expected = 3;
        int valueModified = assassin.modifier(dexterity);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierAssassinConstitution_ValueModified() {
        int expected = 1;
        int valueModified = assassin.modifier(constitution);
        assertEquals(expected, valueModified);
    }
}