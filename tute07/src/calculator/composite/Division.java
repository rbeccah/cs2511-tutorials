package calculator.composite;

public class Division implements Expression {
    private Expression e1;
    private Expression e2;

    public Division(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double compute() {
        if (e2.compute() == 0) {
            throw new ArithmeticException("division by zero");
        }
        return e1.compute() / e2.compute();
    }
}
