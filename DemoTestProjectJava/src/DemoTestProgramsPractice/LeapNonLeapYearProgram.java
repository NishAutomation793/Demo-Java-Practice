package DemoTestProgramsPractice;

public class LeapNonLeapYearProgram {

public static void main(String[] args) {

	int a=2000;
	
	if(a%4==0)
	{
		if(a%100==0)
		{
			System.out.println("Year is the Leap and Century year Both");
			
		}
		else
		{
			
			System.out.println("Not a Century Year but still the Leap Year");
		}
		
	}
	
	else
	{
		
		System.out.println(+a+ " Is Not a Leap year");
		
	}
	
}
}
