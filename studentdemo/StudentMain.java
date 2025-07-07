package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentDemo Student_1=new StudentDemo(35, "Raju",25);
		StudentDemo Student_2=new StudentDemo(36, "Ramu",27);
		StudentDemo Student_3=new StudentDemo(37, "Ravi",29);
				
		System.out.println(Student_1);
		
		List<StudentDemo>list =new ArrayList<StudentDemo>();
		
		list.add(Student_1);
		list.add(Student_2);
		list.add(Student_3);
		
		
		for (StudentDemo data:list) {		
		
		System.out.println(data.studentID);
		System.out.println(data. Name);
		System.out.println(data.Age);
		
	}

}
}
