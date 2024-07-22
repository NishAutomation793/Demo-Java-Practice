package DemoTestProgramsPractice;

public class ProgramFactorsofNumberAndCount {
	public static void main(String[] args) {
		
		
		
		int num=60;
		int count=0;
		
		System.out.println("Factors of Given number" +num+ " are :");
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				count++;
				
			}
			
			
		}
		
		System.out.println("Total Factors of Number "+num + " are: "+count);
		
	}

}
