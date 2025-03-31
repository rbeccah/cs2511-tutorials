package calculator.composite;

public class Subtraction implements Expression {
    private Expression e1;
    private Expression e2;
    
    public Subtraction(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double compute() {
        return e1.compute() - e2.compute();
    }
}
