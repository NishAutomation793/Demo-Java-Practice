package demoPractice;

public class StaticPropertyConcept {

	int num=3;
	static String s="Nishant";
	
	
	public void getName()
	{
	     getUser();
	     System.out.println(s + " This is static Variable accessed directly");
	
		
	}
	public static void getUser()
	{

		System.out.println("Please print the User Name : This is static method");
		
	}
	
	
	
	public static void main(String[] args) {
		StaticPropertyConcept st= new StaticPropertyConcept();

st.getName();
		
		
	}

}
// Static variables and methods can be accessed/called directly or with help of ClassName. in static/non-static method
// Non-Static methods and variables can only be accessed/called by creating a reference of the class and not directly
//We can also access static methods and variables using reference variable by that will give warning and not a good practice
// Static methods and variables are stored inside CMA or Metaspace or Permanent Generation
// ALl objects will be stored inside Heap Memory and all Ref_Variable will be stored inside Stack Memory referring to Heap Memory Variables and Methods
// In case of INheritence also we can't create a ref-_variable of child class and call parent class static methods. They can only be called via ParentClass.MethodName in Child  Class.

