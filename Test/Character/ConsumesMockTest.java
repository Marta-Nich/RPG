package Character;

import Character.Job.JobMock;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Food.Apple;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConsumesMockTest {
    ConsumesMock consumesMock;

    @BeforeEach
    void setUp() {
        consumesMock = new ConsumesMock("h", new RaceMock(), new JobMock(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(54));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initialValue_consumes_returnTrue() {
        consumesMock.consumes(new Apple());
        assertTrue(consumesMock.callConsumed);
    }

    @Test
    void initialValue_consumes_returnFalse() {
        assertFalse(consumesMock.callConsumed);
    }
}