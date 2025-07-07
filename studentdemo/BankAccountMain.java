package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccountDemo account1 = new BankAccountDemo(765776, "raju", 35000.00);
		BankAccountDemo account2 = new BankAccountDemo(563788, "david", 40000.00);
		BankAccountDemo account3 = new BankAccountDemo(764417, "rohit", 2000.00);
		 
		 
		 System.out.println(account1);
			
			List<BankAccountDemo>list =new ArrayList<BankAccountDemo>();
			
			list.add(account1);
			list.add(account2);
			list.add(account3);
			
			
			for (BankAccountDemo data:list) {		
			
			System.out.println(data.accountNumber);
			System.out.println(data.accountHolderName);
			System.out.println(data.accountBalance);
		
	}
	}
}
