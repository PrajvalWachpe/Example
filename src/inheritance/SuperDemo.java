package inheritance;
/* write a program where there is OPPO is parent class and RealMe is
 * child class of OPPO. Both Oppo and Realme should have same instance method sales.
 * 
 *  Super keyword is also use for call a method of parent class
 */


class oppo{
	
	public void sales() {
		
		System.out.println("Calculating Sales Of OppO");
	}
}
class Realme extends oppo{
	
	public void sales() {
		
		System.out.println("Calculating Sales of realMe");
		super.sales();
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Realme r=new Realme();
		r.sales();
	}

}
