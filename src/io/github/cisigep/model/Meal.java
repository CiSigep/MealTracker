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
		return getSumOf("calories", foods);
	}

	public double getFat() {
		return getSumOf("fat", foods);
	}

	public double getCarbohydrates() {
		return getSumOf("carbohydrates", foods);
	}

	public double getProtein() {
		return getSumOf("protein", foods);
	}
	
	private double getSumOf(String property, List<Food> foods) {
		double sum = 0.0;
		Class<?> cls = foods.get(0).getClass();
		
		String methodName = "get" + property.substring(0,1).toUpperCase() + property.substring(1);
		
		try {
			Method mtd = cls.getDeclaredMethod(methodName);
			
			for(Food food : foods)
				sum += (Double) mtd.invoke(food);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Exception in trying to read " + property + ": " + e.getMessage());
		}
		
		return sum;
	}
	
	public LocalDateTime getMealTime() {
		return mealTime;
	}
	
	public void viewFoods() {
		for(Food food : foods)
			System.out.println(food);
	}
}
