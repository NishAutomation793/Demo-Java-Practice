package DemoTestProgramsPractice;

public class ArmstrongNumberProgram {

	public static void main(String[] args) {

		int num=153;
		int temp1,temp2=0;
		temp1=num;
		temp2=num;
		
		int rem=0;
		int length =0;
		
		int sum=0;
		
	 while(temp1!=0)
	 {
		 
		 temp1=temp1/10;
		 
		 length=length+1;
		 
	 }

	System.out.println("Total length of number is: "+length);	
	 
	 
	while(temp2!=0)
	{
		int rev=1;
		rem=temp2%10;
		for(int i=1; i<=length; i++)
		{
			rev=rem*rev;
			
		}
		sum=sum+rev;
		temp2=temp2/10;
	}
	if(num==sum)
	{
	
	System.out.println("The number is armstrong number");
	
	}
	else
	{
		
		System.out.println("The Number is not armstrong number");
	}
	
		
	}

}
