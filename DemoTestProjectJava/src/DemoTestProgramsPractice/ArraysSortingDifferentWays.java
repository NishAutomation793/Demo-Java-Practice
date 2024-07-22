package DemoTestProgramsPractice;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortingDifferentWays {

	public static void main(String[] args) {
	
	int a[]= {8,10,18,19,45,6,11};
	
	// 1st Method:
	//System.out.println("Arrays before sorting is: "+Arrays.toString(a));
	

	//Arrays.sort(a);

	//System.out.println("Sorting via Normal Sort Method is: "+Arrays.toString(a));
	//2nd Method :
	
	//Arrays.parallelSort(a);
	
	//System.out.println("Sorting via Parallel Sort Method is: "+Arrays.toString(a));

	
// Third Method : Sorting in Descending Order
	
	Integer arr[]= {8,10,18,19,45,6,11}; //In this we have to define the wrapper 
	

	Arrays.sort(arr,Collections.reverseOrder());
	
	System.out.println("Sorting via Reversal Sort Method is: "+Arrays.toString(arr));

	}
}
