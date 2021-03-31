package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Coffee_Test {
	
	//create an object R1
	private Recipe R1= new Recipe();
		
		
	@Test
	public void setAmtCoffeeTest(){
	System.out.println("Test Coffee Started");
	
	
	//Test for null input values
	try{
	R1.setName("R1");
	R1.setAmtCoffee("");
	assertEquals(0,R1.getAmtCoffee());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtCoffee()<=0);
	}
	
	
	//Test for string literals as input
	try{
	R1.setAmtCoffee("ten");
	assertNull(R1.getAmtCoffee());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtCoffee()<=0);
	}
	
	//Test for negative input values

	try{
	R1.setAmtCoffee("-1");
	assertEquals(0,R1.getAmtCoffee());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtCoffee()<=0);
	}
	
	//Test for positive non-integer input values
	try{
	R1.setAmtCoffee("3/4");
	assertEquals(0,R1.getAmtCoffee());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtCoffee()<=0);
	}
	
	//Test for positive integer input values
	try{
	R1.setAmtCoffee("1");
	assertEquals(1,R1.getAmtCoffee());
	assertTrue(R1.getAmtCoffee()>0);
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtCoffee()<=0);
	}
	System.out.println("Test Coffee Completed");
	}
}
