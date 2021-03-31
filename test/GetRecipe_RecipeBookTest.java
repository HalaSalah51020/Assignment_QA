package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.RecipeBook;

public class GetRecipe_RecipeBookTest {

	@Test
	public void testGetRecipes() {
		System.out.println("Test Get Recipe Started");

		
		RecipeBook objrecipeBook = new RecipeBook();
		
		assertNotNull(objrecipeBook.getRecipes());
		System.out.println("Test Get Recipe Completed");

	}


}
