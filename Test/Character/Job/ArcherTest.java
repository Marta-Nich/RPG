package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {
    JobMock archer;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        archer = new JobMock();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierArcherStrength_ValueModified() {
        int expected = 2;
        int valueModified = archer.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierArcherIntelligence_ValueModified() {
        int expected = 2;
        int valueModified = archer.modifier(intelligence);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierArcherDexterity_ValueModified() {
        int expected = 1;
        int valueModified = archer.modifier(dexterity);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierArcherConstitution_ValueModified() {
        int expected = 0;
        int valueModified = archer.modifier(constitution);
        assertEquals(expected, valueModified);
    }
}