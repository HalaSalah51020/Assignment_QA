package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Price_Test {
	
	//create an object R1
	private Recipe R1= new Recipe();
	@Test
	public void setPriceTest() throws RecipeException{
	System.out.println("Test Price Started");
	
	 //Test for null input values
	try{
	R1.setName("R1");
	R1.setPrice("");
	assertEquals(0,R1.getPrice());
	}
	catch(RecipeException e){
	assertTrue(R1.getPrice()<=0);
	}
	
	
	
	//Test for string literals as input
	try{
	R1.setPrice("ten");
	assertNull(R1.getPrice());
	}
	catch(RecipeException e){
	assertTrue(R1.getPrice()<=0);
	}
	
	
	//Test for negative input values
	try{
	R1.setPrice("-1");
	assertEquals(0,R1.getPrice());
	}
	catch(RecipeException e){
	assertTrue(R1.getPrice()<=0);
	}
	
	
	//Test for positive non-integer input values

	try{
	R1.setPrice("3/4");
	assertEquals(0,R1.getPrice());
	}
	catch(RecipeException e){
	assertTrue(R1.getPrice()<=0);
	}
	
	//Test for positive integer input values
	try{
	R1.setPrice("1.5");
	assertEquals(1,R1.getPrice());
	assertTrue(R1.getPrice()>0);
	}
	catch(RecipeException e){
	assertTrue(R1.getPrice()<=0);
	}
	System.out.println("Test Price Completed");
	}
	

}
