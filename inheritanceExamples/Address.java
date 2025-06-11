package inheritanceExamples;

public class Address extends UserName{

	
 public String Place;
 public int PinCode;
 public double DoorNumber;
	
	
	public Address(String userName, String password, String firstName, String lastName, int phoneNumber,String place,int pinCode,double doorNumber) {
		super(userName, password, firstName, lastName, phoneNumber);
		
		
		
		this.Place = place;
		this.PinCode = pinCode;
		this.DoorNumber = doorNumber;
	}
	@Override
    public void JioMartLoginDetails() {
		super.JioMartLoginDetails();
	System.out.println("Place:"+ Place +"Place:"+ Place +" DoorNumber:"+ DoorNumber);
	
	}
}
