package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements ChargingStrategy {
    private static final double STANDARD_RATE = 1.15;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * STANDARD_RATE).sum();
    }

    @Override
    public double costMultiplier() {
        return STANDARD_RATE;
    }
    
}
