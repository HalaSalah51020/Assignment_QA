package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;

public class EditRecipe_RecipeBookTest {

	@Test
	public void testEditRecipe() {
		System.out.println("Test Edit Recipe Started");

		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		int recipeToEdit = 0;
		
		objRecipe.setName("recipe");
		objRecipeBook.addRecipe(objRecipe);
		
		String expected = "recipe";
		String actual = objRecipeBook.editRecipe(recipeToEdit, objRecipe);
		
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testEditRecope1() {
		
		RecipeBook objrRecipeBook = new RecipeBook();
		
		int recipeToEdit = 0;
		
		Recipe newRecipe = new Recipe();
		
		assertNull(objrRecipeBook.editRecipe(recipeToEdit, newRecipe));
		System.out.println("Test Edite Recipe Completed");

	}

}
