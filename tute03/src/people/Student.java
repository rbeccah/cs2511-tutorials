package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? This getSalary() and setSalary() are not doing anything? 
    // Studet does not have a salary 
    // Student (subclass) is not behaving like the Person (superclass)
    // This violates LSP
    // Code smell called refused bequest
}
