package app_java_7;
import java.sql.*;
import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		try {
			Scanner scan  = new Scanner(System.in);
					
			System.out.println("Enter your email:");
			String email = scan.next();
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","root");
			System.out.println(con);
			
			//write sql queries
			Statement stmnt =  con.createStatement();
			stmnt.executeUpdate("DELETE FROM registration WHERE email='"+email+"'");
			
			//close connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
