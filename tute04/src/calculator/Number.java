package calculator;

import calculator.composite.Expression;

/*
 * Leaf Node
 */
public class Number implements Expression {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public double compute() {
        return value;
    }
}
