package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Equal_test {
	@Test
	public void equalsTest(){
		System.out.println("Test Equals Started");
		//Compare different objects of the same kind
		Recipe R1 = new Recipe();
		Recipe R2 = new Recipe();
		
		
		assertEquals(R1, R2); //Since both will be instances will have the same name.
		R1.setName("B1");
		assertNotEquals(R1, R2); //Now one of the objects has a default constructor specified name.
		
		
		
		try{
		R2.setName(null); //check for when one object name is null while thother is a valid string.
		R2.setPrice("3");
		assertNotEquals(R1, R2);
		}
		catch(RecipeException e){
		assertTrue(R2.getPrice()<0);
		assertNull(R2.getName());
		}
		System.out.println("Test Equals Completed");
		}

}
