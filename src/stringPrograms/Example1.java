package stringPrograms;

public class Example1 {

	public static void main(String[] args) {
		
		String s ="Anudip";

		String s1=new String();
		
		System.out.println("S="+s);
		System.out.println("S1="+s1);
		
		String s2=new String("Java");
		System.out.println("S2="+s2);
		
		String s3=new String(s);
		System.out.println("S3="+s3);
		
		char symbols[]= {'+','*','&','%','$'};
		String s4=new String(symbols);
		
		System.out.println("S4="+s4);
	}

}
