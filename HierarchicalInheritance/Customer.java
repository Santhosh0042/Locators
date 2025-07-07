package HierarchicalInheritance;

public class Customer extends User{

	
	public String ProductName;
	
	public Customer(String userName, String password,String productName) {
		super(userName, password);
		
		this.ProductName = productName;
	}

	void Customer() {
	
	System.out.println("ProductName:"+ ProductName);
	
	}
}
