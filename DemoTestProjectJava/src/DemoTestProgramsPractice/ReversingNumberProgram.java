package DemoTestProgramsPractice;

public class ReversingNumberProgram {

	public static void main(String[] args) {

		int num=19;
		int rem;
		System.out.println("Actual Number is: "+num);
		
		int rev=0;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			
			num=num/10;
			
		}
		
	System.out.println("Reverse of the Number is: " +rev);
	

	
	
////Second Way : We can reverse a number using StringBuffer class as well
	
	int num1=9876;
	
	String num2=String.valueOf(num1);
	
	StringBuffer buff=new StringBuffer(num2);
	System.out.println("Reversal of the Number using String buffere is: "+buff.reverse());

	
		
	}

}
