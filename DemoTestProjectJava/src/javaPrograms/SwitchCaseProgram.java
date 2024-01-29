package javaPrograms;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c;

		System.out.println("Please input mathematical expression");
		String st = sc.next();
		System.out.println("Please enter two nos to perform the operation");

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();
		switch (st) {

		case "Add":

			c = a + b;
			System.out.println("Addition of nos is :" + c);

			break;

		case "Sub":

			c = a - b;
			System.out.println("Substraction of nos is :" + c);

			break;

		case "Mul":

			c = a * b;
			System.out.println("Multiplication of nos is :" + c);

			break;

		case "Div":

			c = a / b;
			System.out.println("Division of nos is :" + (float) c);

			break;

		default:
			System.out.println("Please select correct Operation");
			break;
		}

	}

}
