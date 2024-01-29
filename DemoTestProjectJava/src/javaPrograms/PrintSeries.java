package javaPrograms;

public class PrintSeries {

	int add = 0;
	char cha = 'a';

	public void printSeries1()

	{

		for (double i = 0.0; i <= 10.0; i++)
			System.out.println("Print the series1 is : " + i);

	}

	public void printSeries2() {

		for (int i = 0; i <= 11; i++) {
			System.out.println("Print the series2 is : " + add);

			add = add + 9;

		}

	}

	public void printVowels() {
		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				System.out.println("Vowles are : " + ch);

			}

		}

	}

	public void printVowels2() {

		while (cha <= 'z') {

			if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') {

				System.out.println("Vowles are using while loop : " + cha);

			}
			cha++;
		}

	}

	public static void main(String[] args) {

		PrintSeries pr = new PrintSeries();
		pr.printSeries1();
		System.out.println("------------------------------------");

		pr.printSeries2();

		System.out.println("------------------------------------");

		pr.printVowels();

		System.out.println("------------------------------------");

		pr.printVowels2();
	}

}