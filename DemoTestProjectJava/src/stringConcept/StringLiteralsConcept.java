package stringConcept;

public class StringLiteralsConcept {

	public static void main(String[] args) {

		String s = "Nishant";
		String s1 = "Nishant";

		String st = new String("Nishant");
		String st1 = new String("Nishant");

		System.out.println(s == s1); // true
		System.out.println(s.equals(s1)); // true

		System.out.println("*********************");

		System.out.println(st == st1); // false
		System.out.println(st.equals(st1)); // true

		System.out.println("*********************");

		System.out.println(s == st); // false
		System.out.println(s.equals(st)); // true

	}

}
