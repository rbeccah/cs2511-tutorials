package beverage;

public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public void beverageString() {
        System.out.println("------- Preparing Coffee -------");
    }
}