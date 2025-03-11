package people;

public class Tutor extends Person {
    private int payRate;

    public Tutor(String name, int age, int payRate) {
        super(name, age);
        this.payRate = payRate;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
}
