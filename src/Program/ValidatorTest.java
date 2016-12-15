package Program;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ValidatorTest {

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
		assertTrue(new Validator().Validate(testArray));
	}
        
        /*Test 2*/
        //Mock+Stub
        //intput the only one integer   
        //result: return true
        @Test
        public void ifArgumentsLengthAndArgumentTypesIsCorrect(){
            Validator mockValidator = mock(Validator.class);
            when(mockValidator.Validate(any(String[].class))).thenReturn(true);
            Assert.assertTrue(mockValidator.Validate(new String[0]));
   }

        
	/*Test 3*/
        //intput the null 
        //result: return false
	@Test
	public void testIsInteger2() {
		String[] testArray = {};
		assertFalse(new Validator().Validate(testArray));
	}
	
	/*Test 4*/
        //intput more than one integer 
        //result: return false
	@Test
	public void testIsInteger3() {
		String[] testArray = {"4", "2","3"};
		assertFalse(new Validator().Validate(testArray));
	}
	
	/*Test 5*/
        //intput the string  
        //result: return false
	@Test
	public void testIsInteger4() {
		String[] testArray = {"String"};
		assertFalse(new Validator().Validate(testArray));
	}
}