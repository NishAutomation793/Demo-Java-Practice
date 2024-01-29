package demoPractice;

public class ClassAndObjectConceptAssignment {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		ClassAndObjectConceptAssignment u1 = new ClassAndObjectConceptAssignment();

		u1.name = "Nishant";
		u1.age = 29;
		u1.city = "Banglore";

		ClassAndObjectConceptAssignment u2 = new ClassAndObjectConceptAssignment();

		u2.name = "Manish";
		u2.age = 34;
		u2.city = "Pune";

		ClassAndObjectConceptAssignment u3 = new ClassAndObjectConceptAssignment();

		u3.name = "Seema";
		u3.age = 38;
		u3.city = "Maharastra";

		ClassAndObjectConceptAssignment u4 = new ClassAndObjectConceptAssignment();

		u4.name = "Manoj";
		u4.age = 17;
		u4.city = "Delhi";

		System.out.println("Printing Values for U1 reference variable :" + u1.name + " " + u1.age + " " + u1.city);

		System.out.println("Printing Values for U2 reference variable :" + u2.name + " " + u2.age + " " + u2.city);

		System.out.println("Printing Values for U3 reference variable :" + u3.name + " " + u3.age + " " + u3.city);

		System.out.println("Printing Values for U4 reference variable :" + u4.name + " " + u4.age + " " + u4.city);

		u1 = u2;

		System.out.println("___________________________________");

		System.out.println("Printing Values for U1 reference variable :" + u1.name + " " + u1.age + " " + u1.city);

		System.out.println("Printing Values for U2 reference variable :" + u2.name + " " + u2.age + " " + u2.city);

		System.out.println("Printing Values for U3 reference variable :" + u3.name + " " + u3.age + " " + u3.city);

		System.out.println("Printing Values for U4 reference variable :" + u4.name + " " + u4.age + " " + u4.city);

		u2 = u3;

		System.out.println("___________________________________");

		System.out.println("Printing Values for U1 reference variable :" + u1.name + " " + u1.age + " " + u1.city);

		System.out.println("Printing Values for U2 reference variable :" + u2.name + " " + u2.age + " " + u2.city);

		System.out.println("Printing Values for U3 reference variable :" + u3.name + " " + u3.age + " " + u3.city);

		System.out.println("Printing Values for U4 reference variable :" + u4.name + " " + u4.age + " " + u4.city);

		u3 = u4;

		System.out.println("___________________________________");

		System.out.println("Printing Values for U1 reference variable :" + u1.name + " " + u1.age + " " + u1.city);

		System.out.println("Printing Values for U2 reference variable :" + u2.name + " " + u2.age + " " + u2.city);

		System.out.println("Printing Values for U3 reference variable :" + u3.name + " " + u3.age + " " + u3.city);

		System.out.println("Printing Values for U4 reference variable :" + u4.name + " " + u4.age + " " + u4.city);

		u4 = u1;

		System.out.println("___________________________________");

		System.out.println("Printing Values for U1 reference variable :" + u1.name + " " + u1.age + " " + u1.city);

		System.out.println("Printing Values for U2 reference variable :" + u2.name + " " + u2.age + " " + u2.city);

		System.out.println("Printing Values for U3 reference variable :" + u3.name + " " + u3.age + " " + u3.city);

		System.out.println("Printing Values for U4 reference variable :" + u4.name + " " + u4.age + " " + u4.city);

	}

}
