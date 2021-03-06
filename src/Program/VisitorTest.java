package Program;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VisitorTest {
	private Visitor visitor = new Visitor();

	 // Double + Stub
	 // Mock the random generator
	 // Set the random number to be 1
	 // Five visitors should be the same 
	@Test
	public void testNextVisitor0() {
		
		Getrandom mockGenerator = Mockito.mock(Getrandom.class);
		Mockito.when(mockGenerator.generator()).thenReturn(1);
		
		Visitor visitor = new Visitor();
		String visitorList[] = new String[5];
		
		for(int i=0; i<5; i++) {
			visitorList[i] = visitor.nextVisitor(mockGenerator);
		}
		
		boolean areEqual = true;
		for(int i=0; i<5; i++) {
			if(visitorList[i] != visitorList[0]) areEqual = false;
		}
		assertTrue(areEqual);
	}
        
        

	 // Using real random and visitor class
	 // five integers should be generated
	 // Generated Visitors should not be same 

	@Test
	public void testNextVisitor1() {
		Getrandom generator = new Getrandom(9, 4);
		Visitor visitor = new Visitor();
		String visitorList[] = new String[5];
		for(int i=0; i<5; i++) {
			visitorList[i] = visitor.nextVisitor(generator);
		}
		
		boolean areEqual = true;
		for(int i=0; i<5; i++) {
			if(visitorList[i] != visitorList[0]) areEqual = false;
		}
		
		assertFalse(areEqual);
	}
	
	
	 //Double + Stub 
         //Every element has unique index in visitors list
	 // Mock the visitors generator
	 // Set the random array to be {3, 2, 1, 3, 0}
	 // fiveVisiting should return a string array
	 
	@Test
	public void testFiveVisiting1() {
            
		Getrandom mockGenerator = Mockito.mock(Getrandom.class);
		int[] indexArr = {3, 2, 1, 3, 0};
		Mockito.when(mockGenerator.generateVisitor()).thenReturn(indexArr);
		
		String[] arr = {"Blogger", "Business Person", "Professor", "Blogger", "Student"};
		assertArrayEquals(arr, visitor.visitor(mockGenerator));
		
	}
	
        
        
        
        //Business Person should like 2 - Squirrel Hill
	//Given the visitor to be Business Person
	//Given the location to be 2
	//The likeLocation function should return true
        @Test
	public void testLikeLocation0() {
		
		String visitor = "Business Person";
		String location = "Squirrel Hill";
		
		assertTrue(Visitor.likeLocation(visitor, location));
	}
	
	//Student shouldn't like 1 - The Cathedral of Learning
	//Given the visitor to be Student
	//Given the location to be 1
	//The likeLocation function should return false
	@Test
	public void testLikeLocation1() {
		
		String visitor = "Student";
		String location = "The Cathedral of Learning";
		
		assertFalse(Visitor.likeLocation(visitor, location));
	}

}