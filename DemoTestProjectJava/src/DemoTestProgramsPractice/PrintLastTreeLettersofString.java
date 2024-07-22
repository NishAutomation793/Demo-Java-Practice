package DemoTestProgramsPractice;

public class PrintLastTreeLettersofString {

	public static void main(String[] args) {

		String s = "This is Selenium Class";

		char ch[] = s.toCharArray();

		String str = "";
		for (int i = 0; i < ch.length; i++) {

			if (i >= ch.length - 3) 
			{
				str = str + s.charAt(i);
			}
		}
		System.out.println(str);
	}

}
