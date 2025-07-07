package MultipleInheritanceExamples;

public class BankClass implements BankHolder,BankDeposit{

	@Override
	public int Data(int AccountNumber) {
		// TODO Auto-generated method stub
		return 12353466;
	}

	@Override
	public String Data_one(String Name) {
		// TODO Auto-generated method stub
		return "san";
	}

	@Override
	public int Data_two(int Amount) {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public double GetData(double BankDeposit) {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public int GetData(int Amount) {
		// TODO Auto-generated method stub
		return 10000;
	}

}
