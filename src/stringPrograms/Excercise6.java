package stringPrograms;

//Write a program to print all indexes at which l occurs.
public class Excercise6 {

	public static void main(String[] args) {
		
		String s="Yellow Umbrella";
		
		System.out.println("All the indexes at which l occurs are:-");
   
		for(int i=0; i<s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if (ch=='l') {
				
				System.out.println(i);
			}
		}
	}

}
/*
 * 
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

  
        char targetChar = 'l';

        System.out.println("Indexes of '" + targetChar + "' in the string:");
        findIndexes(inputString, targetChar);
    }

    public static void findIndexes(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
 */

