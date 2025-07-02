package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class PricingStrategy implements ChargingStrategy {
    private static final double STANDARD_RATE = 1;
    private int numCustomers = 0;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        numCustomers++;
        if (numCustomers % 100 == 0) {
            return 0;
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double costMultiplier() {
        return STANDARD_RATE;
    }
    
}
