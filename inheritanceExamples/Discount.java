package inheritanceExamples;

public class Discount extends DeliveryPrice{

	double Discount;
	
	public Discount(String productName, int productId, String brand, double price, double deliveryPrice,double Discount) {
		super(productName, productId, brand, price, deliveryPrice);
		
		
		this.Discount = Discount;
		
	}

	
	@Override
    public void displayDetails() {
		super.displayDetails();
	System.out.println("Discount:"+Discount);
	
	
	
	}
}
