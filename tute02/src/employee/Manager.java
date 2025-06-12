package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    /**
     * Creates a manager with the hire date of today
     * @param name
     * @param salary
     */
    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // ? Do we really need a setter for the hire date? 
    // Unlike the name or salary, it is unlikely that the hire date will be updated, so setter is not needed
    // Encapsulation, unnecessary getters and setters can break encapuslation
    // public void setHireDate(LocalDate hireDate) {
    //     this.hireDate = hireDate;
    // }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        Manager other = (Manager) obj;
        return hireDate.equals(other.hireDate);
    }
    
}
