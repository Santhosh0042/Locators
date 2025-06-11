package inheritanceExamples;

public class Person {

	public int PersonId;
	public String PersonName;
	public int Age;
	public String Address;
	
	public Person(int personId, String personName, int age, String address) {
	
	this.PersonId = personId;
	this.PersonName = personName;
	this.Age = age;
	this.Address = address;
	
	}
	
	public void displayDetails() {
	
	System.out.println("Person Id:"+ PersonId+", PersonName:"+ PersonName+",  Age:"+ Age);
	
	}
	
}
