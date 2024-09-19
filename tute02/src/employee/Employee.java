package employee;

public class Employee {
    private String name;
    private int salary;
    
    /**
     * Creating an employee with name and salary
     * @param name
     * @param salary
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

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

    // * Override methods
    // Override indicates that a class is intending to change the implementation of a method declared in a super class
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Check if obj is exact same instance or reference, return true
        if (this == obj) return true;

        // Check if obj is null, return false 
        if (obj == null) return false;

        // Check if objects are different classes, return false
        if (!getClass().equals(obj.getClass())) return false;

        // Now we know that the classes are the same (Employee), we can now downcast
        Employee other = (Employee) obj;
        // Compare each attribute inside the class
        if (name.equals(other.name) && salary == other.salary) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amanda", 100);
        Employee e2 = new Employee("Carl", 100);
        
        // == is comparing memory addresses where is instance is stored
        System.out.println(e1.equals(e2));

        Manager e3 = new Manager("Alvin", 200);
        System.out.println(e3);
    }

    
}
