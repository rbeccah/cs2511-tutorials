package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? This getSalary() and setSalary() are not doing anything? 
    // Student doesnt have salary
    // This is where Student (subclass) is not behaving like the Person (superclass)
    // Violation of LSP
    // Code smell of refused bequest
}
