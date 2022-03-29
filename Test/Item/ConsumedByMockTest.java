package Item;

import Character.Job.JobMock;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.Pj;

import static org.junit.jupiter.api.Assertions.*;

class ConsumedByMockTest {
    ConsumedByMock consumedByMock;

    @BeforeEach
    void setUp() {
        consumedByMock = new ConsumedByMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_consumedByMock_returnTrue() {
        consumedByMock.consumedBy(new Pj("h", new RaceMock(), new JobMock(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(5)));
        assertTrue(consumedByMock.callConsumedBy);
    }
    @Test
    void initialValue_consumedByMock_returnFalse() {
        assertFalse(consumedByMock.callConsumedBy);
    }
}