package inheritance;

class Employee{
		
	int empId;
	String company;
	
		public void markAttendance() {
		
			System.out.println("Your attendance has been mark");
	}
}

class Programmer extends Employee{
		
	String level;
		
		public void coding() {
			System.out.println("The programmer is codingas a "+level+" programer");
	}		
}
	
class JavaDeveloper extends Programmer{
	String designation,project;
		
		public void usingHibernate() {
			System.out.println("Java developer is using hibernate to create application");
	}
		
		//override
		public String toString() {
			return "JavaDeveloper[designation]"+designation+",\nProject="+project+",\nCLevel="+level+",\nCompany="+company+",\nEmpId="+empId; 
					
		}
}		
	
	public class MultilevelInheritance {


	public static void main(String[] args) {
	
		JavaDeveloper javaDev = new JavaDeveloper();
        javaDev.empId = 123;
        javaDev.company = "XYZ Corp";
        javaDev.level = "Senior";
        javaDev.designation = "Software Engineer";
        javaDev.project = "E-commerce";
        
        javaDev.markAttendance();
        javaDev.coding();
        javaDev.usingHibernate();


        System.out.println(javaDev);
        
		
	}

}
