package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

// Interface which all charging strategy classes implement
public interface ChargingStrategy {
    public double cost(List<Meal> order, boolean payeeIsMember);
    public double displayMenu();
}
