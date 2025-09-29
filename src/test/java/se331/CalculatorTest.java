package se331;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(7, c.add(3, 4));
    }

    @Test
    void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(-1, c.subtract(3, 4));
    }

    @Test
    void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(12, c.multiply(3, 4));
    }

    @Test
    void testDivide() {
        Calculator c = new Calculator();
        assertEquals(2.5, c.divide(5, 2), 1e-9);
    }

    @Test
    void testDivideByZero() {
        Calculator c = new Calculator();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> c.divide(5, 0)
        );
        assertTrue(ex.getMessage().contains("Division by zero"));
    }
}
