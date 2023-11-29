package Practicle;


class Student{
	
	private String name, clsteacher;
	private int Class, rollno;
	private float marks;
	private boolean eligible;
	
	public Student() {
		System.out.println("Student Profile");
	}
	
	public Student(String name, int Class, int rollno, String clsteacher, float marks, boolean eligible ) {
			
		this.name=name;
		this.Class=Class;
		this.rollno=rollno;
		this.clsteacher=clsteacher;
		this.marks=marks;
		this.eligible=eligible;
	}
	
	public void display() {
		
		System.out.println("Name="+name);
		System.out.println("Class="+Class);
		System.out.println("Roll-No="+rollno);
		System.out.println("Class Teacher="+clsteacher);
		System.out.println("Marks="+marks);
		System.out.println("Eligible="+eligible);
		
	}
} 
public class PojoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("Prajval Wachpe", 12, 01, "Sujina Pradeep", 73, true);
		s.display();
		
	}

}
