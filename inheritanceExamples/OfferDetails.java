package inheritanceExamples;

public class OfferDetails extends Swiggy {

	double Discount;
	
	public OfferDetails(int orderId, String hotelName, int price,double discount) {
		super(orderId, hotelName, price);
	
		this.Discount =discount;
		
	}
	
	public void SwiggyDetails() {
		
		System.out.println("Discount:"+Discount);
	}
}
