package inheritanceExamples;

public class JioMartLogin {

	public String UserName;
	public String Password;
	
	public JioMartLogin (String userName,String password) {
	this.UserName = userName;
	this.Password = password;

}
	
	public void JioMartLoginDetails() {
	System.out.println("UserName:" + UserName + "Password:"+Password);
	
	}

}