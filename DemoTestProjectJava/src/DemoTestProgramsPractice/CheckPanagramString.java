package DemoTestProgramsPractice;

import java.util.HashSet;
import java.util.Set;

public class CheckPanagramString {

	public static void main(String[] args) {

		String s = "The quick brown fox jumps over the lazy dog";
		s = s.toLowerCase().trim();

		char ch[] = s.toCharArray();

		Set<Character> set = new HashSet<Character>();

		for (char c : ch) 
		{
			if (c >= 'a' && c <= 'z')
				set.add(c);

		}
		System.out.println(set.size());

		if (set.size() == 26) {

			System.out.println("String is Panagram");
		} else {

			System.out.println("String is not Panagram");
		}

	}

}