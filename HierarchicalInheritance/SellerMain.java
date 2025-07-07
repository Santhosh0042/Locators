package HierarchicalInheritance;

import java.util.Scanner;

public class SellerMain {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		
		System.out.println("Enter the UserName");
		
	    String UserName = Sc.next();
			
		System.out.println("Enter Password");
		  
		String Password = Sc.next();
		
		System.out.println("Enter AddProduct");
		
		String AddProduct = Sc.next();
		
		Seller adminData = new Seller( UserName, Password, AddProduct);
		
		adminData.Seller();

	}

}
