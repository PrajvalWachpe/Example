package fundamentals;
/*Instance variable are created directly in class, its not inside any local Scope
 * 
 * instance variable can access in all methods
 * A.] if we want to  access instance variable in main method or any other static method then 
 * always first create the object and then access the instace variable from object.
 * 
 * B] If we want to access instance variables from any other non static method then we can 
 * access is directly without making object.
 * */

public class Instancevariable {

	int num=100;
	String institute="Anudip";
	String course="Java";
	
	public static void main(String[] args) {
		
		Instancevariable iv= new Instancevariable();
		System.out.println("Number:-"+iv.num);
		System.out.println("Intitute:-"+iv.institute);
		System.out.println("Course:-"+iv.course);
		iv.display();
	
	}//main method ends here
	
	public void display() {
		
		System.out.println("Number:-"+num);		
		System.out.println("Institute:-"+institute);
		System.out.println("Course:-"+course);
	}
}//class ends here
