package Program;

import Program.Getrandom;
import static org.junit.Assert.*;
import org.junit.Test;

public class GetrandomTest {
	private Getrandom generator = new Getrandom(9, 5);
        
        //ensure the numer between 0 and 5
	@Test
	public void testgenerator() {
		assertTrue(generator.generator()>=0 && generator.generator()<5);
	}
	
	 // 5 index for visitors should be different
	 // Return the method to produce an int array
	 // Elements in the array should be different
	@Test
	public void testgenerateVisitor() {
		int[] tested = generator.generateVisitor();
		boolean allEqual = true;
		for(int i=0; i<5; i++) {
			if(tested[i] != tested[0]) allEqual = false;
		}
		assertFalse(allEqual);
	}

}