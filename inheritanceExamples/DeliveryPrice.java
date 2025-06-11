package inheritanceExamples;

public class DeliveryPrice extends Myntra{

	double DeliveryPrice;
	
	public DeliveryPrice(String productName, int productId, String brand, double price,double DeliveryPrice) {
		super(productName, productId, brand, price);
	
	this.DeliveryPrice = DeliveryPrice;

	}

	@Override
     public void displayDetails() {
		super.displayDetails();
	System.out.println("DeliveryPrice:"+DeliveryPrice);

 }
}
