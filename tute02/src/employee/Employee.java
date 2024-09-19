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
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get the salary of the employee
     * @return
     */
    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // * Overriding Methods
    // @Override is used to indicate that a class is intending to change the implementation of a method in the super classes

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    // ? Why do we take in Object instead of Employee
    @Override
    public boolean equals(Object obj) {
        // Check if obj is exactly the same instance or reference
        if (this == obj) return true;

        // Check if obj is null, return false
        if (obj == null) return false;

        // Check if objects are different classes, return false
        if (!getClass().equals(obj.getClass())) return false;

        // Now, we can compare the attributes
        // Downcast safely because we know they are the same class
        Employee other = (Employee) obj;
        if (name.equals(other.name) && salary == other.salary) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amanda", 100);
        Manager e2 = new Manager("Amanda", 100);

        // Why does this print false? 
        // strcmp()
        System.out.println(e1.equals(e2));

    }
}
