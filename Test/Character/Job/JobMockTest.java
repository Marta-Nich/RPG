package Character.Job;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobMockTest {
    Job archer;
    Job archer2;
    Job assassin;

    @BeforeEach
    void setUp() {
        archer = new JobMock();
        archer2 = new JobMock();
        assassin = new Assassin();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void classJob_equals_JobTrue() {
        assertTrue(archer.equals(archer));
    }
    @Test
    void classJob_equals_JobFalse() {
        assertFalse(archer.equals(assassin));
    }

    @Test
    void testToString() {
    }
}