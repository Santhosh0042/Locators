package inheritanceExamples;

public class MyntraMain {

	public static void main(String[] input) {

		DeliveryPrice deliveryPriceData = new DeliveryPrice("Shoes",25,"Puma",3000.00,15);
		
		deliveryPriceData.displayDetails();
		
		Discount discountData = new Discount("Bag",30,"SkyBags",1200.00,10,10);
         
		discountData.displayDetails();
	}

}
