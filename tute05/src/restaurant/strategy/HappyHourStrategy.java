package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HappyHourStrategy implements ChargingStrategy {
    private static final double STANDARD_RATE = 0.7;
    private static final double MEMBER_RATE = 0.6;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        if (payeeIsMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * MEMBER_RATE).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * STANDARD_RATE).sum();
        }
    }

    @Override
    public double displayMenu() {
        return STANDARD_RATE;
    }
    
}
