package Character.Race;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceMockTest {
    Race orc;
    Race orc1;
    Race human;

    @BeforeEach
    void setUp() {
        orc = new Orc();
        orc1 = new Orc();
        human = new Human();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void clasRace_equals_RaceTrue() {
        assertTrue(orc.equals(orc1));
    }
    @Test
    void classRace_equals_RaceFalse() {
        assertFalse(orc.equals(human));
    }

}