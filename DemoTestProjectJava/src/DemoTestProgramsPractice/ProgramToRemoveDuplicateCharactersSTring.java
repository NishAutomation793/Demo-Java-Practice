package DemoTestProgramsPractice;

import java.util.HashSet;
import java.util.Set;

public class ProgramToRemoveDuplicateCharactersSTring {

	public static void main(String[] args) {

		String s = "MISISIPPI";
		String str = "";
		char ch[] = s.toCharArray();

		Set<Character> c = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {

			c.add(ch[i]);
		}

		for (Character chu : c) 
		{
			str = str + chu;

		}
		System.out.println(str);
	}

}
