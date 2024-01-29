package superKeyword;

public class BMWClass extends CarClass {

	int bmw_speed = 500;

	public BMWClass() {

		System.out.println("This is bmw class 0 paramterized contsructor");

	}

	public BMWClass(int d) {

		
		
		
		System.out.println("This is bmw class 1 paramterized contsructor");
		
	}

	public void bmwWheel() {
		
		System.out.println("This is bmw 0 parameterized method");
		
	}

	public void bmwWheel(int count) {
		
		super.carWheel(8);
		super.carWheel();
		System.out.println("This is bmw 1 parameterized method");

	}

}
