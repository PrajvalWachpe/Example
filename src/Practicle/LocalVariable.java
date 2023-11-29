package Practicle;

public class LocalVariable {

	public void display() {
			
			int x = 10;
	        System.out.println("Value of x: " + x);
	        
	        int y = x * 2;
	        System.out.println("Value of y: " + y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable lv=new LocalVariable();
		lv.display();
	}

}
