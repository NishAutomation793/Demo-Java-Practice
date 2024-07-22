package DemoTestProgramsPractice;

public class CheckGivenNumberPowerofSomething {

	public static void main(String[] args) {
		
		int num=65;
		int power=4;
		
		int rem=0;
	
		int temp=num;
		int count=0;
		while(num>0)
		{
			rem=num%power;
			
		if(rem!=0)
		{
			break;
		}
			num=num/power;
			count++;
		}
		
		if(num==1)
		{
			
			System.out.println("Power Of "+temp +" is "+count);
		}
		else
		{
			
			System.out.println("Number is not completely divisable");
		}
		
	}
	
}
