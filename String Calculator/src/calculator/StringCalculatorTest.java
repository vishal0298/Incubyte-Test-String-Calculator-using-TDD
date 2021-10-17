package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class StringCalculatorTest {
	StringCalculator stringCalculator = new StringCalculator();
	
	@Test
	 @DisplayName("Empty String Should Return 0")
	    void emptyStringShouldReturn0() {
	        assertEquals(0, stringCalculator.add(""));
	    }
	
	@Test
	 @DisplayName("string With Single Number Should Return Number As Int")
	    void stringWithSingleNumberShouldReturnNumberAsInt() {
		assertEquals(1, stringCalculator.add("1"));
	    }
}
