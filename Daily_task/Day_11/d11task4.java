package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_mainprogram {
	public static void delete(Statement stmt) throws SQLException {
		String query="DELETE FROM student WHERE mark=70 ";
		stmt.executeUpdate(query);
		System.out.println("Query executed");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		delete(stmt);
		
	}
}
