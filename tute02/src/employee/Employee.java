package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creates an Employee with the given name and salary.
     * 
     * @param name   The full name of the employee.
     * @param salary The employee's yearly salary in dollars.
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the employee's name
     * 
     * @return The full name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name
     * 
     * @param name The employee's new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's salary.
     * 
     * @return The employee's yearly salary in dollars.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the employee's salary.
     * 
     * @param salary The employee's yearly salary in dollars.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // * Overriding toString() and equals()
    // @Override is used to indicate that a class is intending to change the implementation of a method from the superclass
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    // ? Why does the equals take in Object? 
    // So it can take in any class to compare
    @Override
    public boolean equals(Object obj) {
        // Check if obj is the exact same instance or reference, return true
        if (this == obj) return true;

        // Check if obj is null, return false
        if (obj == null) return false;

        // Check if objects are different classes, return false
        if (getClass() != obj.getClass()) return false;

        // We know that the two are the same class type, then we can downcast safely
        Employee other = (Employee) obj;
        // Compare each attribute inside the class
        if (name.equals(other.name) && salary == other.salary) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amanda", 200);
        System.out.println(e1);

        Employee e2 = new Employee("Amanda", 200);
        // ? What this would print out? 
        // False, similar to strings in C, using "==" compares two object references to see if they are the same instance
        // Under the hood, basically compares the memory location of the objects
        // To compare contents, in C we use strcmp(). Similarly what equals() in Java
        // System.out.println(e1 == e2);
        System.out.println(e2.equals(e1));

        Manager m1 = new Manager("Amanda", 200);
        // ? What will this print out? 
        // FALSE
        System.out.println(e1.equals(m1));
    }
}
