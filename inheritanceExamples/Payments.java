package inheritanceExamples;

public class Payments extends OfferDetails{

	int OnlinePayment;
	
	public Payments(int orderId, String hotelName, int price, double discount,int onlinePayment) {
		super(orderId, hotelName, price, discount);
	
		this.OnlinePayment = onlinePayment;
		
	}

	public void SwiggyDetails() {
		
		System.out.println("OnlinePayment:"+OnlinePayment);

	}	
}
