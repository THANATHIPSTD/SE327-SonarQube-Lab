package se331;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AdvancedCalculatorTest {

    @Test
    void testPower() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(8.0, calculator.power(2, 3), 0.01);
    }

    @Test
    void testSqrt() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(2.0, calculator.sqrt(4), 0.01);
    }
}
