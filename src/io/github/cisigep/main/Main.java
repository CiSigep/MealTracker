package io.github.cisigep.main;

import io.github.cisigep.model.Food;
import io.github.cisigep.model.Meal;

public class Main {

	public static void main(String[] args) {
		Meal meal = new Meal("myMeal", new Food(201, 202, 203, 204, "Apple"), new Food(205, 206, 207, 208, "Orange"));

		System.out.println(meal.getCalories());
		System.out.println(meal.getFat());
		System.out.println(meal.getCarbohydrates());
		System.out.println(meal.getProtein());
		
	}

}
