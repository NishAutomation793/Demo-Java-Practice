package DemoTestProgramsPractice;

public class RecersingEveryWordinString {

	public static void main(String[] args) {

		String s = "Welcome to Java Class";

		String st[] = s.split(" ");

		String reverse = "";

		for (String w : st) 
		{
			String reverse_word = "";
			for (int j = w.length() - 1; j >= 0; j--) {

				reverse_word = reverse_word + w.charAt(j);

			}

			reverse = reverse + reverse_word + " ";

		}
		System.out.println(reverse);

	}

}
