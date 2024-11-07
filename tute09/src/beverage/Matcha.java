package beverage;

public class Matcha extends Beverage {

    @Override
    public void brew() {
        System.out.println("Brewing: Steeping matcha");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding condiments: Honey");
    }

    @Override
    public void beverageString() {
        System.out.println("------- Preparing Milk Tea -------");
    }

    
    
}
