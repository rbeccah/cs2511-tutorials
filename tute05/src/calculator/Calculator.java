package calculator;

import calculator.composite.Expression;

/**
* @author Nick Patrikeos
**/
public class Calculator {
    Expression e;

    public Calculator(Expression e) {
        this.e = e;
    }

    public double compute() {
        return e.compute();
    }

}

