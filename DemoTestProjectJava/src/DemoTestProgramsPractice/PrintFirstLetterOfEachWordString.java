package DemoTestProgramsPractice;

public class PrintFirstLetterOfEachWordString {

	public static void main(String[] args) {

		String s="May You Live Long";
		
		String st[]=s.split(" ");
		
		for(String stu:st)
		{
			
			for(int i=0; i<stu.length(); i++)
			{
				
				System.out.print(stu.charAt(0));
				break;
				
			}
			System.out.println();
		}
		

		
	}

}
