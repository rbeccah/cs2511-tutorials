package beverage;

public abstract class Beverage {
    public final void prepareBeverage() {
        beverageString();
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        // * Hook Method: Do nothing by default and can be redefined by subclasses if necessary
        // Gives subclasses the choice to "hook into" the algorithm or ignore it
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

    // Abstract steps to be implemented by subclasses
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
