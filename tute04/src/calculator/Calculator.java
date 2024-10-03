package calculator;

public class Calculator {
    
    /**
     * @precondition
     * @postcondition
     */
    public static Double add(Double a, Double b) {
        return a + b;
    }

    /**
     * @precondition
     * @postcondition
     */
    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    /**
     * @precondition
     * @postcondition
     */
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    /**
     * @precondition
     * @postcondition
     */
    public static Double divide(Double a, Double b) {
        return a / b;
    }

    /**
     * @precondition
     * @postcondition
     */
    public static Double sin(Double angle) {
        return Math.sin(angle);
    }

    /**
     * @precondition
     * @postcondition
     */
    public static Double cos(Double angle) {
        return Math.cos(angle);
    }

    /**
     * @precondition
     * @postcondition
     */
    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

}