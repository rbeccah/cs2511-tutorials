package beverage;

public abstract class Beverage {
    public void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        // * Hook method: By default it does nothing. Subclasses have the choice of implementing hook method or not
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

    private void addStraw() {
        System.out.println("Adding straw to beverage");
    }

    // Abstract steps to be implemented by subclasses
    public abstract void brew();
    public abstract void addCondiments();
}
