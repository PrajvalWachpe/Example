package stringPrograms;

public class ReplaceDemo {

	public void display(char a, char b) {
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args) {
	
		String word="Cook Bool";
		String word1=word.replace('o', 'e');
		String word2=word.replace("Book", "Computer");
		
		System.out.println("Word:-"+word);
		System.out.println("Word1:-"+word1);
		System.out.println("Word2:-"+word2);
		
		String message="The boy is standing on road. The dog issitting near the boy";
		String message1=message.replace("boy", "girl");
		String message2=message.replaceFirst("boy", "girl");
		
		System.out.println("Original Message:-"+message);
		System.out.println("New Message:-"+message1);
		System.out.println("Third message:-"+message2);
		
		
	}

}
