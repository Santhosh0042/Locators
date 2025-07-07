package MultipleInheritanceExamples;

public class ProdcutMain {

	public static void main(String[] inputs) {
	
		ProductClass Data =new ProductClass();
		
		System.out.println(Data.GetData(52));
		System.out.println(Data.GetData_one("Shoes"));
		System.out.println(Data.GetData_two(2000));
		System.out.println(Data.GetData("BHEL"));
	}

}
