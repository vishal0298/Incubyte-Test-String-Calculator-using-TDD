package calculator;

public class StringCalculator {
	
	public int add(String numbers) throws CalculatorException  {
		int sum =0;
		String s;
		if (numbers.length() == 0) {
			return 0;
		}
		try {
			for (int i = 0; i < numbers.length() - 1; i++) {
				if (numbers.charAt(i) == '-' && Character.isDigit(numbers.charAt(i + 1))) {
					throw new CalculatorException(numbers);
				}
			}
		} 
		catch (CalculatorException e) {}
		
		
		for (int i = 0; i < numbers.length(); i++) {
			if (!Character.isDigit(numbers.charAt(i)) ) {
				continue;
			}
			else {
				sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
			}
		}
		return sum;
    }
}


