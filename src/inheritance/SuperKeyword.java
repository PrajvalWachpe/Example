package inheritance;
/*
 * Super keyword represents the parent class object.
 * It'll always declare the immediate parent.
 */
class University{
	
	String name="Mumbai University";
}
class College extends University{
	String name="Bhavan College";
	
	public void display() {
		
		System.out.println("Name:-"+name);
		System.out.println("Name Of Super:-"+super.name);
	}
}
class Department extends College{
	String name="Chemistry Department";
	
	public void show() {
		System.out.println("\n We arre in show method of department");
		System.out.println("NAme:-"+name);
		System.out.println("Name of super:-"+super.name);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College c=new College();
		c.display();
	}

}
