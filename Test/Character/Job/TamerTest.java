package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TamerTest {
    Tamer tamer;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        tamer = new Tamer();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierTamerStrength_ValueModified() {
        int expected = 1;
        int valueModified = tamer.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierTamerIntelligence_ValueModified() {
        int expected = 2;
        int valueModified = tamer.modifier(intelligence);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierTamerDexterity_ValueModified() {
        int expected = 2;
        int valueModified = tamer.modifier(dexterity);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierTamerConstitution_ValueModified() {
        int expected = 0;
        int valueModified = tamer.modifier(constitution);
        assertEquals(expected, valueModified);
    }
}