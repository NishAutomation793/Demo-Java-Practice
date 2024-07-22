package DemoTestProgramsPractice;

public class FactorialRecurrsion {

	static int fact = 1;

	public static void main(String[] args) {
		int factorial = recurrsion(6);
		System.out.println("Factorial of the number is: " + factorial);

	}

	public static int recurrsion(int num) {

		if (num >= 1) {

			fact = fact * num;
			recurrsion(num - 1);

		}

		return fact;

	}
}
