package abtraction.interfaces;

interface Template{
	
}
class programmer{
	
	public void coding() {
		System.out.println("Programer is coding");
	}
}
/*
 * Below We can see that we can make another interface as parent of the template interface.
 * But we will not able to make a class as parent of our template interface.
 * 
 */

interface Template1 extends Template{
	
	public void show();
}
public class interfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
