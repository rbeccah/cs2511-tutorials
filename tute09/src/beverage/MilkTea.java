package beverage;

public class MilkTea extends Beverage {
    public void prepareBeverage() {
        System.out.println("Boiling water");
        System.out.println("Steeping the tea");
        System.out.println("Cooking boba");
        System.out.println("Pouring into cup");
        System.out.println("Adding milk and boba pearls");

        System.out.println("Adding straw to beverage");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
        System.out.println("Cooking boba");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding milk and boba pearls");
    }

    @Override
    public boolean hasStraw() {
        return true;
    }
}