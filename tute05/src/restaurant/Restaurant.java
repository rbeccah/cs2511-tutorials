package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.StandardStrategy;

// * Context class
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
    // * Open-Closed principle: a class should be closed for modification but open for extension 
    // Here we need to add a new switch statement everytime we want to add a new charging strategy

    // ? Why does the new implementation not violate the open-closed principle? 
    // Adding a new strategy does not involve modifying any of the existing classes
    // Instead, we just had to create a new class
    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        double modifier = chargingStrategy.costMultiplier();
        
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public void changeStrategy(ChargingStrategy newStrategy) {
        this.chargingStrategy = newStrategy;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
    }

}