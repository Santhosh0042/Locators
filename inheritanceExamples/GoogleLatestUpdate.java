package inheritanceExamples;

public class GoogleLatestUpdate extends Google {

	
public int Year;	

	public GoogleLatestUpdate(int googleId, int googleVersion, String name,int year) {
		super(googleId, googleVersion, name);

		
		this.Year = year;
		
	}

	@Override
    public void googleDisplay() {
		super.googleDisplay();
	
	System.out.println("Year:"+Year);
	
	
	}	
}
