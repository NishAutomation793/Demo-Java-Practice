package DemoTestProgramsPractice;

public class CalculatorProgram {

	public static void main(String[] args) {

		int a = 9;
		int b = 10;
		int c = 0;
		String func = "Addition";

		switch (func) {
		case "Addition":

			c = a + b;
			System.out.println("Sum of the Nos is : "+c);

			break;

		case "Substraction":
			c = a - b;
			System.out.println("Sub of the Nos is : "+c);

			break;
		case "Multiply":

			c = a * b;
			System.out.println("Multiply of the Nos is : "+c);

			break;
		case "Divide":

			c = a / b;
			System.out.println("Divide of the Nos is : "+c);

			break;

		default:
			System.out.println("Imvalid Function");
			break;
		}

	}

}
