import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test case to verify the output of negation 
 * @author Sujeeth Pakala
 *
 */
public class NegationTest {
	
	private Negation negation = new Negation();
	
	@Test
	public void testNullNegation() {
		assertTrue(negation.negate(0) == 1);
	}
	
	@Test
	public void testNotNullNegation() {
		assertTrue(negation.negate(1) == 0);
		
	}
	
}
