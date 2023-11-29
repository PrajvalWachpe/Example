package exceptionsProgram;

class Demo{
	
	public void databaseConnectivity() throws ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver");
	}
}

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		System.out.println("Hello everyone..!");
		Demo d=new Demo();
		try {
			d.databaseConnectivity();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
