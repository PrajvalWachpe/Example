package classObject;

	public class Employee {

		private int empId;
		private String name, designation;
		private double salary;
	
	public Employee() {
	/*This we have created non parameterized constructor which we will use to create 
	empty employee object
	*/
}
/*
 * Below We have created parameterized constructor used to set all values of given 
 * 
 * 
 */
	public Employee(int empID, String name, String designation, double salary) {
		
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public int getEmpID() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public double getSalary() {
		return salary;
	}

	/*
	 * toString method returns the string representation of object.
	 * Syntax:-
	 * public String toString(){
	 * return"";
	 * }
	 * 
	 * As seen below toString method is used to fetch/get all data in all variables  together.
	 * Whenever we bring the reference variables of an object toString method is automatically
	 * caleed and we will be able to see all the data stored in object.
	 * Ex:- 
	 * Employee e2=new Employee();
	 * here e2 is reference variable of employee object. now we will print e2
	 * System.out.println(e2);
	 * now automatically toString method will be called and we will be able to see all employee details
	 * 
	 */
	public String toString() {
		return "Id="+empId+"\nName="+name+"\nDesignation="+designation+"\nSalary="+salary;
	}
}
