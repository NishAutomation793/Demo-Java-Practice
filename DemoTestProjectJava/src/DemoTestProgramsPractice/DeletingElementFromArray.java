package DemoTestProgramsPractice;

public class DeletingElementFromArray {

	public static void main(String[] args) {

		
		int a[]= {4,9,19,10,6,7};
		
		int element =19;
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			
			if(element==a[i])
			{
				count ++;
				
				for(int j=i; j<a.length-1; j++)
				{
					
					a[j]=a[j+1];
				}
				break;
			}
			
			
		}
		
		if(count>0)
		{
			System.out.println("Element is successfully deleted");
			
		}
		else
		{
			System.out.println("Element not found in the Array");
			
		}
		
		for(int k=0; k<a.length-1; k++)
		{
			
			System.out.println(a[k]);
		}
	}

}
