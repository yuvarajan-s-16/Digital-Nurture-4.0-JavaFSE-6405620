import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calculator.subtract(7, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(21, calculator.multiply(7, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(7, 0);
    }
}
