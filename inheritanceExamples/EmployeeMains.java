package inheritanceExamples;

public class EmployeeMains {

	public static void main(String[] input) {
	

		
		Manager managerData = new Manager(15,"Ravi",50000.00,5,25,2000,3);
		
		managerData.displayDetails();
		
		
		SeniorManager seniorManagerData = new SeniorManager(20,"Rakesh",75000.00,10,30,2000,6);
		
		seniorManagerData.displayDetails();
		
		
		HrManager hrManagerdata = new HrManager(3,"Santhosh",90000.00,20,28,2000.00,10);
		
		hrManagerdata.displayDetails();
		
		
	}

}
