package app_java_7;
import java.sql.*;
import java.util.Scanner;
public class C {
	public static void main(String[] args) {
		try {
			Scanner scan  = new Scanner(System.in);			
			System.out.println("Enter your email:");
			String email = scan.next();
			
			System.out.println("Enter your mobile:");
			String mobile = scan.next();
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","root");
			System.out.println(con);
			
			//write sql queries
			Statement stmnt =  con.createStatement();
			stmnt.executeUpdate
			(" UPDATE registration SET mobile = '"+mobile+"' WHERE email = '"+email+"' ");
			
			//close connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
