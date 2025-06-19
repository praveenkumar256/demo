package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_task3 {
	public static void display(Statement stmt) throws SQLException {
		String query="select * from student;";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		System.out.println("Query executed");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		display(stmt);
		
}
}