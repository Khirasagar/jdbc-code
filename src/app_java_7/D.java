package app_java_7;
import java.sql.*;
public class D {
	public static void main(String[] args) {
		try {
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","root");
			System.out.println(con);
			//write sql queries
			Statement stmnt =  con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from registration");
			while (result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));						
			}
			//close connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
