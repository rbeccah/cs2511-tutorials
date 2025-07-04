package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class DiscountStrategy implements ChargingStrategy {
    private static final double STANDARD_RATE = 1;
    private static final double MEMBER_RATE = 0.85;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        double modifier = payeeIsMember ? MEMBER_RATE : STANDARD_RATE;
        return order.stream().mapToDouble(meal -> meal.getCost() * modifier).sum();
    }

    @Override
    public double costModifier() {
        return STANDARD_RATE;
    }
    
}
