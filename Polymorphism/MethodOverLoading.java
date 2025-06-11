package Polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) {
	
		
		MethodOverLoadingClass methodOverLoadingClassData = new MethodOverLoadingClass(25,35,"Google");
		
		System.out.println("GoogleId:"+ methodOverLoadingClassData.GoogleId);
		System.out.println("GoogleVersion:"+ methodOverLoadingClassData.GoogleVersion);
		System.out.println("GoogleName:"+ methodOverLoadingClassData.Name);
	}
	
}
