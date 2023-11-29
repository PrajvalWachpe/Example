package arrayExample;
/*
 * java bean class or POJO class. POJO(Plain Old Java Object )
 */
public class Employee {

	private int empId;
	private String empName;
	private String Designation;
	private Double Salary;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, String Designation, Double Salary) {
		super();
		this.empId=empId;
		this.empName=empName; 
		this.Designation=Designation;
		this.Salary=Salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Designation=" + Designation + ", Salary="
				+ Salary + "]";
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public static void main(String[] args) {
		
	}

}
