package arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		int arr[] = new int[4];
		
		Object ob[] = new Object[6];
		ob[0] = "String";
		ob[1] = 78;
		ob[2] = 'M';
		ob[3] = 03/9/2020;
		ob[4] = 14.6789;
		ob[5] = true;
		
		
		
for (Object object : ob) {
	
	System.out.println(object);
	
}
	}

}
