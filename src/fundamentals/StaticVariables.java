package fundamentals;

/*
 *  Static variables are created in class with static word
 * */

public class StaticVariables {
	
	int num=100;//instance
	static int num1=200;//static
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables sv=new StaticVariables();
		System.out.println("Number:-"+sv.num);
		System.out.println("Number1:-"+num1);
		
	}
		
	public void display() {
		
		System.out.println("Number:-"+num);
		System.out.println("Number1:-"+num1);
	}
}
