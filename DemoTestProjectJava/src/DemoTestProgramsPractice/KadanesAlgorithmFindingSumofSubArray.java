package DemoTestProgramsPractice;

public class KadanesAlgorithmFindingSumofSubArray {

	public static void main(String[] args) {

		// This Kadane's Algo says that out of all the subarrays we have to print the
		// subarray with the maximum value of sum

		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int sum = 0;
		int max = Integer.MIN_VALUE; // 4
		
		int start=0;int end=0;int s=0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i]; // -2

			if (sum > max) {
				max = sum;
				
				start=s;
				end=i;
				

			}
			if (sum < 0) {

				sum = 0;
				s=s+1;
				
			}

		}

		System.out.println("Maximum Addition of subarray is: " + max);
		
		System.out.println("The starting index is: "+start + " and the ending index is :" +end);;

	}

}
