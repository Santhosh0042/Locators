package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class LaptopMain {

	public static void main(String[] args) {
		LaptopDemo laptop1=new LaptopDemo("Dell", 8 ,50000.00);
		LaptopDemo laptop2=new LaptopDemo("Hp", 8 ,55000.00);
		LaptopDemo laptop3=new LaptopDemo("Lenovo", 8 ,40000.00);
	
		System.out.println(laptop1);
		
		List<LaptopDemo>list =new ArrayList<LaptopDemo>();
		
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);
		
		for ( LaptopDemo  data:list) {		
		
		System.out.println(data.Name);
		System.out.println(data.Ram);
		System.out.println(data.price);

	}

}
}