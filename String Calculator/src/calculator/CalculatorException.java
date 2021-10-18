package calculator;

public class CalculatorException extends RuntimeException {
	public CalculatorException(String s) {
		System.err.print("Negatives Not Allowed ");
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '-' && Character.isDigit(s.charAt(i + 1))) {
				System.out.print(s.charAt(i) + "" + s.charAt(i + 1));
			}
		}
	}
}
