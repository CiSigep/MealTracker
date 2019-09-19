package io.github.cisigep.model;

import java.lang.reflect.Method;
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
		return foods.stream().mapToDouble(food -> food.getCalories()).sum();
	}

	public double getFat() {
		return foods.stream().mapToDouble(food -> food.getFat()).sum();
	}

	public double getCarbohydrates() {
		return foods.stream().mapToDouble(food -> food.getCarbohydrates()).sum();
	}

	public double getProtein() {
		return foods.stream().mapToDouble(food -> food.getProtein()).sum();
	}
	
	public LocalDateTime getMealTime() {
		return mealTime;
	}
	
	public void viewFoods() {
		for(Food food : foods)
			System.out.println(food);
	}
}
