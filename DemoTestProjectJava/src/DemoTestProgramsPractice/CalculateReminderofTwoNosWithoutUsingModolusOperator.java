package DemoTestProgramsPractice;

public class CalculateReminderofTwoNosWithoutUsingModolusOperator {

	public static void main(String[] args) {

		int num1 = 27;
		int temp1=num1;
		int num2 = 4;
		int temp2=num2;

		int rem = 0;

		while (temp1 > temp2) {

			rem = temp1 - temp2;
			temp1 = rem;

		}
		System.out.println("Reminder of two numbers " + num1 + " and " + num2 + " is: " + rem);
	}

}
