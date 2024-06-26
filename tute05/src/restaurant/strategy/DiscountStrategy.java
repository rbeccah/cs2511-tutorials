package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class DiscountStrategy implements ChargingStrategy {
    public static final double STANDARD_RATE = 1;
    public static final double MEMBER_RATE = 0.85;

    @Override
    public double cost(List<Meal> order, Boolean payeeIsMember) {
        double modifier = payeeIsMember ? MEMBER_RATE : STANDARD_RATE;
        return order.stream().mapToDouble(meal -> meal.getCost() * modifier).sum();
    }

    @Override
    public double costMultipler() {
        return STANDARD_RATE;
    }
    
}
