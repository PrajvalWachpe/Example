package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(new Student(104,"Akash","akash@gmail.com",97.0,24));
		sList.add(new Student(98, "Mohini","mohini@rediff.com",86.0,22));
		sList.add(new Student(304, "Abhishek","abhishek@20lpa.com",100.0,18));
		sList.add(new Student(256,"Aishwarya","aish@yahoo.com",90.0,21));
		sList.add(new Student(224,"Pratik","pratik@microsoft.com",85.0,23));
		
		Collections.sort(sList, new CompareStudentId());
		System.out.println("Sorting idwise:\n"+sList);
		
		Collections.sort(sList, new CompareStudentMarks());
		System.out.println("Sorting markswise:\n"+sList);
		
		Collections.sort(sList, new CompareStudentName());
		System.out.println("Sorting namewise:\n"+sList);
	}

}
