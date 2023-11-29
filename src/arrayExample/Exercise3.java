package arrayExample;
/*
 * Create a new int type array b of size 5. The embers should be double of the member in array in a.
 * 
 */
public class Exercise3 {

	public static void main(String[] args) {
		 
		int[] a= {1,2,3,4,5};
		
		int []b=new int[a.length];
		
		for(int i=0; i<a.length;i++) {
			b[i]=2*a[i];
		}
		
		System.out.println("A= [");
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
			if(i<a.length-1) {
				System.out.println(", ");
		}
		}
		System.out.println("] ");
		
		
			System.out.println("B= [");
			for (int i=0; i<b.length;i++) {
				System.out.println(b[i]);
				if(i<b.length-1) {
					System.out.println(", ");
			}
		}
			System.out.println("]");
		
		}
}
/*
 * int [] a={1,2,3,4,5}
 * int [] b= new int[5];
 * 
 * for(int i=0; i<5; i++){
 * 	b[i]=2*a[i]; // adding the member into b array
 *  System.out.println(b[i]);
 * }
 * 
 * 
 * 
 */
