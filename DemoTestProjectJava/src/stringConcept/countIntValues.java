package stringConcept;

//Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
//
//
//arrayFront9([1, 2, 9, 3, 4]) → true
//arrayFront9([1, 2, 3, 4, 9]) → false
//arrayFront9([1, 2, 3, 4, 5]) → false

public class countIntValues {
	public boolean arrayFront9(int[] nums) {
		  

		  for( int i=0; i<nums.length; i++)
		  {
		    if(nums[i]==9 && i<=3)
		    {
		      
		     return true;
		      
		    }
		   
		    
		  }
		  return false;
		  
		}
	public static void main(String[] args) {
		countIntValues ct=new countIntValues();
		int arr[]= {3,5,8,9,1};
		
		boolean flag=ct.arrayFront9(arr);
		System.out.println(flag);
		
	}

}
