package calculator;

public class Calculator {
    
    /**
     * precondition a, b != null
     * postcondition a + b
     */
    public static Double add(Double a, Double b) {
        return a + b;
    }

    /**
     * precondition a, b != null
     * postcondition a - b
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
     * precondition a, b != null. b != 0
     * postcondition a + b
     */
    public static Double divide(Double a, Double b) {
        return a / b;
    }

    /**
     * precondition a, b != null
     * postcondition sin(a)
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
     * precondition angle != null, angle != Math.PI / 2 + 2k * Math.PI
     * postcondition tan(a)
     */
    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

}