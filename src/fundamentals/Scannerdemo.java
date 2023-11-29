package fundamentals;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Scannerdemo {
	
	public static void main (String [] args) {

	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Your Name:- ");
	String name=sc.nextLine();

	System.out.println("Are you Fresher True Or False:-");
	boolean fresher =sc.nextBoolean();

	System.out.println("Enter Your Marks:-");
	double marks=sc.nextDouble();

	System.out.println("Enter Yor Mobiile Number:- ");
	long contact=sc.nextLong();
		
	System.out.println("********The Given Details*******");
	System.out.println("Name:-"+name);
	System.out.println("Fresher:-"+fresher);
	System.out.println("Marks:-"+marks);
	System.out.println("contact:-"+contact);
	
	}
}
