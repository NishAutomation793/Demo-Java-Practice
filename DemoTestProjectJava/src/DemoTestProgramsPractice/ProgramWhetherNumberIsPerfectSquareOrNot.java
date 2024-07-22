package DemoTestProgramsPractice;

public class ProgramWhetherNumberIsPerfectSquareOrNot {
	public static void main(String[] args) {

		int num = 65;
int count=0;

	for(int i=1; i<=num/2; i++)
	{
		
		if(i*i==num)
		{
			count++;
			System.out.println("Number is Perfect Square of "+i+ " Number");
		    break;
		
		}
	
		
	}
	
	if(count==0)
	{
		System.out.println("Number is not Perfect Square");
		
	}
	
	
	
	}

}
