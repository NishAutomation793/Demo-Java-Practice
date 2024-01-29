package loopsProgram;

public class NestedLoop {

	public static void main(String[] args) {
//		//Print 00 01 02 03
//		        10 11 12 13
//		        20 21 22 23
//		        30 31 32 33

//		for (int i = 0; i <= 3; i++) {
//
//			System.out.print(i);
//
//			for (int j = 0; j <= 3; j++) {
//				System.out.print(j + " ");
//		        
//				System.out.print(i);	
//			}
//			System.out.println();
//		}
		

		for (int i = 0; i <= 3; i++) 
		{

			for (int j = 0; j <= 3; j++) 
			{
		          System.out.print(i+ "" +j + " " );

			}
			System.out.println();
		}	
		
	}
}
