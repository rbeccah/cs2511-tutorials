package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age, "LVL0");
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public void setSalary(String payRate) {
        return;
    }
}
