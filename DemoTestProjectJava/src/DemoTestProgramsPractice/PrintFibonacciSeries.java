package DemoTestProgramsPractice;

public class PrintFibonacciSeries {

	public static void main(String[] args) {

		int sum = 0;
		int a = 0;
		int b = 1;
		System.out.println("Fibonacci Series is sum of previous two numbers: ");

		for (int i = 1; i <= 10; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;

		}

	}

}
