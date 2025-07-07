package assignmentoperators;

public class Demoassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		int y = 10;
		
		System.out.println("value of a "+(x=y));
		System.out.println("value of a "+(x+=y));
		System.out.println("value of a "+(x-=y));
		System.out.println("value of a "+(x*=y));
		System.out.println("value of a "+(x/=y));
		System.out.println("value of a "+(x%=y));
		System.out.println("final value of x = "+x);
		
		System.out.println(y);
		
		
	}

}
