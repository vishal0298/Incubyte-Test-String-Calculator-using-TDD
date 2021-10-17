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
	
}
