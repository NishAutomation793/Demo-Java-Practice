package DemoTestProgramsPractice;

public class FibonacciSeriesUsingRecurrision {

	static int a=0; static int b=1;
	static int sum=0;
	
	public static void main(String[] args) {

		System.out.print(+a+" " +b);
		fibonacci(10);
		
		
	}
		public static void fibonacci(int n)
		{
			if(n>=1)
			{
				sum=a+b;
				
			System.out.print(" "+sum);
				a=b;
				b=sum;
				fibonacci(n-1);

					
			}
			
			
		}
		
	}

