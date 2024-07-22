package DemoTestProgramsPractice;

public class InsertElementInArray {

	public static void main(String[] args) {

		int a[]= {3,8,9,5,10,6};
		
		int element =11;
		int pos=3;
		
		for(int i=a.length-1; i>=pos-1; i--)
		{
			
			//4->5, 3->4, 2->3
			
			if(i==pos-1)
			{
				a[i]=element;
				break;
				
			}
			a[i]=a[i-1]; 
			
		}
		
		System.out.println("Inserted Element with new Array is : ");
		
		for(int j=0; j<a.length; j++)
		{
			
			System.out.println(a[j]);
		}
		
		
	}

}
