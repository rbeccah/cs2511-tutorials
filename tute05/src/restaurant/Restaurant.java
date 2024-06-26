package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.HolidayStrategy;
import restaurant.strategy.StandardStrategy;

public class Restaurant {

    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();
    
    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }
    
    // ? How does this switch statement break the open-closed principle?
    // * Open-Closed Principle: a class should be closed for modification but open for extension 
    // Here, we need to add a new switch statement everytime we want to add a new strategy 

    // ? Why does the new implementation not violate the open-closed principle?
    // Now, whenever we create a new strategy, all we have to do is create a new ChargingStrategy class that implements the interface ChargingStrategy without having to modify any existing code

    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        double modifier = chargingStrategy.costMultipler();
        
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    // ? Is there anything else we are missing
    public void changeStrategy(ChargingStrategy newStrategy) {
        chargingStrategy = newStrategy;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.changeStrategy(new HolidayStrategy());
        r.displayMenu();
    }

}