package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Call the super as well
        if (!super.equals(obj)) return false;

        // Downcast into the Employee to access the attributes
        Manager other = (Manager) obj;
        // Compare the attributes
        if (hireDate.equals(other.hireDate)) {
            return true;
        }
        return false;
    }
    
}
