package demoPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnConceptClass {

	public void returnConcept()
	{
		
		
		System.out.println("This method return nothing...");
		return;
		
	}
	
	// Return list of employees of company
	
	public ArrayList<String> employeesList(ArrayList<String> empList)
	{
		
		
		return empList;
		
	}
	
	public ArrayList<String> employeeList(String compName)
	{
		
		System.out.println("Company Name is : "+compName);
		
		ArrayList<String> list =new ArrayList<String>();
		
		switch (compName.toLowerCase().trim()) {
		case "ibm":
			list.add("Nishant");
			list.add("Gulmohar");
			break;
		case "ukg":
			list.add("Manish");
			list.add("Prashant");
			
			break;
		case "tcs":
			list.add("Heena");
			list.add("Reema");
			
			break;
		case "accenture":
			list.add("Manoj");
			list.add("Prateek");
			
			break;
		default:
			System.out.println("The company Name doesn't exist in the database.. Please enter another name");
			break;
		}
		
		return list;
		
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<String> arr= new ArrayList<String>(Arrays.asList("Nishant", "Karan", "Manish"));
		
		ReturnConceptClass rt = new ReturnConceptClass();
	    ArrayList<String> str= rt.employeesList(arr);
			System.out.println("Array List of Employee : " +str);	
		System.out.println("------------------------------------");
		
		ArrayList<String> st=rt.employeeList("accenture");
		
		System.out.println("Employee List of that Company is : " +st);
		
	}
	
	
}
