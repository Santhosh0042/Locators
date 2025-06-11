package HierarchicalInheritance;

import java.util.Scanner;

public class AdminMain {

	public static void main(String[] args) {
		
		
		Scanner Sc = new Scanner(System.in);
		
	
		System.out.println("Enter the UserName");
		
	    String UserName = Sc.next();
			
		System.out.println("Enter Password");
		  
		String Password = Sc.next();
		
		System.out.println("Enter Reports");
		
		String Reports = Sc.next();
		
		Admin adminData = new Admin( UserName, Password, Reports);
		
		adminData.Admin();

	}

}
