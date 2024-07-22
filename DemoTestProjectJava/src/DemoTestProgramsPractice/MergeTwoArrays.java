package DemoTestProgramsPractice;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {3,6,7,8};
		int b[]= {10,11,12,13,14};
		
		int arr[]=new int [a.length+b.length];
		
		for(int i=0; i<a.length; i++)
		{
			
			arr[i]=a[i];
			
		}
		for(int j=0; j<b.length; j++)
		{
			
			arr[j+a.length]=b[j];
		}
		
		
		System.out.println("New Array after merging is: ");
		
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
			
		}
		
		
		
		
	}

}
