package inheritance;
/*
 * In Hierarchical inheritance there is one parent class and many child class.
 */
class Honda{
	
	String logo="Honda";
}

class Activa extends Honda{
	
	public void KickStart() {
		System.out.println("This IS kickStart");
	}
}

class City extends Honda{
	
	public void reverse() {
		System.out.println("The car is going reverse ");
	}
} 
public class HierachicalInheritance {

	public static void main(String[] args) {
		
		City obj=new City();
		System.out.println("The Logo Is:-"+obj.logo);
		
		Activa a=new Activa();
		a.KickStart();
		System.out.println("\nThe logo:-"+a.logo);
	}

}
