package DemoTestProgramsPractice;

import java.util.HashSet;
import java.util.Set;

/**
 * Here we need to find the longest substring from the string without repitition
 * 
 */

public class LongestSubstringWithoutRepetition {

	public static void main(String[] args) {

      String s="abcdbabcd";
      
      String longestTillNow="";
      String longestOverAll="";
      
      Set<Character> c=new HashSet<Character>();
      
    
      
      for(int i=0; i<s.length(); i++)
      {
    	  if(c.contains(s.charAt(i)))
    	  {
    		  
    		  longestTillNow=""; //Make is empty
    		 c.clear(); //Clear the Set
    		  
    	  }
    	  
    	  c.add(s.charAt(i));
    	  longestTillNow=s.charAt(i)+longestTillNow;
    	  
    	  if(longestTillNow.length()>longestOverAll.length())
    	  {
    		  longestOverAll=longestTillNow;
    		  
    	  }
    	  
      }
      
      
      System.out.println("Longest Non Repeating Substring is : "+longestOverAll);
		
	}

}
