package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age, "LVL0");
    }

    // ? This getSalary() and setSalary() are not doing anything? 
    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public void setSalary(String payRate) {
        return;
    }
}
