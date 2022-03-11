package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LichTest {
    Lich lich;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        lich = new Lich();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierLichStrength_ValueModified() {
        int expected = 3;
        int valueModified = lich.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierLichConstitution_ValueModified() {
        int expected = -3;
        int valuedModified = lich.modifier(constitution);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierLichIntelligence_ValueModified() {
        int expected = 5;
        int valuedModified = lich.modifier(intelligence);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierLichDexterity_ValueModified() {
        int expected = 0;
        int valuedModified = lich.modifier(dexterity);
        assertEquals(expected, valuedModified);
    }
}