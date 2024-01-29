package arrays;

public class ArrayConcept2 {

	public static void main(String[] args) {

		String str[] = { "Chrome", "IE", "Firefox", "Safari", "Edge" };

		{

			for (int i = 0; i < str.length; i++) {

				if (str[i].equals("Chrome")) {

					System.out.println("Its coming from Google :" + str[i]);

				} else if (str[i].equals("IE")) {
					System.out.println("Its deprecated : " + str[i]);

				} else if (str[i].equals("Safari")) {
					System.out.println("Its coming from safari : " + str[i]);

				}

				else if (str[i].equals("Edge")) {
					System.out.println("Its coming from Edge :" + str[i]);

				} else if (str[i].equals("Firefox")) {
					System.out.println("Its coming from Mozila :" + str[i]);

				} else {

					System.out.println("The values are not correct");
				}

			}

		}

	}

}
