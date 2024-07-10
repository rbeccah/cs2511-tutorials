package calculator;

import calculator.composite.Expression;

public class Calculator {
    // ? What are our composite nodes? 
    // Operators (expression1 + expression2)

    // ? What are our leaf nodes? 
    // Number

    private Expression e;

    public Calculator(Expression e) {
        this.e = e;
    }

    public double compute() {
        return e.compute();
    }
}

