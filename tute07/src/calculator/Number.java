package calculator;

import calculator.composite.Expression;

/* 
 * Leaf node
 */
public class Number implements Expression {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public double compute() {
        return number;
    }

    
}
