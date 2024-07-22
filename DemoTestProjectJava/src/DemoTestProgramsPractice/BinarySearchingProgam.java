package DemoTestProgramsPractice;

import java.util.Arrays;
/**
 * This binary search will be applicable for SOrted Arrays only
 */

public class BinarySearchingProgam {

	public static void main(String[] args) {

		int arr[] = { 16, 10, 3, 2, 8, 24, 22, 12, 19 };

		Arrays.sort(arr);

		int number = 8;

		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {

				if (number == arr[mi]) {

					System.out.println("Numner is present in the array at : " + mi + " Position");
					break;
				} else if (number < arr[mi]) {

					hi = mi - 1;
				} else  {

					li = mi + 1;

				}

				mi = (li + hi) / 2;
			}

		if (li > hi) {
			System.out.println("Number is not available in the list");

		}
	}
	
//Second Way :
	
//	using 	Arrays.binarySearch(null, 0) where null represents the array and the second value represents the value we are tryig to find. It will return the index pisition at whihc the value is found otherwise it will return some negative value if not found.
	

}
