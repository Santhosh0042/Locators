package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		
		ProductDemo Student_1=new ProductDemo("Smartphone", 25000.00, 10);
		ProductDemo Student_2=new ProductDemo("Headphones", 3000.00, 15);
		ProductDemo Student_3=new ProductDemo("Laptop", 50000.00, 5);
				
		System.out.println(Student_1);
		
		List<ProductDemo>list =new ArrayList<ProductDemo>();
		
		list.add(Student_1);
		list.add(Student_2);
		list.add(Student_3);
		
		
		for (ProductDemo data:list) {		
		
		System.out.println(data.ProductName);
		System.out.println(data.ProductPrice);
		System.out.println(data.ProductQuantity);
		
		}
	}

}
