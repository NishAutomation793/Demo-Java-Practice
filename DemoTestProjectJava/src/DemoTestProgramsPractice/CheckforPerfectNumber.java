package DemoTestProgramsPractice;

public class CheckforPerfectNumber {

	public static void main(String[] args) {

		int num=15;
		int sum=0;
		
		System.out.println("Divisors of "+num + " are: ");
		for(int i=1;i<num; i++)
		{
			
			if(num%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			
				
			}
	
		}
		
		System.out.println("Sum of all the divisiors of "+num + " is " +sum);
	}

}
