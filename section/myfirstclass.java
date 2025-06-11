package section;

    public class myfirstclass {
    
    	static int x=5; //here x is static variable
    	int y=10; //y is instance variable
    	
    	
    	
	public static void main(String[] args) {
		
		staticmethod(); 
	  
	    myfirstclass obj = new myfirstclass();
	
	     obj.instancemethod(); 
	     
    }
	     
		private static void staticmethod() {
			// TODO Auto-generated method stub
			
			System.out.println("static method");
			
			System.out.println("static variable value is: "+x);
		}
		
		private void instancemethod() {
			
			
			System.out.println("instance method");
			 
			System.out.println("variable value is "+y);
		}

	



	
		
	}   

