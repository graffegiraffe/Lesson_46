package by.rublevskya.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(36.0, calculator.add(25.0, 11.0), "Addition of positive numbers");
        assertEquals(-4.0, calculator.add(-5.0, 1.0), "Addition of a negative and positive number");
        assertEquals(-50.0, calculator.add(-25.0, -25.0), "Addition of negative numbers");
        assertEquals(0.0, calculator.add(0.0, 0.0), "Putting zeros");
    }

    @Test
    void testSubtract() {
        assertEquals(53.0, calculator.subtract(55.0, 2.0), "Subtraction of positive numbers");
        assertEquals(-61.0, calculator.subtract(-60.0, 1.0), "Subtraction with a negative number");
        assertEquals(-11.0, calculator.subtract(22.0, 33.0), "The result is negative");
        assertEquals(0.0, calculator.subtract(0.0, 0.0), "Subtraction of zeros");
    }

    @Test
    void multiply() {
        assertEquals(3.0, calculator.multiply(1.0, 3.0), "Multiplication of positive numbers");
        assertEquals(-15.0, calculator.multiply(-5.0, 3.0), "Multiplication of a negative and positive number");
        assertEquals(22.0, calculator.multiply(-22.0, -1.0), "Multiplication of negative numbers");
        assertEquals(0.0, calculator.multiply(0.0, 5.0), "Multiplication by zero");
    }

    @Test
    void divide() {
        assertEquals(22.0, calculator.divide(66.0, 3.0), "Division of positive numbers");
        assertEquals(-30.0, calculator.divide(-90.0, 3.0), "Division of a negative number into positive");
        assertEquals(2.0, calculator.divide(-6.0, -3.0), "Division of negative numbers");

        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(25.0, 0.0));
        assertEquals("Division by zero", exception.getMessage(), "Division processing by zero");
    }
}