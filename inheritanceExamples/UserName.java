package inheritanceExamples;

public class UserName extends JioMartLogin {

	
	public String FirstName;
	public String LastName;
	public int PhoneNumber;
	
	public UserName(String userName, String password,String firstName,String lastName,int phoneNumber) {
		super(userName, password);
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.PhoneNumber = phoneNumber;
	
	}
	@Override
    public void JioMartLoginDetails() {
		super.JioMartLoginDetails();
	System.out.println("FirstName: "+FirstName + "LastName: "+ LastName + "PhoneNumber:"+PhoneNumber);
	
	
	}
	
	}

