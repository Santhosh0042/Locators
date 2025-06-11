package inheritanceExamples;

public class Employee {
	public int EmployeeId;
	public String EmployeeName;
	public double Salary;
	public int DepartmentId;
	public int EmployeeCode;
	
	
	
	public Employee(int employeeId, String employeeName, double salary, int departmentId,int employeeCode) {
	this.EmployeeId = employeeId;
	this.EmployeeName = employeeName;
	this.Salary = salary;
	this.DepartmentId = departmentId;
	this.EmployeeCode = employeeCode;
	
	}
	
	
	public void displayDetails() {
	System.out.println("EmployeeId:"+ EmployeeId +", EmployeeName:"+EmployeeName + ",Salary:$" +Salary);
	
	}
}