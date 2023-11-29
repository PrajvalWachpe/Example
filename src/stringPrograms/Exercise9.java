package stringPrograms;
//Write a program to count a number of word from given string.
public class Exercise9 {

	public static void main(String[] args) {
		
		  String inputString = "Hi everyone !! weekend is here.";

	        int wordCount = countWords(inputString);
	        
	        System.out.println("Number of words in the string: " + wordCount);
	    }

	    public static int countWords(String input) {
	        if (input == null || input.isEmpty()) {
	            return 0;
	        }

	        String[] words = input.split(" ");
	        
	        return words.length;
	    }
	
	}

/*
 * 
 */
