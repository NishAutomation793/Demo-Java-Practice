package DemoTestProgramsPractice;

public class PalindromeNumberProgram {

	public static void main(String[] args) {
		
		int num=12121;
		int temp=num;
		int rem=0;
		int rev=0;
		
		while(num!=0)
		{
			rem=num%10; //12
			rev=rev*10+rem; //0*10+1=1,1*10+2 =12,12121
			num=num/10; //1212 //121 //1
			
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			
			System.out.println("Number is an palindrome ");
		}
		else
		{
			System.out.println("Number is not a Palindrome Number");
		}
		

	}

}
