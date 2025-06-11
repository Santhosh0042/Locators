package inheritanceExamples;

public class SwiggyMain {

	public static void main(String[] inputs) {
	
		OfferDetails offerDetailsData = new OfferDetails(15,"Roosters",1300,5);
		
		offerDetailsData.SwiggyDetails();
		
		Payments paymentsData = new Payments(20,"Mhefil",1600,10,1600);		

		paymentsData.SwiggyDetails();
	}

	
}
