package ternaryoperators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = 3,b = 7;
		
		int max = (a > b) ? a : b;
		
		System.out.println("Max value:" + max); 
		
	}
	

}
