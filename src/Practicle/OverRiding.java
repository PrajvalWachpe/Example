package Practicle;

/*Create a class student which has a instance variable rollno and name
*student class has a method attend session which print "student is attending the session"
* Create a child class YourName;
* when we attend session from class is should specifiy the student is attending online 
*/

class Students{
	
	String Name="Prajval";
	int RollNo=21;
	
	public void AttendSession() {
		
		System.out.println("Student"+Name+"Roll no"+RollNo+"Is Attending The Session");
	}
}
class Prajval extends Students{
	
	public void AttendSession() {
		
		System.out.println("Student "+Name+" With Roll no "+RollNo+" Is Attending The Session");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prajval p=new Prajval();
		p.AttendSession();
	}

}
