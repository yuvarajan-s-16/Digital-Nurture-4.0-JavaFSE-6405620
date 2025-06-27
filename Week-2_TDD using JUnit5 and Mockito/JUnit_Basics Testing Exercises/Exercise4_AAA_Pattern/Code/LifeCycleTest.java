import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class LifeCycleTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();  // Arrange
    }

    @After
    public void tearDown() {
        calculator = null;              // Cleanup
    }

    @Test
    public void testAdd() {
        int result = calculator.add(1, 2);  // Act
        assertEquals(3, result);           // Assert
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
}
