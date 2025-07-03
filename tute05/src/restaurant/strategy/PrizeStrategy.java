package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class PrizeStrategy implements ChargingStrategy {
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
        return 1;
    }
    
}
