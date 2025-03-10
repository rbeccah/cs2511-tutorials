package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? getSalary() and setSalary() essentially are not doing anything. Do we think this is good design? 
    // getSalary and setSalary do nothing, in other words Student does not have a salary
    // Student does not behave like the Person (superclass)
    // Code smell called refused bequest
}
