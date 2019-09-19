package io.github.cisigep.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meal {
	String name;
	List<Food> foods;
	LocalDateTime mealTime;
	
	public Meal(String name, LocalDateTime mealTime, Food... foods) {
		this.name = name;
		this.mealTime = mealTime;
		this.foods = new ArrayList<Food>(Arrays.asList(foods));
	}
	
	public Meal(String name, Food... foods) {
		this(name, LocalDateTime.now(), foods);
	}

	public double getCalories() {
		double calories = 0.0;

		for (Food food : foods)
			calories += food.getCalories();

		return calories;
	}

	public double getFat() {
		double fat = 0.0;

		for (Food food : foods)
			fat += food.getFat();

		return fat;
	}

	public double getCarbohydrates() {
		double carbohydrates = 0.0;

		for (Food food : foods)
			carbohydrates += food.getCarbohydrates();

		return carbohydrates;
	}

	public double getProtein() {
		double protein = 0.0;

		for (Food food : foods)
			protein += food.getProtein();

		return protein;
	}
	
	public LocalDateTime getMealTime() {
		return mealTime;
	}
	
	public void viewFoods() {
		for(Food food : foods)
			System.out.println(food);
	}
}
