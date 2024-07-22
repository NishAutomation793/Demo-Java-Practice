package DemoTestProgramsPractice;

public class ReversingWordsInString {

	public static void main(String[] args) {


		String s="This is Selenium Class";
		
		String str="";
		
		String arr[]=s.split(" ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			
			str=str+arr[i]+ " ";
			
		}
		System.out.println(str);
		
	}

}
