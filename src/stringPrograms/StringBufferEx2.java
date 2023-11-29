package stringPrograms;

public class StringBufferEx2 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Anudip");
		String s="Anudip";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		/*
		sb.reverse();
		
		System.out.println("Reverse of s="+rev);
		System.out.println("Reverse of sb="+sb);

		 */
		StringBuffer sb2=new StringBuffer("Indian Cricket Team");
		System.out.println("Before: "+sb2);
		/*
		 * In the StringBuffer/StringBuilder class the replace method is used to replace
		 * the character from start index up to end index are replaced  
		 */
		sb2.replace(7, 14, "Hockey");
		System.out.println("After: "+sb2);
		
		sb2.delete(0, 6);
		System.out.println("After Deleting: "+sb2);
	}

}
