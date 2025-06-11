package relationaloperators;

import java.util.Scanner;

public class Comparisionoperators {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the student's score: ");
	        int score = scanner.nextInt();

	        
	        if (score >= 40) {
	            System.out.println("Status: Pass");
	        } else {
	            System.out.println("Status: Fail");
	        }

	        
	        if (score >= 80) {
	            System.out.println("Grade: A");
	        } 
	        else if (score >= 70) {
	            System.out.println("Grade: B");
	        } 
	        else if (score >= 45) {
	            System.out.println("Grade: C");
	        }
	        else {
	            System.out.println("Grade: D (Fail)");
	        }

	      
	        
	        System.out.println("score == 40: " + (score == 40));  
	        
	        System.out.println("score != 100: " + (score != 100)); 
	       
	        System.out.println("score > 70: " + (score > 70));  
	       
	        System.out.println("score < 80: " + (score < 80)); 
	       
	        System.out.println("score >= 45: " + (score >= 45)); 
	      
	        System.out.println("score <= 100: " + (score <= 100));
	        
	    }
		
	}


