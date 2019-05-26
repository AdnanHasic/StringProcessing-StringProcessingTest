import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringOperationsTest {
	
	
StringOperations stringOperations1;
	
	@Before
	public void setUp() {
		
		stringOperations1 = new StringOperations();
	}
	@Test
	public void stringLengthCheckLettersOnlyTest_ShouldReturnLengthOfTheString_IfGivenTheString() {
		
		String text = "Adnan Hasic";
		int result = stringOperations1.stringLengthCheckLettersOnly(text);
		
		assertEquals(10, result);
	}

	
}
