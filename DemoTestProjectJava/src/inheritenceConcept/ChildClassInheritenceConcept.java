package inheritenceConcept;

public class ChildClassInheritenceConcept extends InheritenceWithStaticMethods {

	
	public static void doLogin()
	{
		
		System.out.println("This is a login static child method");
		
	}
//	public final void addCart()
//	{
//		
//		System.out.println("This is the final Method");
//		
//		
//	}
//	public static final void doPayment()
//	{
//		
//		System.out.println("This is the final static Payment Method");
//		
//		
//	}
	
	
public static void main(String[] args) {
	
	
	
	ChildClassInheritenceConcept ch= new ChildClassInheritenceConcept();
	
	System.out.println(ch.STR_VALUE);
	int value =ch.a;
	String str=ch.s;
	System.out.println(value + " : " + str  );
	
	int value2=ch.b;
	System.out.println("The second value is : " +value2);
	
	System.out.println("Printing values of Methods now -----------------");
	ch.doLogin();
	ch.doPayment();
	ch.addCart();
	
	
	
}
	
	
}
