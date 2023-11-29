package encapsulation;
/*
 * Encapsulation is one of the pillar of oops concept.
 * We achieve encapsulation using access specifier such as private
 */

class Employee{
	
	private int empId;
	private String empName;
	private double salary;
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, double salary) {
		
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
	}
}
public class Example {
	
	public static void main(String[] args) {
	
		Employee e= new Employee();
		e.setEmpId(500);
		e.setEmpName("Prajval");
		e.setSalary(50000.00);
	}

}
