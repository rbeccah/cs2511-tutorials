package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class DiscountStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cost'");
    }

    @Override
    public double costMultiplier() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'costMultiplier'");
    }
    
}
