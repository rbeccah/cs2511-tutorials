package beverage;

public class MilkTea extends Beverage {

    @Override
    public void brew() {
        System.out.println("Brewing: Steeping tea and cooking boba");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding milk and boba pearls");
    }

    @Override
    public void beverageString() {
        System.out.println("------- Preparing Milk Tea -------");
    }
    
}
