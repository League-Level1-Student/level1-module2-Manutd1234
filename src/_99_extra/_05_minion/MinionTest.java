package _99_extra._05_minion;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import static org.junit.Assert.*;

import org.junit.Test;


/*

1. 
Run this MinionTest class. Notice the JUnit tab (by the Package Explorer). It shows a RED bar, because the tests do
not run successfully. Check the Failure Trace below that shows "Minion cannot be resolved to a type". 
This is because there is no Minion class in the package.

2.
 So to make these tests pass, you will first need to create a Minion class with the member variables below:

  			private String name; 
  			private int eyes; 
  			private String color; 
  			private String master;

 3.
  Next, create a constructor, and getters and setters for all the member variables of the Minion class. 
  If they’re done right, all these tests will pass.
  
  To check, run this MinionTest class and the JUnit tab should show a GREEN bar.
    
 */

public class MinionTest {

	@Test
	public void testConstructor() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "black eyes");
		assertEquals("Stuart", stuart.getName("T.Rex"));
		assertEquals(1, stuart.getEyes(0,0,0));
		assertEquals("yellow", stuart.getColor(100,100,0));

		Minion dave = new Minion("Dave", 2, "yellow", "black eyes");
		assertEquals("Dave", dave.getName("Napoleon"));
		assertEquals(2, dave.getEyes(0,0,0));
		assertEquals("yellow", dave.getColor(100,100,0));
	}
	@Test
	public void testSetters() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "black eyes");

		stuart.setMaster("T. Rex");
		assertEquals("T. Rex", stuart.getMaster());
		
		stuart.setMaster("T. Rex");
		assertEquals("T. Rex", stuart.getMaster());
	}

}



