package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class EventMain {

	public static void main(String[] args) {
		Eventdemo  musical_fest=new Eventdemo (25-03-2025,3,500,200);
		Eventdemo  college_party=new Eventdemo (30-03-2025,5,1000,150);
		Eventdemo  dance_event=new Eventdemo (20-04-2025,2,400,300);
				
		System.out.println(musical_fest);
		
		List<Eventdemo> list =new ArrayList<Eventdemo>();
		
		list.add(musical_fest);
		list.add(college_party);
		list.add( dance_event);
		
		
		for (Eventdemo data:list) {		
		
		System.out.println(data.eventDate);
		System.out.println(data.eventDuration);
		System.out.println(data.ticketPrice);
		System.out.println(data.participantsCount);

	}
	}
}
