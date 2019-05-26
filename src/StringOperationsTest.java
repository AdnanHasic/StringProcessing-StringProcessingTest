import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringOperationsTest {
	
	
StringOperations stringOperations1;
String text;
	
	@Before
	public void setUp() {
		
		stringOperations1 = new StringOperations();
		text = "Adnan Hasic";
	}
	
	@Test
	public void stringLengthCheckLettersOnlyTest_ShouldReturnLengthOfTheString_IfGivenTheString() {
		
		int result = stringOperations1.stringLengthCheckLettersOnly(text);
		
		assertEquals(10, result);
	}
	
	@Test
	public void charactersAtEvenPositionsTest_ShouldReturnCharactersAtEvenPositions_IfGivenTheString() {
		 
		 String expected = "AnnHsc";
		 
		
      assertEquals(expected, stringOperations1.charactersAtEvenPositions(text));
	}
	
	@Test
	public void charactesAtOddPositionsTest_ShouldReturnCharactersAtoddPositions_IfGivenTheString() {
		
		String expected = "daai";
		
		assertEquals(expected, stringOperations1.charactersAtOddPositions(text));
	}
	
	@Test
	public void numberOfUppercaseTest_ShouldReturnNumberOfUppercase_IfGivenTheString() {
		
		int expected = 2;
		
		assertEquals(expected, stringOperations1.numberOfUppercase(text));
	}
	
	
}
