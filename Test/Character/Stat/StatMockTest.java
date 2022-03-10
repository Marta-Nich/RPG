package Character.Stat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatMockTest {
    StatMock statMonk;
    int initialValue = 5;
    StatMock statMonk0;
    int initialValue0 = 0;
    StatMock statMonkMenos0;
    int initialValueMenos0 = -1;

    @BeforeEach
    void setUp() {
        statMonk = new StatMock(initialValue);
        statMonk0 = new StatMock(initialValue0);
        statMonkMenos0 = new StatMock(initialValueMenos0);
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
    void initialValueMas0_Decrease_ValueDecreased() {
        statMonk.decrease();
        assertEquals(initialValue - 1, statMonk.getValue());
    }

    @Test
    void initialValue0_Decrease_ValueDecreased() {
        statMonk0.decrease();
        assertEquals(initialValue0, statMonk0.getValue());
    }

    @Test
    void initialValueMenos0_Decrease_ValueDecreased() {
        statMonkMenos0.decrease();
        assertEquals(initialValueMenos0, statMonkMenos0.getValue());
    }

    @Test
    void initialValue_testToString_ReturnString() {
        assertEquals("Stat{value=5}", statMonk.toString());
    }

}