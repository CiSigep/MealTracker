package io.github.cisigep.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.cisigep.enums.Categories;
import io.github.cisigep.model.Food;

class TestFood {
	
	private Food food;

	@BeforeEach
	void setUp() throws Exception {
		food = new Food(1,2,3,4, "Apple");
		food.addCategory(Categories.FRUIT);
	}

	@Test
	void testToString() {
		assertEquals("--\nName: Apple\nCalories: 1.00\nFat: 2.00\nCarbohydrates: 3.00\nProtein: 4.00\nCategories: [FRUIT]", food.toString());
	}

}
