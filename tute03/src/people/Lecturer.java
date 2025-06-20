package people;

import java.util.Map;

public class Lecturer extends Person {
    private int salary;

    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    /**
     * @precondition name, age, payRate are not null, payRate will be a valid String inside my PAY_RATES map
     * @postcondition sets the values for name, age and payrate
     * @param name
     * @param age
     * @param payRate
     */
    public Lecturer(String name, int age, String payRate) {
        super(name, age);
        setSalary(payRate);
    }

    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of a person given their pay rate
     * @param payRate New pay rate of the person
     * @precondition TODO
     * @postcondition TODO
     */
    public void setSalary(String payRate) {
        Integer pay = PAY_RATES.get(payRate);
        salary = pay;
    }
}
