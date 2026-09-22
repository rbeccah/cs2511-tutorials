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
     * 
     * @return
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

    // * Overriding methods
    // @Override is used to indicate that a class is intending to change the implementation of the superclass
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    @Override 
    public boolean equals(Object obj) {
        // Checks if obj is the exact same instance, return true
        if (this == obj) return true;

        // Check if obj is null, return false
        if (obj == null) return false;

        // Check if objects are different classes, return false
        if (getClass() != obj.getClass()) return false;

        // Once confirmed that they are the same class, downcast safely
        Employee other = (Employee) obj;
        // Compare each attribute inside the class
        if (name.equals(other.name) && salary == other.salary) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amanda", 100);
        Employee e2 = new Employee("Amanda", 100);
        Manager m1 = new Manager("Amanda", 100);

        System.out.println(e1);
        System.out.println(e1 == e2);

        char c1 = 'a';
        char c2 = 'a';
        System.out.println(c1 == c2);

        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e1));

        System.out.println(m1);
    }
}
