package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    /**
     * Creates a Manager with the current day as the hire date
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
    // Unlike name and salary which can change often, hire date does not really need to be changed past the initial instantialising 
    // If we have unnecessary getters and setters, this could break encapsulation
    // public void setHireDate(LocalDate hireDate) {
    //     this.hireDate = hireDate;
    // }
    
    @Override
    public String toString() {
        return getClass().getName() + ", " + super.toString() + "[hireDate" + hireDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!super.equals(obj)) return false;

        Manager other = (Manager) obj;
        if (hireDate.equals(other.hireDate)) {
            return true;
        }
        return false;
    }
}
