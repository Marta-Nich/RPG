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
    Elf elf;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;
    int initialValue = 5;

    @BeforeEach
    void setUp() {
        elf = new Elf();
        strength = new Strength(initialValue);
        constitution = new Constitution(initialValue);
        intelligence = new Intelligence(initialValue);
        dexterity = new Dexterity(initialValue);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierElfStrength_ValueModified() {
        int expected = elf.modifier(strength);
        assertEquals(expected,elf.modifier(strength));
    }
    @Test
    void initialValue_modifierOrcConstitution_ValueModified() {
        int expected = elf.modifier(constitution);
        assertEquals(expected,elf.modifier(constitution));
    }
    @Test
    void initialValue_modifierOrcIntelligence_ValueModified() {
        int expected = elf.modifier(intelligence);
        assertEquals(expected,elf.modifier(intelligence));
    }
    @Test
    void initialValue_modifierOrcDexterity_ValueModified() {
        int expected = elf.modifier(dexterity);
        assertEquals(expected,elf.modifier(dexterity));
    }

}