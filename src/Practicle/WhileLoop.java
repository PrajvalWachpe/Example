package Practicle;
//write a program to find total of first 10 while number.
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		int sum=0;
		int count=0;
		
		while(count<10) {
			
			sum+=n;
			n++;
			count++;
		}
		System.out.println("The Sum Of first 10 Whole Number Is:-"+sum );
	}

}
