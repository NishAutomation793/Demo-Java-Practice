package javaPrograms;

public class PrintABCWithASCIIValues {

	public static void main(String[] args) {

		// Calling static methods directly in main method
		SmallLettersWithASCII();
		CapitalLettersWithASCII();
	}

	public static void SmallLettersWithASCII() {
		System.out.println("Small Albhabets with their ASCII values are ");
		char ch = 'a';
		for (ch = 'a'; ch <= 'z'; ch++) {

			System.out.println(ch + " = " + (int) ch);
		}
	}

	public static void CapitalLettersWithASCII() {
		System.out.println("Capital Albhabets with their ASCII values are ");
		char ch = 'A';
		for (ch = 'A'; ch <= 'Z'; ch++) {

			System.out.println(ch + " = " + (int) ch);
		}

	}

}
