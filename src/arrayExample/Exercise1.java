package arrayExample;
/*
 * Write a program to store all the names of students in array.
 * Print all members of this array.
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		String[] studentNames = new String[5]; 
       
        studentNames[0] = "Alice";
        studentNames[1] = "Bob";
        studentNames[2] = "Charlie";
        studentNames[3] = "David";
        studentNames[4] = "Eve";
        
      
        System.out.println("List of Student Names:");
        for (int i = 0; i < studentNames.length; i++) 
        {
            System.out.println(studentNames[i]);
        }
	}

}
/*	simple method
 * 
 * String [] names=new String[5];
 * System.out.println("enter name:");
 * Scanner sc=new Scanner(System.in);
 * for (int i = 0; i <names.length; i++) 
 * {
 *  System.out.println("enter:");
 *  names[i]=sc.next();
 *  }
 * System.out.println("print name:");
 * for (int i = 0; i <names.length; i++) 
 * {
 *  System.out.println(names[i]);
 *  }
 */