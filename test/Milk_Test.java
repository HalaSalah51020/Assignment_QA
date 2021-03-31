package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Milk_Test {
	
	//create an object R1
		private Recipe R1= new Recipe();
		
		
		@Test
		public void setAmtMilkTest(){
		System.out.println("Test Milk Started");
		
		 //Test for null input values
		try{
		R1.setName("R1");
		R1.setAmtMilk("");
		assertEquals(0,R1.getAmtMilk());
		}
		catch(RecipeException e){
		assertTrue(R1.getAmtMilk()<=0);
		}
		
		
		//Test for string literals as input
		try{
		R1.setAmtMilk("ten");
		assertNull(R1.getAmtMilk());
		}
		catch(RecipeException e){
		assertTrue(R1.getAmtMilk()<=0);
		}
		//Test for negative input values
		try{
		R1.setAmtMilk("-1");
		assertEquals(0,R1.getAmtMilk());
		}
		catch(RecipeException e){
		assertTrue(R1.getAmtMilk()<=0);
		}
		
		//Test for positive non-integer input values
		try{
		R1.setAmtMilk("3/4");
		assertEquals(0,R1.getAmtMilk());
		}
		catch(RecipeException e){
		assertTrue(R1.getAmtMilk()<=0);
		}
		
		//Test for positive integer input values
		try{
		R1.setAmtMilk("1");
		assertEquals(1,R1.getAmtMilk());
		assertTrue(R1.getAmtMilk()>0);
		}
		catch(RecipeException e){
		assertTrue(R1.getAmtMilk()<=0);
		}
		System.out.println("Test Milk Completed");
		}
}
