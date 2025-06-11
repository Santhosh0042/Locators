package MultipleInheritanceExamples;

public class DemoMain {

	public static void main(String[] inputs) {
		
		DemoTwo Data =   new DemoTwo();
			System.out.println(Data.GetData(10));
			System.out.println(Data.GetData_one("Santhosh"));
			System.out.println(Data.GetData_two(1234567));
			System.out.println(Data.GetData_One("san@gmail.com"));
			System.out.println(Data.GetData("Hyderabad"));
			
	}

}
