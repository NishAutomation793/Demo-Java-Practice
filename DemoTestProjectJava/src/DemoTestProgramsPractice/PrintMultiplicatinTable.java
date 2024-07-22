package DemoTestProgramsPractice;

public class PrintMultiplicatinTable {

	public static void main(String[] args) {
		
		int num=19;
		
		int result=0;
	
	System.out.println("Table of "+num + " is :");	
		for(int i=1; i<=10; i++)
		{
			
			result=num*i;
			System.out.println(+num + " * " +i +" ="+result);
		}
		
	}
	
	
}
