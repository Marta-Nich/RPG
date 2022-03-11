package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GargoyleTest {
    Gargoyle gargoyle;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        gargoyle = new Gargoyle();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierGargoyleStrength_ValueModified() {
        int expected = 0;
        int valueModified = gargoyle.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierGargoyleConstitution_ValueModified() {
        int expected = 3;
        int valuedModified = gargoyle.modifier(constitution);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierGargoyleIntelligence_ValueModified() {
        int expected = -1;
        int valuedModified = gargoyle.modifier(intelligence);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierGargoyleDexterity_ValueModified() {
        int expected = 3;
        int valuedModified = gargoyle.modifier(dexterity);
        assertEquals(expected, valuedModified);
    }
}