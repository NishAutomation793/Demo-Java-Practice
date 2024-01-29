package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDeclaration {

	public static void main(String[] args) {

//		//Different Ways of declaring Arrays and using different methods
//		
////1.		ArrayList list = new ArrayList();
//		list.add(123);
//
////2.		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(134);
//
////3.		List<String> ls = Arrays.asList("Nishant", "Mahesh", "Manoj", "Sunit");
//		ls.add("Sushmita");
      
		ArrayList<Integer> arlist= new ArrayList<Integer>(Arrays.asList(7,1,90,44,59));
		arlist.add(345);
	
//if we want to sort the ArrayList that we can do with help of Collections class
//If we want to sort the static Arrays then we have to use Arrays.sort(ref_variable)		
		Collections.sort(arlist);
		System.out.println(arlist);
		
		
	}

}
