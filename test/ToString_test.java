package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class ToString_test {
	//create an object R1
	private Recipe R1= new Recipe();

	@Test
	public void toStringTest(){
	System.out.println("Test ToString Started");
	
	
	//Test for valid string input
	R1.setName("Regular000@1*");
	assertEquals("Regular000@1*",R1.toString());
	
	
	//Test for empty strings
	R1.setName("");
	assertEquals("",R1.toString());
	
	
	//Test for null input values
	R1.setName(null);
	assertEquals("",R1.getName());
	System.out.println("Test ToString Completed");
	}
	


}
