package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human;
    Strength strength;
    Constitution constitution;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        human = new Human();
        strength = new Strength(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_modifierHumanStrength_ValueModified() {
        int expected = 2;
        int valueModified = human.modifier(strength);
        assertEquals(expected, valueModified);
    }

    @Test
    void initialValue_modifierHumanConstitution_ValueModified() {
        int expected = 2;
        int valuedModified = human.modifier(constitution);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierHumanIntelligence_ValueModified() {
        int expected = 0;
        int valuedModified = human.modifier(intelligence);
        assertEquals(expected, valuedModified);
    }

    @Test
    void initialValue_modifierHumanDexterity_ValueModified() {
        int expected = 1;
        int valuedModified = human.modifier(dexterity);
        assertEquals(expected, valuedModified);
    }
}