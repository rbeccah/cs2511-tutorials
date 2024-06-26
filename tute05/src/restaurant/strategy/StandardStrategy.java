package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    public static final double STANDARD_RATE = 1;

    @Override
    public double cost(List<Meal> order, Boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double costMultipler() {
        return STANDARD_RATE;
    }
    
}
