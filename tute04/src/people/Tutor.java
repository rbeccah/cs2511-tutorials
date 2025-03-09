package people;

public class Tutor extends Person {
    private int payRate;

    public Tutor(String name, int age, int payRate) {
        super(name, age, "LVL0");
        this.payRate = payRate;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public void setSalary(String payRate) {
        return;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
}
