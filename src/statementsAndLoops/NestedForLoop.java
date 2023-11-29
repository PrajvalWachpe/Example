package statementsAndLoops;

public class NestedForLoop {
/*
 * for loop is used to execute repetitive task.
 * In below given code the inner for loop is print 1 to 5 in line.
 * the blank println is used to get the cursor to next line
 * 
 * now this same task we want to do for 5 more times.
 * Hence we have put the for loop which print 1 to 5 inside another loop so
 * that the inner for loop runs for5 more times.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++) {
			
			for (int x=1; x<=5; x++) {
				
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
