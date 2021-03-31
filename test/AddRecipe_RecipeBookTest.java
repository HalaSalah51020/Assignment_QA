package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;

public class AddRecipe_RecipeBookTest {

	@Test
	public void testAddRecipe() {
		System.out.println("Test Add Recipe Started");

		RecipeBook objRecipeBook = new RecipeBook();
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName("recipe");
			
		assertTrue(objRecipeBook.addRecipe(objRecipe));
		
		}
	
	@Test
	public void testAddRecipe1() {

		RecipeBook objRecipeBook = new RecipeBook();
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName("recipe");
		
		Recipe objRecipe2 = new Recipe();
		objRecipe2.setName("recipe");
		
		objRecipeBook.addRecipe(objRecipe);
		
		assertFalse(objRecipeBook.addRecipe(objRecipe2));
		System.out.println("Test Add Recipe Completed");

		}
}
