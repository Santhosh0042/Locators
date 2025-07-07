package inheritanceExamples;

public class GoogleYears extends GoogleLatestUpdate{

	
	public int GoogleYearsCompleted;
	
	
	public GoogleYears(int googleId, int googleVersion, String name, int Year,int googleyearsCompleted) {
		super(googleId, googleVersion, name, Year);
		
		
		this.GoogleYearsCompleted =  googleyearsCompleted;
}
	
	
	@Override
    public void googleDisplay() {
		super.googleDisplay();
	System.out.println("GoogleYearsCompleted:"+ GoogleYearsCompleted);
	
	
	
	}
}