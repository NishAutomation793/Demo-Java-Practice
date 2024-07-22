package DemoTestProgramsPractice;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateNumbersArray {

	static int count=0;
	public static void main(String[] args) {
		
		
		
	
	int a[]= {3,6,7,3,7,8,9,18,9};
	
Set<Integer>set=new HashSet<Integer>();
Set<Integer>duplicate=new HashSet<Integer>();


for (int arr : a) {
	
	if(!set.add(arr))
	{
		duplicate.add(arr);
		
	}
		
}

System.out.println("Duplicate Values in Array are: "+duplicate);


}
}