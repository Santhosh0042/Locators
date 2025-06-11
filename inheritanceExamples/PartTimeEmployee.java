package inheritanceExamples;

public class PartTimeEmployee extends Employee {
	
	double insentives = 3000.00;
	
	public PartTimeEmployee(int employeeId, String employeeName, double salary, int departmentId, int employeeCode,double insentives) {
		super(employeeId, employeeName, salary, departmentId, employeeCode);
		
	
		this.insentives = insentives;
	}
		public void  displayDetails() {
			super.displayDetails();
			System.out.println(" insentives: $"+  insentives);
	}
}