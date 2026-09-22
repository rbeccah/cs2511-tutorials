package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    /**
     * Creating a Manager where the hireDate is today
     * @param name
     * @param salary
     */
    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Unlike name or salary, it is very unlikely that the hire date will change
    // Getter and setters can break encapsulation
    // In general, it is good practice to include include the getters and setters that you need
    // public void setHireDate(LocalDate hireDate) {
    //     this.hireDate = hireDate;
    // }

    @Override 
    public String toString() {
        return super.toString() + "hireDate=" + hireDate + "]";
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
