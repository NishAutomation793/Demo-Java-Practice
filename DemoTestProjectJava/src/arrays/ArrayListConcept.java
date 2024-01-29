package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		ar.add(100);
		ar.add("Suman");
		ar.add(78.34);
		ar.add(true);

		System.out.println(ar);

		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(144);
		al.add(300);
		
		for( int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
			
		}
		//OR
		
		for (Integer i : al) {
			System.out.println(i);
		}
		
	}

}
