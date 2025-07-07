package HierarchicalInheritance;

public class Admin extends User{

	
	public String Reports;
	
	public Admin(String userName, String password, String reports) {
		super(userName, password);
		
		this.Reports = reports;
	
	}
	
	void Admin() {
	System.out.println("Reports:"+ Reports);

	}
}
