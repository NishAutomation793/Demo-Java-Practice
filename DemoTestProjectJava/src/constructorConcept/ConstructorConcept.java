package constructorConcept;

public class ConstructorConcept {

	int age;
	String name;
	double salary;
	
//	public ConstructorConcept()
//	{
//		this(10);
//		System.out.println("This is zero Parameterized constructor");
//
//	}
	private ConstructorConcept()
	{
		
		
	}
	private ConstructorConcept(int a)
	{
		
		
	}
	
//	public ConstructorConcept(int a)
//	{
//		
//		System.out.println("This is one Parameterized constructor");
//		this.method1(10);
//	}

	public void method1()
	{
	
		System.out.println("This is the default method");
		
	}
	public void method1(int a)
	{
		
		System.out.println("This is the one parameterized method");
		
	}
	
	
	public static void main(String[] args) {


		ConstructorConcept cs= new ConstructorConcept();
		
		
		
	}

}
