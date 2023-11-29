package wrapperClasses;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String designation;
	private Double salary;
	
	public Employee(){
		super();
	}

	public Employee(Integer empId, String empName, String designation, Double salary) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.designation=designation;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

	public static void main(String[] args) {
		

	}

}
