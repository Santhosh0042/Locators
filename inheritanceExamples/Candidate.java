package inheritanceExamples;

public class Candidate extends Person {
	
	int AadharNumber=12345;
	String PanNumber= "CMDPC8394";
	
	public Candidate(int personId, String personName, int age, String address,int aadharNumber,String panNumber) {
		super(personId, personName, age, address);
	
		this.AadharNumber = 12345;
		this.PanNumber = "CMDPC8394";
	
	}
	
	public void displayDetails() {
	 super.displayDetails();
	System.out.println("AadharNumber:"+AadharNumber);
	System.out.println("PanNumber:"+PanNumber);
	}
}
