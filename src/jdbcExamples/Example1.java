package jdbcExamples;
/*
 * Java DataBase Connection
 * 
 * 1] java.sql package import
 * 2] Load the driver 
 * 3] To create the connection
 * 4] Query executed with the help of statement/Prepared statement 
 * 5] if in case we are executing select type query, then MySql server will give some data
 * in return. This data is received in the java program by Result-set Object. 
 * 6] To close all the object.
 */

import java.sql.*;


public class Example1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","Prajval@9922");
			String sql="insert into Employee values (1, 'Soham', 98979.90)";
			Statement st=con.createStatement();
			int i=st.executeUpdate(sql);
			
			if (i>0)
				System.out.println("Data inserted in table succesfully");
			else
				System.out.println("Error...!!!");
			
		st.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
