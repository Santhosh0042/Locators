package arthemeticoperators;

import java.util.ArrayList;
import java.util.List;


public class Foreach {

	public static void main(String[] args) {
		
   List<Integer>values = new ArrayList<Integer>();
		
		values.add(15);
		values.add(20);
		values.add(25);
		values.add(30);
		values.add(35);
	
		for(int i=0;i<values.size();i++) {
		
		System.out.println(values);
		
		
	}

	}
}
