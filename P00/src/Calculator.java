public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Cannot divide by 0");
		}
	}
	
	public int exponential(int a, int b) {
		int result = a;
		for (int i = 1; i < b; i++) {
			result *= a;
		}
		return result;
	}
}
