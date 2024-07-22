package DemoTestProgramsPractice;
import java.util.HashSet;
import java.util.Set;


public class LongestSequenceArrays {
	
	public static void main(String[] args) {
		
		int max=0;
		int a[]= {100,4,7,8,3,1,5};
		
	
		Set<Integer> set=new HashSet<Integer>();
		
		Set<Integer> sequence= new HashSet<Integer>();
		
		for(int i :a)
		{
			set.add(i); //Here we have added all values to HashSet first removing the duplicates also.
		}

		for(int j=0; j<a.length; j++)
		{	
		
		if(!set.contains(a[j]-1))
		{
			
			int start=a[j];
			
			while(set.contains(start))
			{
				start++;
				
			}
			
			max=Math.max(max,start-a[j]);
		}
		
	}
		
		System.out.println("Longest Sequence is of "+max+ " numbers" +sequence );
		
	}}

