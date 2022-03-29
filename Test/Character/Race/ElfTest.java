package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {
    RaceMock elf;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        elf = new RaceMock();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierElfStrength_ValueModified() {
        int expected = 0;
        int valueModified = elf.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValueFalse_modifierElfStrength_ValueModified() {
        int expected = 1;
        int valueModified = elf.modifier(strength);
        assertNotEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierElfConstitution_ValueModified() {
        int expected = -1;
        int valuedModified = elf.modifier(constitution);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValueFalse_modifierElfConstitution_ValueModified() {
        int expected = 1;
        int valuedModified = elf.modifier(constitution);
        assertNotEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierElfIntelligence_ValueModified() {
        int expected = 3;
        int valuedModified = elf.modifier(intelligence);
        assertEquals(expected, valuedModified);
    }
    @Test
    void initialValueFalse_modifierElfIntelligence_ValueModified() {
        int expected = 1;
        int valuedModified = elf.modifier(intelligence);
        assertNotEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierElfDexterity_ValueModified() {
        int expected = 3;
        int valuedModified = elf.modifier(dexterity);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValueFalse_modifierElfDexterity_ValueModified() {
        int expected = 1;
        int valuedModified = elf.modifier(dexterity);
        assertNotEquals(expected, valuedModified);
    }
}