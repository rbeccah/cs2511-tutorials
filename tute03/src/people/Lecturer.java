package people;

import java.util.Map;

public class Lecturer extends Person {
    private int salary;

    public Lecturer(String name, int age, String payRate) {
        super(name, age);
        setSalary(payRate);
    }

    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of a person given their pay rate
     * @param payRate New pay rate of the person
     * @precondition payRate is a valid rate label string in the PAY_RATES map
     * @postcondition salary of the person is set to the correct value according to the payRate
     */
    public void setSalary(String payRate) {
        // payRate = "LVL0"
        Integer pay = PAY_RATES.get(payRate);
        salary = pay;
    }

    public static void main(String[] args) {
        Integer value = PAY_RATES.get("abc");
        System.out.println(PAY_RATES);
    }
}
