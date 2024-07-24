package beverage;

public class Tea extends Beverage {
    public void prepareBeverage() {
        System.out.println("Boiling water");
        System.out.println("Steeping the tea");
        System.out.println("Pouring into cup");
        System.out.println("Adding lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}