package jdbcExamples;

import java.sql.*;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/anudip?user=root&password=Prajval@9922";
			
			Connection con=DriverManager.getConnection(url);
			String sql="Insert into Employee values(?,?,?)";

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Id:-");
			int EmpId=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Employee Name:-");
			String EmpName=sc.nextLine();
			
			System.out.println("Enter Employee Salary:-");
			double Salary=sc.nextDouble();
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, EmpId);
			ps.setString(2, EmpName);
			ps.setDouble(3, Salary);
			
			int i=ps.executeUpdate();
			
			if(i>0)
				System.out.println("Data inserted succesfully");
			else
				System.out.println("Error...!!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
