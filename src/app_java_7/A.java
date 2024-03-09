package app_java_7;
import java.sql.*;
import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Connection con= null;
		try {
			Scanner scan  = new Scanner(System.in);
			System.out.println("Enter your name:");
			String name = scan.next();
			
			System.out.println("Enter your city:");
			String city = scan.next();
			
			System.out.println("Enter your email:");
			String email = scan.next();
			
			System.out.println("Enter your mobile:");
			String mobile = scan.next();
			
			//connect to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","root");
			System.out.println(con);
			
			//write sql queries
			Statement stmnt =  con.createStatement();
			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//close connection
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	}

}
