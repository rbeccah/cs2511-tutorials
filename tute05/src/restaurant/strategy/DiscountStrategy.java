package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class DiscountStrategy implements ChargingStrategy {
    private static final double STANDARD_RATE = 1;
    private static final double MEMBER_RATE = 0.85;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        if (payeeIsMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * MEMBER_RATE).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double displayMenu() {
        return STANDARD_RATE;
    }
    
}
