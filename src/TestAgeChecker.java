import static org.junit.Assert.*; 
import org.junit.Test; 


public class TestAgeChecker {
	
	AgeChecker tester = new AgeChecker();
	
	@Test
	public void testVerifyAgeRestrictionTrue() {
		boolean result = tester.verifyLegalAge(1990);
		assertTrue(result);
	}
	
	@Test
	public void testVerifyAgeRestrictionFalse() {
		boolean result = tester.verifyLegalAge(2010);
		assertFalse(result); 
	}
	
	@Test
	public void testConcatenateNames() {
		String result = tester.concatenateNames("Ian",  "Daly"); 
		assertEquals(result, "Ian Daly"); 
	}
}
