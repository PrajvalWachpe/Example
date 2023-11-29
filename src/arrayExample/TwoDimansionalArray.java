package arrayExample;
/*
 * Two dimensional arrays are array in which each member is also an array.
 * A Array of array is also known as Two Dimensional Array
 */
public class TwoDimansionalArray {
/*
 * INT []A={};
 * INT [][] a={{ }}
 */
	public static void main(String[] args) {
		   
		String [] names=new String [3];
		names [0]="Prajval";
		names [1]="Akash";
		names [2]="KArtik";
	
		String [][] color=new String [3][2];
		String a1 []= {"Red","Yellow"};
		String a2 []= {"White","Black"};
		String a3 []= {"Brown","OffWhite"};
		
		color [0]=a1;
		color[1]=a2;
		color[2]=a3;
		
		for (int i = 0; i < color.length; i++) {
	        for (int j = 0; j < color[i].length; j++) {
	            System.out.print(color[i][j] + " ");
	        }
	        System.out.println(); 
	    }
	}

}
