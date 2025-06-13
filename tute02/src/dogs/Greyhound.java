package dogs;

public class Greyhound extends Dog {
    private int speed;

    public Greyhound(String colour) {
        super(colour);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void bark() {
        System.out.println("woof woof!");
    }

    public void sleepOnCouch() {
        System.out.println("Having a nap on the couch!");
    }
   
}