package DemoTestProgramsPractice;

public class PrintAllPrimeNumberInRange {

	static int count=0;
	
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if(i==1)
			{
				continue;
			}
			for (int j = 2; j <= i - 1; j++) {
				
				if(i%j==0)
				{
					count++;
					break;
					
				}

			}
			
			if(count==0)
			{
				
				System.out.println(i);
			}
			else
			{
				count=0;
			}

		}

	}

}
