package io.github.cisigep.model;

import java.util.ArrayList;
import java.util.List;

import io.github.cisigep.enums.Categories;

public class Food {
	private double calories;
	private double fat;
	private double carbohydrates;
	private double protein;
	private String name;
	private List<Categories> categories;
	
	public Food(double calories, double fat, double carbohydrates, double protein, String name) {
		super();
		this.calories = calories;
		this.fat = fat;
		this.carbohydrates = carbohydrates;
		this.protein = protein;
		this.name = name;
		this.categories = new ArrayList<Categories>();
	}

	public double getCalories() {
		return calories;
	}

	public double getFat() {
		return fat;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public double getProtein() {
		return protein;
	}

	public String getName() {
		return name;
	}

	public List<Categories> getCategories() {
		return categories;
	}
	
	public void addCategory(Categories category) {
		categories.add(category);
	}
	
	@Override
	public String toString() {
		return String.format("--\nName: %s\nCalories: %.2f\nFat: %.2f\nCarbohydrates: %.2f\nProtein: %.2f\nCategories: %s",
				name, calories, fat, carbohydrates, protein, categories.toString());
	}
	
}
