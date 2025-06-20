package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? This getSalary() and setSalary() are not doing anything? 
    // getSalary and setSalary are not doing anything, in other words, the Student doesn't have a salary
    // Student (subclass) is not behaving like my Person (superclass)
    // This violate LSP
    // Code smell is called refused bequest
    // @Override
    // public int getSalary() {
    //     return 0;
    // }

    // @Override
    // public void setSalary(String payRate) {
    //     return;
    // }
}
