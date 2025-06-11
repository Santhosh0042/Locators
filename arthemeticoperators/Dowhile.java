package arthemeticoperators;

import java.util.ArrayList;
import java.util.List;

public class Dowhile {

	public static void main(String[] args) {
		
		List<String> character = new ArrayList<String>();
		

	    character.add("ravi");
	    character.add("raju");
	    character.add("ramesh");
	    character.add("rakesh");
	    character.add("rahul");
		
			
                int i=0;
					do {
			System.out.println(character.get(i));i++;
					}
					while(i>character.size());
					
					  int j=0;
						do {
				System.out.println(character.get(j));j++;
						}
						while(j>character.size());
						
			}
		
	}


