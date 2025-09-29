package se331;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    @Test
    void power_positiveExponent() {
        AdvancedCalculator ac = new AdvancedCalculator();
        assertEquals(8.0, ac.power(2, 3), 1e-9);
    }

    @Test
    void power_negativeExponent() {
        AdvancedCalculator ac = new AdvancedCalculator();
        assertEquals(0.125, ac.power(2, -3), 1e-9); // 2^-3 = 1/8
    }

    @Test
    void sqrt_positive() {
        AdvancedCalculator ac = new AdvancedCalculator();
        assertEquals(2.0, ac.sqrt(4), 1e-9);
    }

    @Test
    void sqrt_zero() {
        AdvancedCalculator ac = new AdvancedCalculator();
        assertEquals(0.0, ac.sqrt(0), 1e-9);
    }

    @Test
    void sqrt_negative_shouldThrow() {
        AdvancedCalculator ac = new AdvancedCalculator();
        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class, () -> ac.sqrt(-1));
        assertTrue(ex.getMessage().contains("square root of a negative"));
    }
}
