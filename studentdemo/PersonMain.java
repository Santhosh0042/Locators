package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {

		PersonDemo Student_1=new PersonDemo("kiran",6,60);
		PersonDemo Student_2=new PersonDemo("vinay",7,75);
		PersonDemo Student_3=new PersonDemo("vijay",5,29);
				
		System.out.println(Student_1);
		
		List<PersonDemo>list =new ArrayList<PersonDemo>();
		
		list.add(Student_1);
		list.add(Student_2);
		list.add(Student_3);
		
		
		for (PersonDemo data:list) {		
		
		System.out.println(data.Name);
		System.out.println(data.Height);
		System.out.println(data.Weight);
		
	}
	}
}
