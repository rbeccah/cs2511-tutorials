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

    //* equals() compares the contents between two classes
    // ? Why is the signature not public boolean equals(Employee other)
    // We allow users to compare any pair of objects. From perspective of equals() method, it 
    // does not know what classes it is comparing to, so make most generic assumption that class is Object
    @Override
    public boolean equals(Object obj) {
    // Check if obj is the same instance
        if (this == obj) return true;

        // Check if obj is null
        if (obj == null) return false;

        // Check if the objects are the same class type
        if (getClass() != obj.getClass()) return false;

        // Once confirmed that obj is the same class, it can be downcasted safely 
        // to current class so attributes can be compared
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
        //* Similar to strings in C. Using '==' compares two object references to see if they refer to the same instance. 
        //* Under the hood, it basically compares the memory the memory location of the objects
        //* To compare contents, in C we use strcmp(). Similarly, in Java to compare classes we use equals() */
        // System.out.println(e1 == e2);
    }
}
