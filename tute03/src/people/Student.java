package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? This getSalary() and setSalary() are not doing anything? 
    // getSalary and setSaalry essentially are doing nothing, in other words Student doesn't have a salary
    // This is where Student (sublss) is not behaving like Person (superclass)
    // Violates LSP
    // Code smell called refused bequest
}
