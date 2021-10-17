package calculator;

public class StringCalculator {
	
	public int add(String numbers)  {
		if (numbers.length() == 0) {
			return 0;
		}
		int sum = 0;
		String s;
		for (int i = 0; i < numbers.length(); i++) {
			if (!Character.isDigit(numbers.charAt(i))) {
				continue;
			}
			else {
				sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
			}
		}
		return sum;
    }
}


