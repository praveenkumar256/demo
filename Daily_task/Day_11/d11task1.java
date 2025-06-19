package day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_task1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/sample";
	String username="root";
	String password="";
	Connection con=DriverManager.getConnection(url,username,password);
	Statement stmt=con.createStatement();
	
	String quary="create table student(id int,name varchar(20),mark int,class_name varchar(20))";
	stmt.executeUpdate(quary);
	System.out.println("table created");
	
}
}
