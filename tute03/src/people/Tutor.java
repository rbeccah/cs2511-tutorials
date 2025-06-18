package people;

import java.util.Map;

public class Tutor extends Person {
    // Tutor has payrate
    private int payRate;

    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    public Tutor(String name, int age, int payRate) {
        super(name, age);
        this.payRate = payRate;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
}
