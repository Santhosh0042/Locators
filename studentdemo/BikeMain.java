package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class BikeMain {

	public static void main(String[] args) {
		
		BikeDemo Bike_1=new BikeDemo("Himalayan","TS07HW6229", 300000.00);
		
		BikeDemo Bike_2=new BikeDemo("jupiter","TS02GS0404", 120000.00);
		
		BikeDemo Bike_3=new BikeDemo("passion","TS54OC7824", 300000.00);
		
		
		System.out.println(Bike_1);
		
List<BikeDemo>list =new ArrayList<BikeDemo>();
		
		list.add(Bike_1);
		list.add(Bike_2);
		list.add(Bike_3);
		
		
		for (BikeDemo data:list) {		
		
		System.out.println(data.BikeName);
		System.out.println(data. BikeNumber);
		System.out.println(data.BikeCost);
		
		

	}

	}
}
