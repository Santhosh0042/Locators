package HierarchicalInheritance;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner Sc = new Scanner(System.in);
		
		
		System.out.println("Enter the UserName");
		
	    String UserName = Sc.next();
			
		System.out.println("Enter Password");
		  
		String Password = Sc.next();
		
		System.out.println("Enter ProductName");
		
		String ProductName = Sc.next();
		
		Customer CustomerData = new Customer( UserName, Password, ProductName);
		
		CustomerData.Customer();

	}

}
