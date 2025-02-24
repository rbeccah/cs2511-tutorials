package employee;

public class Employee {
    private String name;
    private int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Get the name of the employee
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // All classes are subclass of the Object class
    // When we are overriding, we are changing the implementation of a method in the superclasses
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the obj is the exact same instance or reference, return true (==)
        if (this == obj) return true;

        // Check if obj is null, return false
        if (obj == null) return false;

        // Check if objects are the same class, not same class, return false
        if (getClass() != obj.getClass()) return false;

        // Once confirmed that obj is the same class (Employee), we can downcast it to Employee
        Employee other = (Employee) obj;
        // Compare each of the attributes
        if (name.equals(other.name) && salary == other.salary) return true;
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 50000);
        Employee e2 = new Employee("John", 50000);
        // ? Why is this returning false?
        // Similar to C when we want to compare strings, using "==" actually compares the memory addresses
        // In C, to compare the contents we use strcmp(), in Java equals() also compares the actual contents
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
}
