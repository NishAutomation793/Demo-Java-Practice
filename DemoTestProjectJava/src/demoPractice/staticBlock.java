package demoPractice;

public class staticBlock {

	static {
		
		
		System.out.println("This is first static block");
		
		
	}
	
	public static void main(String[] args) {

		System.out.println("This is main method");
	
		
	}
	
	static {
		
		System.out.println("This is second and last static block");
		
	}

}
