package abtraction;

abstract class Employee{
	int empId;
	String empName;
	
	public Employee() {
		System.out.println();
	}
	
	public Employee(int empId, String empName) {
		
		this.empId=empId;
		this.empName=empName;
	}
	
	public void attendence() {
		System.out.println("The Attendence Is Marked");
	}
	
	abstract public double salaryCalc(String employeetype);
}

class Developer extends Employee{
	
	public double salaryCalc(String employeetype) {
		if(employeetype.equals("Permenant"))
		{
			return 50000;
		}
		else
		{
			return 25000;
		}
	}
}
public class Example1 {

	public static void main(String[] args) {
		
		Developer developer = new Developer();
        
        
        developer.empId = 123;
        developer.empName = "John";

   
        developer.attendence();

        double salary = developer.salaryCalc("Permanent");
        System.out.println("Salary: $" + salary);

	}

}
