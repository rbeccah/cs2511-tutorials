package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? This getSalary() and setSalary() are not doing anything? 
    // Unneeded methods which are forced ot be inherited from the parent
    // This is the refused bequest code smell
    // That means there is a deeper design issue with this code
    // Student doesn't have salary (functionality for salary does nothing) but Person does
    // This is where Student (subclass) is not behaving like the Person (superclass) which has salary
    // This is a violation of LSP
}
