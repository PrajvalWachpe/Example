package arrayExample;

public class Example2 {

	public static void main(String[] args) {
		
		String [] subjects= {"Computer","English","Maths","Science"};
		
		int i=0;
		while(i<subjects.length) {
			System.out.println(subjects[i]);
			i++;
		}
		System.out.println("\nUsing enhanced for loop...");
		for(String s: subjects) {
		
			System.out.println(s);
		}
		
	}
}
