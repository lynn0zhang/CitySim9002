package Program;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CitySimTest {

	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}
	
	
        
        /*Test 1*/
        //intput the only one integer   
        //result: return true
	@Test
	public void testIsInteger1() {
		String[] testArray = {"3"};
		assertTrue(CitySim9002.isInteger(testArray));
	}

	/*Test 2*/
        //intput the null 
        //result: return false
	@Test
	public void testIsInteger2() {
		String[] testArray = {};
		assertFalse(CitySim9002.isInteger(testArray));
	}
	
	/*Test 3*/
        //intput more than one integer 
        //result: return false
	@Test
	public void testIsInteger3() {
		String[] testArray = {"4", "2","3"};
		assertFalse(CitySim9002.isInteger(testArray));
	}
	
	/*Test 4*/
        //intput the string  
        //result: return false
	@Test
	public void testIsInteger4() {
		String[] testArray = {"String"};
		assertFalse(CitySim9002.isInteger(testArray));
	}
}