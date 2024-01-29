package inheritenceConcept;

public class InheritenceWithStaticMethods {

	static int a=20;
	static String s="Nishant";
	final String STR_VALUE="Deepika";
	final static int b=100;
	
	public static void doLogin()
	{
		
		System.out.println("This is a login static Parent method");
		
	}
	
	public final void addCart()
	{
		
		System.out.println("This is the final Parent Method");
		
		
	}
	public static final void doPayment()
	{
		
		System.out.println("This is the final static Payment Method");
		
		
	}

}
