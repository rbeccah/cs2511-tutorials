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
    // Here, we need to add a new switch statement everytime we want to add a new charging strategy

    // ? Why does the new implementation not violate the open-closed principle? 
    // Adding a new strategy does not involve modiyfing any of the existing classes
    // Instead, we just add a new class that implements ChargingStrategy
    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        double modifier = chargingStrategy.displayMenu();
        
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public void setStrategy(ChargingStrategy strategy) {
        this.chargingStrategy = strategy;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
        System.out.println();

        r.setStrategy(new HolidayStrategy());
        r.displayMenu();
    }

}