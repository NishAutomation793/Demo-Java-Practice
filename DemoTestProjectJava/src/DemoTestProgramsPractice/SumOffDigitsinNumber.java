package DemoTestProgramsPractice;

public class SumOffDigitsinNumber {

	public static void main(String[] args) {

		int org_num=9853;
		int num=9853;
		int sum=0;
		int rev=0;
		
		while(num!=0)
		{
			rev=num%10;
			
			sum=sum+rev;
			
			num=num/10;
			
		}
		System.out.println("Sum of Digits of a Number "+org_num + " is ->"+sum);
		
	}

}
