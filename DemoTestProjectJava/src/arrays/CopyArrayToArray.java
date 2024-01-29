package arrays;

import java.util.Arrays;

public class CopyArrayToArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 18, 29, 10 };
		int arr2[] = new int[arr.length];

		//int temp;

		for (int i = 0; i < arr.length; i++) {

			arr2[i] = arr[i];

		}
		System.out.println("Values of Array 2 are : " + Arrays.toString(arr2));

	}

}
