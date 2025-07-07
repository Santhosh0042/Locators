package inheritanceExamples;

public class Google {

	public int GoogleId;
	public int GoogleVersion;
	public String Name;
	
	public Google(int googleId,int googleVersion,String name) {
	this.GoogleId = googleId;
	this.GoogleVersion = googleVersion;
	this.Name = name;
	
}
	
	public void googleDisplay() {
	System.out.println("googleId:"+GoogleId +"googleVersion:"+ GoogleVersion);
	
}
}