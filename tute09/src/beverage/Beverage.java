package beverage;

public class Beverage {
    public void prepareBeverage() {
        beverageString();
        boilWater();
        brew();
        pourInCup();
        addCondiment();

        // * Hook method: Do nothing by default and can be redefined by subclasses if necessary
        if (hasStraw()) {
            addStraw();
        }
    }

    public void prepareCoffee() {
        System.out.println("------- Preparing Coffee -------");
        System.out.println("Boiling water");
        System.out.println("Brewing: Dripping coffee through filter");
        System.out.println("Pouring into cup");
        System.out.println("Adding condiments: Sugar and milk");
    }

    public void prepareMilktea() {
        System.out.println("------- Preparing Milk Tea -------");
        System.out.println("Boiling water");
        System.out.println("Brewing: Steeping tea and cooking boba");
        System.out.println("Pouring into cup");
        System.out.println("Adding condiments: Milk and boba pearls");
        System.out.println("Adding straw to beverage");
    }

    public void prepareMatcha() {
        System.out.println("------- Preparing Matcha -------");
        System.out.println("Boiling water");
        System.out.println("Brewing: Steeping matcha");
        System.out.println("Pouring into cup");
        System.out.println("Adding condiments: Honey");
    }

    public static void main(String[] args) {
        Beverage coffee = new Beverage();
        coffee.prepareCoffee();

        System.out.println();

        Beverage milkTea = new Beverage();
        milkTea.prepareMilktea();
    }
}
