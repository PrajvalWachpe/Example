package stringPrograms;

public class SubString {

	public static void main(String[] args) {
		
		String address="Andheri west, azad nagar";
		String s=address.substring(8);
		String s1=address.substring(8, 12);
		
		System.out.println("Address:- "+address);
		System.out.println("s:-"+s);
		System.out.println("s1:-"+s1);

	}

}
