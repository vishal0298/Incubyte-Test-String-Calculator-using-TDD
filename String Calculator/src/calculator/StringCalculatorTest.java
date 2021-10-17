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
	
	@Test
	 @DisplayName("string Should Handle Multiple Input")
	    void stringShouldhandleMultipleInput() {
		assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
	    }
}
