package BoxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class TryCatchFinallyExamples {

	public static void main(String[] args) {
		        
		try
		{
		List<String> listdata = new ArrayList<String>();               
		listdata.add("5");
		/*
		 * listdata.add("9"); listdata.add("23465");
		 */
		String val = listdata.get(1);
		System.out.println(val);
		
		}catch(Exception ex) {
	    
	    System.out.println(ex);
	    
		}
	    
	    finally {
	    System.out.println("excution completed");
	    
	    }
	}
		    }
		
	
