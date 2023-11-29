package Practicle;
/*
 *   5 5 5 5 5 5 5 5 5
 	 5 4 4 4 4 4 4 4 5
	 5 4 3 3 3 3 3 4 5
	 5 4 3 2 2 2 3 4 5
	 5 4 3 2 1 2 3 4 5	
	13 5 4 3 2 2 2 3 4 5
	14 5 4 3 3 3 3 3 4 5
	15 5 4 4 4 4 4 4 4 5	
	16 5 5 5 5 5 5 5 5 5
	17
	18 1
	19 2 6 	
	20 3 7 10
	21 4 8 11 13
	22 5 9 12 14 15
    23
	24 1
	25 3 2 
	26 4 5 6 
	27 10 9 8 7
	28 11 12 13 14 15
	29
	30
 */
public class ComplexPattern {

	public static void main(String[] args) {
	
	    int n = 9; // Adjust this value to change the size of the pattern
        int[][] pattern = new int[n][n];

        // Fill the pattern array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pattern[i][j] = Math.max(Math.abs(i - n / 2), Math.abs(j - n / 2));
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
        //Second pattern
        for(int i =1;i<5;i++) {
        	
        	int count=1;
        	int increment=4;
        	int j=i;
        	for(; count<=i;) {
        		
        		System.out.println(j+"");
        		count++;
        		j+=increment;
        		increment--;
        		}
        	System.out.println();
        }
        
        //third pattern
        int k=1;
        for (int i=1;i<5;i++) {
        	
        	int count=1;
        	if(i%2==0) {
        		
        		for(int j=k+(i-1); count<=i; j--) {
        			
        			
        		}
        	}
        	
        	
        	
        	
        }
	}

}
