package Character.Race;

import Character.Stat.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcTest {
    Orc orc;
    Strength strength = new Strength(5);
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        orc = new Orc();
        ;
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierOrcStrength_ValueModified() {
        int expected = 5;
        int valueModified = orc.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierOrcConstitution_ValueModified() {
        int expected = 3;
        int valueModified = orc.modifier(constitution);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierOrcIntelligence_ValueModified() {
        int expected = -3;
        int valueModified = orc.modifier(intelligence);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierOrcDexterity_ValueModified() {
        int expected = 0;
        int valueModified = orc.modifier(dexterity);
        assertEquals(expected, valueModified);
    }
}