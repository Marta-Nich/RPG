package Character.Stat;

import Character.Stat.StatMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatMockTest {
    StatMock statMonk;
    int initialValue = 5;

    @BeforeEach
    void setUp() {
        statMonk = new StatMock(initialValue);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_GetValue_ReturnValue() {
        assertEquals(initialValue, statMonk.getValue());
    }

    @Test
    void initialValue_Increase_ValueIncreased() {
        statMonk.increase();
        assertEquals(initialValue + 1, statMonk.getValue());
    }

    @Test
    void initialValue_Decrease_ValueDecreased() {
        statMonk.decrease();
        assertEquals(initialValue - 1, statMonk.getValue());
    }

    @Test
    void initialValue_testToString_ReturnString() {
        assertEquals("Stat{value=5}",statMonk.toString());
    }

}