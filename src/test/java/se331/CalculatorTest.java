package se331;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldSum() {
        Calculator c = new Calculator();
        assertEquals(7, c.add(3, 4));
    }

    @Test
    void subtract_shouldSubtract() {
        Calculator c = new Calculator();
        assertEquals(-1, c.subtract(3, 4));
    }

    @Test
    void multiply_shouldMultiply() {
        Calculator c = new Calculator();
        assertEquals(12, c.multiply(3, 4));
    }

    @Test
    void divide_shouldDivide() {
        Calculator c = new Calculator();
        assertEquals(2.5, c.divide(5, 2), 1e-9);
    }

    @Test
    void divide_byZero_shouldThrow() {
        Calculator c = new Calculator();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> c.divide(1, 0)
        );
        assertTrue(ex.getMessage().contains("Division by zero"));
    }
}
