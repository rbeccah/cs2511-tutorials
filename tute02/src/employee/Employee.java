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
     * @return returns the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of employee
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // * Overriding
    // @Override is used to indicate that a class is intending to change the implementation of a method declared in the super class
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Check if obj is the exact same instance or reference, return true (==)
        if (this == obj) return true;

        // Check if obj is null, return false
        if (obj == null) return false;

        // Check if the objects are different classes, return false
        if (getClass() != obj.getClass()) return false;

        // Once we know that they are the same class, we can downcast safely
        Employee other = (Employee) obj;
        // Compare the attributes inside the class
        if (name.equals(other.name) && salary == other.salary) return true;
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Grace", 1000);
        System.out.println(e1);

        Employee e2 = new Employee("Grace", 1000);
        System.out.println(e2);
        // ? Why does this print out false? 
        // "==" compares the memory addresses
        // In C, to compare the contents of the strings strcmp(), in Java we use equals() to compare the contents of each class
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));

        Manager m1 = new Manager("Grace", 1000);
        System.out.println(m1.equals(e1));
        System.out.println(e1.equals(m1));
    }
}
