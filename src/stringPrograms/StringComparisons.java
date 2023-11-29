package stringPrograms;

public class StringComparisons {

	public static void main(String[] args) {
	
		String s="Prajval";
		String s1="Prajval";
		String s2="Prajval Wachpe";
		
		System.out.println("s equals s1?"+s.equals(s1));
		System.out.println("s equals s2"+s.equals(s2));
		
		int i=s.compareTo(s1);
		int j=s.compareTo(s2);
		
		if (i==0)
			
			System.out.println("S is exactly same as S1");
			
			else 
				System.out.println("S and s1 is different");
		
		if (j==0)
			
			System.out.println("S is exactly same as S2");
			
			else 
				System.out.println("S and S2 is different");
		
		
		
	}

}
