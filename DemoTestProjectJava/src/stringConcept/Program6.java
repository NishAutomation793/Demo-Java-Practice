package stringConcept;

//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//
//countXX("abcxx") → 1
//countXX("xxx") → 2
//countXX("xxxx") → 3


public class Program6 {

public int countXX(String str) {
		int count = 0;

		for (int i = 0; i <str.length()-1; i++) 
		{
			if(str.substring(i, i+2).equals("xx"))
			{
				count=count+1;
				
			
			}
			
			
			
		}

return count;
	}

	public static void main(String[] args) {

Program6 p6=new Program6();
int co=p6.countXX("Kittensxxx");
	System.out.println(co);	
		
	}

}
