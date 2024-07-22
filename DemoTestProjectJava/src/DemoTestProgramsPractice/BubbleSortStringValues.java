package DemoTestProgramsPractice;

public class BubbleSortStringValues {

	public static void main(String[] args) {

	
	String str[]= {"Deepak","Nishant", "Mahesh", "Nishant", "Raja", "Akshay"};
	
	String temp;
	
	for(int i=0; i<str.length; i++)
	{
		
		for(int j=0; j<str.length-1; j++)
		{
			if(str[j].compareTo(str[j+1])>0)
			{
				
				temp=str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
				
			}
			
			
		}
		
	}
	System.out.println("Bubble Sort Of String in Ascending Order is: ");
	
	for(int i=0; i<str.length; i++)
	{
		
		System.out.print(str[i]+ " " );
		
	}
	
}
}