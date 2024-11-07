package beverage;

public abstract class Beverage {
    public void prepareBeverage() {
        beverageString();
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        // * Hook method: By default does nothing, but can have the option of adding an additional for the subclasses
        if (hasStraw()) {
            addStraw();
        }
    }

    // Common steps
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean hasStraw() {
        return false;
    }

    public void addStraw() {
        System.out.println("Adding straw to beverage");
    }

    // Abstract methods that contain the unique steps
    public abstract void brew();
    public abstract void addCondiments();
    public abstract void beverageString();

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println();

        MilkTea milkTea = new MilkTea();
        milkTea.prepareBeverage();
    }
}
