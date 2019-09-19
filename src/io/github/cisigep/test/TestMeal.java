package io.github.cisigep.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.cisigep.model.Food;
import io.github.cisigep.model.Meal;

class TestMeal {

	private Meal meal;
	
	@BeforeEach
	void setUp() {
		meal = new Meal("myMeal", new Food(201, 202, 203, 204, "Apple"), new Food(205, 206, 207, 208, "Orange"));
	}
	
	@Test
	void testGetProperties() {
		assertEquals(406.0, meal.getCalories());
		assertEquals(408.0, meal.getFat());
		assertEquals(410.0, meal.getCarbohydrates());
		assertEquals(412.0, meal.getProtein());
	}

}
