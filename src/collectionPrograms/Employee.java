package collectionPrograms;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {
		
		return this.salary.compareTo(e.salary);
	}

	@Override
	public String toString() {
		return "\nid=" + id + ", name=" + name + ", salary=" + salary;
	}
}
