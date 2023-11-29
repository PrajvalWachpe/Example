package stringPrograms;

public class ScpDemo {

	public static void main(String[] args) {

		/*
		 * s and t are created using literals. Hence both reference variables will point
		 * to the same object of java in SCP memory.
		 * For string if we use == operator then jvm checks if   
		 */
		
		String s="Java";
		String t="Java";
		
		String a=new String("Coding");
		String b=new String("Coding");
		
		
		System.out.println("Is s and t pointing same string"+(s==t));
		System.out.println("Is a and b pointing same string"+(a==b));
	}

}
