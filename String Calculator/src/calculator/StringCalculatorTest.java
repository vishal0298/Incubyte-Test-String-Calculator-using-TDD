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
	 @DisplayName("String With Single Number Should Return Number As Int")
	    void stringWithSingleNumberShouldReturnNumberAsInt() {
		    assertEquals(1, stringCalculator.add("1"));
	    }
	
	@Test
	 @DisplayName("String Should Handle Multiple Input")
	    void stringShouldhandleMultipleInput() {
		    assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
	    }
	
	@Test
	 @DisplayName("String Should Handle New Lines Between Numbers")
	   void stringShouldHandleNewLinesBetweenNumbersu(){
		   assertEquals(6,stringCalculator.add("1\n2,3"));
	}
	@Test
	 @DisplayName("String Should Support Different Delimiters")
	   void  tringShouldSupportDifferentDelimiters() {
		   assertEquals(3,stringCalculator.add("//;\\n1;2"));
	}
}
