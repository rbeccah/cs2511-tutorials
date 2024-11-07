package beverage;

public class Coffee extends Beverage {

    @Override
    public void brew() {
        System.out.println("Brewing: Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding condiments: Sugar and milk");
    }

    @Override
    public void beverageString() {
        System.out.println("------- Preparing Coffee -------");
    }
    
}
