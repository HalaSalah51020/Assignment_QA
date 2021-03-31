package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Sugar_Test {
	
	//create an object R1
	private Recipe R1= new Recipe();
	
	
	@Test
	public void setAmtSugarTest(){
	System.out.println("Test Sugar Started");
	
	//Test for null input values
	try{ 
	R1.setName("R1");
	R1.setAmtSugar("");
	assertEquals(0,R1.getAmtSugar());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtSugar()<=0);
	}
	
	
	
	//Test for string literals as input
	try{
	R1.setAmtSugar("ten");
	assertNull(R1.getAmtSugar());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtSugar()<=0);
	}
	
	//Test for negative input values
	try{
	R1.setAmtSugar("-1");
	assertEquals(0,R1.getAmtSugar());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtSugar()<=0);
	}
	
	
	
	//Test for positive non-integer input values
	try{
	R1.setAmtSugar("3/4");
	assertEquals(0,R1.getAmtSugar());
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtSugar()<=0);
	}
	
	
	//Test for positive integer input values
	try{
	R1.setAmtSugar("1");
	assertEquals(1,R1.getAmtSugar());
	assertTrue(R1.getAmtSugar()>0);
	}
	catch(RecipeException e){
	assertTrue(R1.getAmtSugar()<=0);
	}
	System.out.println("Test Sugar Completed");
	}

}
