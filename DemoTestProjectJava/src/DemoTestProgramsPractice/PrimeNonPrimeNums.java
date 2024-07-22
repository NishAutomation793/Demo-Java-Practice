package DemoTestProgramsPractice;

public class PrimeNonPrimeNums {
/**
 * Prime Numers are those which are divided by self and 1 only.
 * @param args
 */
	public static void main(String[] args) {

		
		int num =2;
int count =0;
		if (num > 0 &&num>1 &&num!=2) {

			for(int i=2; i<num-1; i++)
			{
				if(num%i==0)
				{
					count++;
					break;
					
				}
				
			}
			
			if(count>0)
			{
				System.out.println("Number is Not Prime");
				
			}
			else
			{
				
				System.out.println("Number is Prime Number");
			}
			
	
		}
		else if(num==2)
		{
			System.out.println(+num +" is smallest prime number");
		}
		else if(num==1)
		{
			System.out.println(+num +" is not a Prime Number");
		}
		
		else if (num<0)
		{
		
		System.out.println("Kindly enter positive number");
		}
		}
		}

