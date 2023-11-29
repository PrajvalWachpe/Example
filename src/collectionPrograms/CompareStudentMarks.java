package collectionPrograms;

import java.util.Comparator;

public class CompareStudentMarks implements Comparator<Student> {


	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getTotalMarks().compareTo(s2.getTotalMarks());
		
		
	}

}
