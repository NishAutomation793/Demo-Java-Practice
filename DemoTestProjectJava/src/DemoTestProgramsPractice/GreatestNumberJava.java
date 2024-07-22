package DemoTestProgramsPractice;

public class GreatestNumberJava {

	int max=0;
	public static void main(String[] args) {

		greatestNo(24,18,10);
		
	}
	
	
		public static void greatestNo(int a, int b, int c)
		{
			if(a>b && a>c)
			{
				System.out.println("Maximum Number is : "+a);
			}
			else if(b>c)
			{
				System.out.println("Maximum Number is:" +b);
				
			}
			else
			{
				System.out.println("Maximum No is: "+c);
			}
		
		}


}
