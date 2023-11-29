package stringPrograms;

public class IndexOf {

	public static void main(String[] args) {
	

		String m="Jailer The Movie";
		
		System.out.println("Lenght of movie:-"+m.length());
		
		int i=m.indexOf('e');
		
		System.out.println("First index of charachter e="+i);
		
		int j=m.lastIndexOf('i');
				
		System.out.println("Last index of character i="+j);
		
		int k=m.indexOf("The");//overloaded index method
		
		System.out.println("Index Of the:- "+k);
		
		int a=m.indexOf('e', 6);
		
		System.out.println("Index of e:- "+a);
	}

}
