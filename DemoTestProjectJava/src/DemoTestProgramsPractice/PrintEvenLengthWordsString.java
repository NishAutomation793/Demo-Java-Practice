package DemoTestProgramsPractice;

public class PrintEvenLengthWordsString {

	public static void main(String[] args) {

     String s="Hell World";
     
     String str[]=s.split(" ");
     
   for(String st: str)
   {
	   
	   if(st.length()%2==0)
	   {
		   System.out.println("Even Strings is : "+st);
		   
		   
	   }
	   
   }
	}
     }

