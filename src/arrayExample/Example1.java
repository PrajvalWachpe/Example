package arrayExample;
/*
 * Array is an object of fixed size used to store a group of object or values of the same datatypes.
 * 
 *   Points To Remember:-
 *   1] Size is fixed. We can't add more then size at runtime.
 *   2] Arrays accept all data of same data-types. 
 *   3] All members have indexes starting from 0 to length -1.
 *   4] we add and retrieves members by it's indexes
 */
public class Example1 {

	public static void main(String[] args) {
	
		int rollNo=10;
		int [] allrollno=new int[5];
		
		allrollno[0]=10;
		allrollno[1]=22;
		allrollno[2]=23;
		allrollno[3]=33;
		allrollno[4]=44;
		
		
		int a []=new int[10];
		int b[]=new int[] {1,2,3,4,5,6,7,};
		char[] symbols= {'$','#','%'};
		String [] name= {"Prajval","Om","Atharva","Soham"};
		
		
		System.out.println(rollNo);
		
		for(int i=0; i<allrollno.length; i++) {
			
			System.out.println(allrollno[i]);
		}
	}

}
