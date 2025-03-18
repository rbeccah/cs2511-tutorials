package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HappyHourStrategy implements ChargingStrategy {
    private static final double STANDARD_RATE = 0.7;
    private static final double MEMBER_RATE = 0.6;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        double modifier = payeeIsMember ? MEMBER_RATE : STANDARD_RATE;
        return order.stream().mapToDouble(meal -> meal.getCost() * modifier).sum();
    }

    @Override
    public double costMultiplier() {
        return STANDARD_RATE;
    }
    
}
