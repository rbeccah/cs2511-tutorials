package people;

public class Lecturer extends Person {
    // Lecturer has salary
    private int salary;

    public Lecturer(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of a person given their pay rate
     * @param payRate New pay rate of the person
     * @precondition payRate is not null, payRate >= 0
     * @postcondition set the salary to the pay
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
