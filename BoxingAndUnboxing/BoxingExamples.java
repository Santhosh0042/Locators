package BoxingAndUnboxing;
public class BoxingExamples {
public static void main(String[] args) {
			
	int data_one =  10;
	Integer  int_data_one = Integer.valueOf(data_one);
	System.out.println("Boxing Examples");
	System.out.println(int_data_one);
	
	float data_two = 20.00f;
	Float float_data_two = Float.valueOf(data_two);
	System.out.println(float_data_two);
		
	byte data_three = 30;
	Byte byte_data_three = Byte.valueOf(data_three);
	System.out.println(byte_data_three);
	
	char data_four = 's';
	Character char_data_four = Character.valueOf(data_four);
	System.out.println(char_data_four);
	                                                                 //Manual Boxing 
	long data_five = 50;
	Long long_data_five = Long.valueOf(data_five);
	System.out.println(long_data_five);
	
	short data_six = 60;
	Short short_data_six = Short.valueOf(data_six);
	System.out.println(short_data_six);
	
	double data_seven = 70.00;
	Double double_data_seven = Double.valueOf(data_seven);
	System.out.println(double_data_seven);
	
	boolean data_eight = true;
	Boolean boolean_data_eight = Boolean.valueOf(data_eight);
	System.out.println(boolean_data_eight);
	
	String data_nine = "567";
	Integer int_data_nines = Integer.valueOf(data_nine);
	System.out.println(int_data_nines);
    
	String data_ten = "7544";
	Double double_data_ten = Double.valueOf(data_ten);
	System.out.println(double_data_ten);
	
	}
}
