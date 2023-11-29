package collectionPrograms;

public class Student {

	private Integer sid;
	private String sname;
	private String email;
	private Double totalMarks;
	private Integer age;
	
	public Student() {
		super();
	}
	
	public Student(Integer sid, String sname, String email, Double totalMarks, Integer age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.totalMarks = totalMarks;
		this.age = age;
	}
	
	public Integer getSid() {
		return sid;
	}
	
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Double getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(Double totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "\n\nsid=" + sid + "\nsname=" + sname + "\nemail=" + email + "\ntotalMarks=" + totalMarks + 
				"\nage="+ age;
	}
	
	
}

