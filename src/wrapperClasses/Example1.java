package wrapperClasses;
/*
 * Wrapper classes are predefined classes. They are used to convert primitive data 
 * to object type.
 * 
 *  Primitive			wrapper class
 *  byte				Byte
 *  short				Short
 *  int 				Integer
 *  long				Long
 *  
 *  float				Float
 *   double				Double
 *  
 *  boolean				Boolean
 *  char				Character
 */
public class Example1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		Integer num1=num;
		/*
		 * Using objects instead of primitive data types is useful since we get many
		 * predefined methods to manipulate our data in wrapper class objects
		 */
		
		System.out.println("Num="+num);
		
		String a="10";
		String b="20";
		
		System.out.println("Addition of String"+(a+b));
		
	}

}
