package Practicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Food {
    private int foodId;
    private String foodName;
    private String type;
    private double price;
    private int rating;

    public Food(int foodId, String foodName, String type, double price, int rating) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Food ID: " + foodId + ", Food Name: " + foodName + ", Type: " + type + ", Price: " + price + ", Rating: " + rating;
    }
}

public class FoodMain {

	public static void main(String[] args) {
		
		 ArrayList<Food> foodList = new ArrayList<>();

	      
	        foodList.add(new Food(1, "Pizza", "Non-Veg", 12.99, 4));
	        foodList.add(new Food(2, "Pasta", "Veg", 9.99, 3));
	        foodList.add(new Food(3, "Burger", "Non-Veg", 8.49, 4));
	        foodList.add(new Food(4, "Salad", "Veg", 5.99, 5));
	        foodList.add(new Food(5, "Steak", "Non-Veg", 15.99, 4));

	       
	        Collections.sort(foodList, Comparator.comparingDouble(Food::getPrice));

	    
	        System.out.println("Food items sorted by price in ascending order:");
	        for (Food food : foodList) {
	            System.out.println(food);
	        }
	}

}
