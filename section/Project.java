package section;

public class Project {

			public static String getDayName(int day) {
		    String dayName;
		    
		    switch (day) {
		        case 1:
		            dayName = "Monday";
		            break;
		        case 2:
		            dayName = "Tuesday";
		            break;
		        case 3:
		            dayName = "Wednesday";
		            break;
		        default:
		            dayName = "Invalid day";
		    }
		
		return dayName;  // Return the result after processing
	}

	public static void main1(String[] args) {
	    System.out.println(getDayName(2));  
	}

}
