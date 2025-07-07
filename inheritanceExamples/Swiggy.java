package inheritanceExamples;

public class Swiggy {
  
	public int OrderId;
	public String HotelName;
	public int Price;
	
	public Swiggy(int orderId,String hotelName,int price) {
	
	this.OrderId = orderId;
	this.HotelName = hotelName;
	this.Price = price;

}
	
	
	public void SwiggyDetails() {
	
	System.out.println("OrderId:" + OrderId + "HotelName: " + HotelName);	
	
}	
	
}
