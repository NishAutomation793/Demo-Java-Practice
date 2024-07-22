package DemoTestProgramsPractice;

public class PrintFirstHaldOfStringText {

	public static void main(String[] args) {
		
		String str="This is so special class";
		
		int half_length=str.length()/2;
		
		System.out.println("First Half of String is: "+str.substring(0, half_length));
		
	}
	
}
