package exceptionsProgram;
/*
 * error is also child class of throwble.
 * Error occurs on code that are dangerous or very serious and these codes should not be 
 * handled by try catch. They have to rectified and sloved immeditely.
 */
class EDemo1{
	/*
	 * this will create stack overflow error because methods are called infinitely.
	 */
	public void display() {
		display();
	}
}
public class ErrorDemo {

	public static void main(String[] args) {
		
		new EDemo1().display();
		// this will create OutOfMemoryError because the array size is too big.
		int[] arr =new int[100];
	}

}
