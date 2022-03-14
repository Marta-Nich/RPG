package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    Mage mage;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        mage = new Mage();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierMageStrength_ValueModified() {
        int expected = 0;
        int valueModified = mage.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierMageIntelligence_ValueModified() {
        int expected = 4;
        int valueModified = mage.modifier(intelligence);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierMageDexterity_ValueModified() {
        int expected = 1;
        int valueModified = mage.modifier(dexterity);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierMageConstitution_ValueModified() {
        int expected = 0;
        int valueModified = mage.modifier(constitution);
        assertEquals(expected, valueModified);
    }
}