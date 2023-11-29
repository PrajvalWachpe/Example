package stringPrograms;

public class StringBufferEx1 {

	public static void main(String[] args) {
		/*
		 * If we want to create mutable object of character sequence then we should use 
		 * StringBuffer or StringBuilder 
		 * 
		 * these are also classes that create mutable object.
		 * ConCatination is process of adding word or character to an existing String
		 */
		
		StringBuffer sb=new StringBuffer();
		String s="Anudip";

		System.out.println("Before:");
		System.out.println("s="+s+"\nsb="+sb);
		
		s.concat("Foundation");
		sb.append("Foundation");
		
		System.out.println("\nAfter:");
		System.out.println("s="+s+"\nsb="+sb);
	}

}
