package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creating a new Employee given name and salary
     * @param name
     * @param salary
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Getting the name of the employee
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // * Overriding Methods
    // All classes are subclasses of the Object class. Object class declares 2 methods, toString() and equals()
    // Override keyword changes the implementation of a method that was declared in a superclass

    // * toString() basically gives a string representation of a class
    // ? Why do we need toString()
    // To easily see what is stored in a class and for debugging
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    @Override
    // ? Why do we not take in Employee? 
    // From the perspective of equals(), make the most generic assumption that the object type is Object. 
    public boolean equals(Object obj) {
        // Check if obj is the same instance
        if (this == obj) return true;

        // Check if obj is null
        if (obj == null) return false;

        // Check if the objects are the same class type
        if (getClass() != obj.getClass()) return false;

        // At this point, we know that both objects are the same class. 
        // Then, we downcast obj safely to an Employee class
        Employee other = (Employee) obj;
        // Then, we can compare each of the attributes inside the class
        if (name.equals(other.name) && salary == other.salary) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Carl", 100);
        System.out.println(e1);

        Employee e2 = new Employee("Carl", 100);
        // In C to compare strings, "==" is comparing the actual references (memory)
        // In C to actually compare contents of string, we use strcmp()
        // In Java, to compare contents in a class we use equals()
        System.out.println(e1 == e2);
    }
}
