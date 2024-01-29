package interfaces;

public interface UKMedicals {

	
	public void brainDept();
	
	public void boneDept();
	public void commonMethod();
	
	
	default void bloodTest() {
		
		
		System.out.println("UK Medical Blood test");
		
	}
}
