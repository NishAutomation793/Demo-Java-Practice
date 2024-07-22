package DemoTestProgramsPractice;

public class SwappingNumbers {

	public static void main(String[] args) {

// WIthout Using third Variable :
		
		int a=9;
		int b=11;
//	
	System.out.println("Numbers Values before Swapping is : A = "+a +  " B= "+b);	
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("Numbers Values after Swapping is : A = "+a +  " B= "+b);	
//		
		
		
// Using third Variable :
		
//		int temp=0;
//		
//		temp=b;
//		b=a;
//		a=temp;
		
//		System.out.println("Numbers Values after Swapping is : A = "+a +  " B= "+b);	

	
//	Way 3: Using multiplication and division
	
	
	
a=a*b;
b=a/b;
a=a/b;

System.out.println("Numbers Values after Swapping is : A = "+a +  " B= "+b);	

	
	
}
}