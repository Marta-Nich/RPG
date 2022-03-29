package Character;

import Character.Job.Archer;
import Character.Race.Elf;
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
        consumesMock = new ConsumesMock("h", new Elf(), new Archer(), new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(54));
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