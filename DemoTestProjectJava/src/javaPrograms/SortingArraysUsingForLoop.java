package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArraysUsingForLoop {

	public static void main(String[] args) {

	
		int arr[] = {34,28,89,27,100,18};
		
		int temp;
		
		for ( int i=0; i<arr.length; i++)
		{
			for( int j=i+1; j<arr.length; j++)
			{
			if(arr[i]>arr[j])
			{
				 temp=arr[j];
				 arr[j]=arr[i];
				arr[i]=temp;
				
			}
			
			}
		
		}
		System.out.println(Arrays.toString(arr));

		}

	}
