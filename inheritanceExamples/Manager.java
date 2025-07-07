package inheritanceExamples;

public class Manager extends FullTimeEmployees{

	
	double noOfYearsExperience;
	
	public Manager(int employeeId, String employeeName, double salary, int departmentId, int employeeCode,
			double bonus,double noOfYearsExperience) {
		super(employeeId, employeeName, salary, departmentId, employeeCode, bonus);

this.noOfYearsExperience = noOfYearsExperience;

}
	
	@Override
	public void displayDetails() {
	 super.displayDetails();
	 System.out.println("noOfYearsExperience:" + noOfYearsExperience);
	
	}
}
