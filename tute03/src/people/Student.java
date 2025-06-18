package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? This getSalary() and setSalary() are not doing anything? Do we think this is good design?
    // getSalary and setSalary are essentially not doing anything, Student doesn't have a salary
    // This is where Student (subclass) is not behaving like the Person (superclass), which is a violation of LSP
    // Code smell called refused bequest

}
