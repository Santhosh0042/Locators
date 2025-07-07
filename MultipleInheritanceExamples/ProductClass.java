package MultipleInheritanceExamples;

public class ProductClass implements Product,ProductAddress{

	@Override
	public int GetData(int ProductId) {
		// TODO Auto-generated method stub
		return 52;
	}

	@Override
	public String GetData_one(String ProductName) {
		// TODO Auto-generated method stub
		return "Shoes";
	}

	@Override
	public int GetData_two(int ProductPrice) {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public String GetData(String Address) {
		// TODO Auto-generated method stub
		return "BHEL";
	}

}
