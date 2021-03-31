package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class Name_Test {
	//create an object R1
	private Recipe R1= new Recipe();

	@Test
	public void setNameTest(){
	System.out.println("Test Name Started");
	
	
	//Test for Empty String Inputs
	R1.setName("");
	assertNotNull(R1.getName());
	assertEquals("",R1.getName());
	
	
	
	//Test for null input values
	R1.setName(null);
	assertNotNull(R1.getName());
	assertEquals("",R1.getName());
	
	
	//Test for valid string input values
	R1.setName("Regular@1*");
	assertNotNull(R1.getName());
	assertEquals("Regular@1*",R1.getName());
	System.out.println("Test Name Completed");
	}
	
	
}
