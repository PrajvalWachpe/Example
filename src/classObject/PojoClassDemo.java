package classObject;
/*
 * 
 * POJO:- Plain Java Old Object
 * It is a compilable class and contains only private variables, construtors, getter setter
 * and toString.
 *  -----> this key word rpresents the current class object. Meaning we are 
 *  	representing the object of the class in which we are writing this keyword
 *   Class Has Three Types:
 *  1]Predefined:-These Class HAve Been Already Created By Java creators.(Scanner, String, System)
 *  2]User defined:- These Class Is Created By Developers. There Are two Types In It
 *   I)Compilable class:- IS a class which can only be compiled. It cannot be executed on it's own,
 *   	because it does not have main method in it.
 *   II) Executable Class:- Is a class has a main method and can be executed on its own.
 *  
 *   Since variables are private we will not able to access them directly from other class.
 *   WE can set values in the variables by using:- 
 *   1] Parameterized Constructor:- We used this keyworf to declare the instance variable, and 
 *   	then we stored the date of local variable into instance variables.
 *    
 *   2] Setters:- Are public methods specifically used to set values to the private variables.
 *   Syntax:- alt +shift+s is shortcut key for getter or setter
 *   public void setVariable(String Variable){
 *   	this.name=name;
 *   }
 *   
 *   3] Getter:-The values of private variables can be recive in any other class ny using getter 
 *   	or toString. This is a public method specifically used to get the values  that we storeed
 *   	in the instance variable.
 *   Syntax:-
 *   public variableDatatype getVAriable(){
 *   	return VAriable;
 *   }
 */
class Customer {
			
		private String name, email, dob, education;
		private long mobile;
		private boolean fresher;
		private int noticePeriod;
	
	public Customer(String name, String email, long mobile, boolean fresher, String dob, String education, int noticePeriod) {	

		this.name=name;
		this.email=email;
		this.mobile=mobile;
		this.fresher=fresher;
		this.dob=dob;
		this.education=education;
		this.noticePeriod=noticePeriod;
	

	}

	/*
	public void display() {
		
		System.out.println("The Name= "+name);
		System.out.println("The E-mail= "+email);
		System.out.println("The Mobile= "+mobile);
		System.out.println("Is Fresher Or Not= "+fresher);
		System.out.println("The Date OF Birth= "+dob);
		System.out.println("The Education= "+education);
		System.out.println("The NoticePeriod= "+noticePeriod);
		
	}
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public boolean isFresher() {
		return fresher;
	}

	public void setFresher(boolean fresher) {
		this.fresher = fresher;
	}

	public int getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	
	
}

public class PojoClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		CompilableDemo cd=new CompilableDemo();
		cd.display();
		System.out.println("i="+cd.a);
		System.out.println("s="+cd.s);
	   */
		Customer c=new Customer("Prajval","prajval@mail.com", 6987654345L, false,"9 Sep 2000","Graduate", 3);
	
		String n=c.getName();
		String e=c.getEmail();
		long m=c.getMobile();
		boolean f=c.isFresher();
		String d=c.getDob();
		String ed=c.getEducation();
		int no=c.getNoticePeriod();
		
		System.out.println("The Name= "+n);
		System.out.println("The E-mail= "+e);
		System.out.println("The Mobile= "+m);
		System.out.println("Is Fresher Or Not= "+f);
		System.out.println("The Date OF Birth= "+d);
		System.out.println("The Education= "+ed);
		System.out.println("The NoticePeriod= "+no);
	
	
	}

}
