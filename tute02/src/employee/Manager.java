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

    // ? Do we really need setHIreDate here? 
    // Getters and setters, this does break encapsulation especially when they are used for inappropriate fields
    // public void setHireDate(LocalDate hireDate) {
    //     this.hireDate = hireDate;
    // }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!super.equals(obj)) return false;
        Manager other = (Manager) obj;
        return hireDate.equals(other.hireDate);
    }
    
}
