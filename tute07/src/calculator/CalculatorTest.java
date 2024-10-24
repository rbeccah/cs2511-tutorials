package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import calculator.composite.Addition;
import calculator.composite.Division;
import calculator.composite.Expression;
import calculator.composite.Multiplication;
import calculator.composite.Subtraction;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Expression e = new Addition(new Number(1), new Number(2));
        assertEquals(3, e.compute());
    }

    @Test
    public void testSubtraction() {
        Expression e = new Subtraction(new Number(1), new Number(2));
        assertEquals(-1, e.compute());
    }

    @Test
    public void testMultiplication() {
        Expression e = new Multiplication(new Number(3), new Number(4));
        assertEquals(12, e.compute());
    }

    @Test
    public void testDivision() {
        Expression e = new Division(new Number(12), new Number(4));
        assertEquals(3, e.compute());
    }

    // Integration testing - Different units of the software application are being tested 
    // as a combined entity
    @Test
    public void testIntegration() {
        // ((1 + 2) - ((3 / 4) * 5))
        // = (3 - (0.75) * 5)
        // = (3 - 3.75)
        // = -0.75

        Calculator calculator = new Calculator(
            new Subtraction(
                new Addition(new Number(1), new Number(2)),
                new Multiplication(
                    new Division(new Number(3), new Number(4)),
                    new Number(5)))
        );
        assertEquals(-0.75, calculator.compute());
    }
}
