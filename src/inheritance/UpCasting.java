package inheritance;
/*
 * Up-casting is done to make child object behave like a parent.
 * we do it by making a child class object with referring it with parent type variable.
 * by doing this now we'll able to call only those methods which the child has inherited
 * from the parent. 
 * Any method that child class has of it's own, will not be child
 */
class LivingThings{
	
	public void movements() {
		
		System.out.println("This Is Being Is Moving.....");
	}
	
	public void growing() {
		
		System.out.println("This Animal Is Growing...");
	}
	public void extraction() {
		
		System.out.println("This Animal Is Extracting...");
	}
}

class Birds extends LivingThings{
	
	public void movements() {
		
		System.out.println("The bird can move by walking, hoping or flying...");
	}
	
	public void layingEggs() {
		
		System.out.println("The Bird Is Laying Eggs....");
	}
	
	public void hunting() {
		
		System.out.println("Bird Is hunting...");
	}
}
public class UpCasting {

	public static void main(String[] args) {
	
		
		/*
		 * b is reference variable which is pointing to the memory location
		 * where object of birds class is made 
		 */
		Birds b=new Birds();
		b.movements();
		b.layingEggs();
		
		LivingThings lt=new LivingThings();
		lt.movements();
		/*
		 * Below we are seeing upcastin. here we are making the object of child 
		 * class and refering it with a variable of parent type
		 */
		LivingThings l=new Birds();
		l.movements();
		l.extraction();
	}

}
