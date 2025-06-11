package assignmentoperators;

import java.util.Scanner;

public class MainAssign {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number_one number:");
		int a = sc.nextInt();
	
		System.out.println("enter number_two number:");
		int b = sc.nextInt();
		
		
		
		DemoAssign demo = new DemoAssign();
		
		int output_Equal = demo.Equalassign(a,b);
		int output_add = demo.addassign(a,b);
		int output_sub = demo.subassign(a,b);
		int output_multi = demo.multiassign(a,b);
		int output_division = demo.divisionassign(a,b);
		int output_modul = demo.modulassign(a,b);
		
		System.out.println("Equal a="+output_Equal);
		System.out.println("Add_Equal a="+output_Equal);
		System.out.println("Sub_Equal a="+output_Equal);
		System.out.println("Multi_Equal a="+output_Equal);
		System.out.println("Division_Equal a="+output_Equal);
		System.out.println("Modul_Equal a="+output_Equal);
	
	}
	}
