package inheritanceExamples;

public class Myntra {

	public String ProductName;
	public int ProductId;
	public String Brand;
	public double Price;
	
	public Myntra( String productName, int productId, String brand,double price) {
	
	this.ProductName = productName;
	this.ProductId = productId;
	this.Brand = brand;
	this.Price = price;
	
}	

	public void displayDetails() {
	System.out.println("ProductName:"+ProductName+",ProductId:"+ProductId+",Price:"+Price);

}
}