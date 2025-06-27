import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);         // checks equality
        assertTrue(5 > 3);              // true condition
        assertFalse(5 < 3);             // false condition
        assertNull(null);              // null check
        assertNotNull(new Object());   // not null check
    }
}
