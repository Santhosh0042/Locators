package HierarchicalInheritance;

public class Seller extends User {

	
	public String AddProduct;
	
	public Seller(String userName, String password,String addProduct) {
		super(userName, password);
	  this.AddProduct =  addProduct;
	  
	}

	void Seller() {
		System.out.println("AddProduct:"+ AddProduct);
	}
	
}
