package Practicle;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1, num1=0,num2=1;
		System.out.println("Febonacci Series:-");
		
		while(i<10) {
			
			System.out.println(num1);
			int nextterm=num1+num2;
			num1=num2;
			num2=nextterm;
			i++;
		}
		
	}

}
