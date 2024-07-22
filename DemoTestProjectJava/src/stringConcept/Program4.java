package stringConcept;

//Q.Given a string and a non-negative int n, return a larger string that is n copies of the original string.


public class Program4 {
String result="";
	public String nTimesString( String str, int n)
	{
		
		while(n>=1)
		{
			result=str+result;
			--n;	
		}
		
		return result;
	}
	public static void main(String[] args) {

Program4 p4=new Program4();
String st=p4.nTimesString("Hi",0);
		System.out.println(st);
	}

}
