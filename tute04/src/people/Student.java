package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // ? getSalary and setSalary are basically doing nothing
    // A Student doesn't actually have a Salary so these functions don't really apply
    // Refused bequest -> code smell
}
