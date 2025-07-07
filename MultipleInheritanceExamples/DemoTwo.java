package MultipleInheritanceExamples;

public class DemoTwo implements Demo,DemoThree,DemoFour{

	@Override
	public int GetData(int EmployeeId) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String GetData_one(String EmployeeName) {
		// TODO Auto-generated method stub
		return "Santhosh";
	}

	@Override
	public double GetData_two(int EmployeeNumber) {
		// TODO Auto-generated method stub
		return 1234567;
	}

	@Override
	public String GetData_One(String Gmail) {
		// TODO Auto-generated method stub
		return "san@gmail.com";
	}

	@Override
	public String GetData(String Address) {
		// TODO Auto-generated method stub
		return "Hyderabad";
	}

}
