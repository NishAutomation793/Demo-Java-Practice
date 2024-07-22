package DemoTestProgramsPractice;

public class FindGreatestCommonDivisorOfGivenNum {

	public static void main(String[] args) {

		int num1 = 13;
		int num2 = 15;
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= num1; i++) 
		{
			if (num1 % i == 0 && num2 % i == 0) 
			{
				if (max < i) 
				{
					max = i;
				}

			}

		}

		System.out.println("GCD is: " + max);

	}

}
