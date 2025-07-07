package BoxingAndUnboxing;

public class UnboxingExamples {

	public static void main(String[] args) {
		
	Integer data_one = 120002;
	int data_ones = data_one.intValue();
	System.out.println(data_ones);
	
	Double data_two = 6542.00;
	double data_twos = data_two.doubleValue();
	System.out.println(data_twos);
	
	Byte data_three = 127;
	byte data_threes = data_three.byteValue();
	System.out.println(data_threes);
	
	Boolean data_four = true;
	boolean data_fours = data_four.booleanValue();
	System.out.println(data_fours);
	
	Float data_five = 75f;
	float data_fives = data_five.floatValue();                       ////Manual Unboxing
	System.out.println(data_fives);
	
	Short data_six = 57;
	short data_sixs = data_six.shortValue();
	System.out.println(data_sixs);
	
	Long data_seven = 673467l;
	long data_sevens = data_seven.longValue();
	System.out.println(data_sevens);
	
	Character data_eight = 'S';
	char data_eights = data_eight.charValue();
	System.out.println(data_eights);
	
	String String_data = "446746";
	long String_datas = Long.parseLong(String_data);
	System.out.println(String_datas);
	
	String Byte_data = "127";
	byte Byte_datas = Byte.parseByte(Byte_data);
	System.out.println(Byte_datas);
			
		
		
		
		
		
		
		

	}

}
