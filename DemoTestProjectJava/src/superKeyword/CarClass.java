package superKeyword;

public class CarClass {
	
	int car_speed=200;
	
	public CarClass()
	{
		System.out.println("This is Car class 0 parameterized constructor");
		
	}
	
	public CarClass(String s)
	{
		System.out.println("This is Car class 1 parameterized constructor");
		
	}
	
	public void carWheel()
	{
		
		System.out.println("This is the Car Class 0 parameterized wheel method");
		
	}
	
	public void carWheel(int count)
	{
		
		System.out.println("This is the Car Class 1 parameterized wheel method");
		
	}

}
