package inheritanceExamples;

public class FullTimeEmployees extends Employee {

	double bonus = 2000.00;
	
	public FullTimeEmployees(int employeeId, String employeeName, double salary, int departmentId, int employeeCode,double bonus) {
		super(employeeId, employeeName, salary, departmentId, employeeCode);
	
		
this.bonus = bonus;
		
	}
	
    @Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Bonus: $"+ bonus);
	}
}
