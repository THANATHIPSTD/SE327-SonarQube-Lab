package se331;


public class AdvancedCalculator extends Calculator {

    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(int a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
