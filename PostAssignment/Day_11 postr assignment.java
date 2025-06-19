package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class post_assignment_day11 {
	public static void insert(Statement stmt) throws SQLException {
		stmt.executeUpdate("DROP TABLE IF EXISTS student"); // Deletes the table if it exists
		stmt.executeUpdate("CREATE TABLE student (id INT, name VARCHAR(20), mark INT, class_name VARCHAR(20))");
		String quary="INSERT INTO student (id,name,mark,class_name) VALUES"+
	"(1,'gowdham',90,'Bsc cs'),"+
	"(2,'gowthaman',80,'Bsc cs'),"+
	"(3,'Nandagopal',70,'Bsc cs');";
		int n=stmt.executeUpdate(quary);
		System.out.println("insert element:"+n);

	}
	public static void delete(Statement stmt) throws SQLException {
		String query="DELETE FROM student WHERE mark=70 ";
		stmt.executeUpdate(query);
		System.out.println("Query executed");
	}
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
		String query = "CREATE TABLE IF NOT EXISTS student (id INT, name VARCHAR(20), mark INT, class_name VARCHAR(20))";
		stmt.executeUpdate(query);
		System.out.println("Table checked/created successfully.");
		Scanner sc = new Scanner(System.in);
	    int choice;

	        while (true) {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Insert ");
	            System.out.println("2. Delete");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    insert(stmt);
	                    break;
	                case 2:
	                	delete(stmt);
	                    break;
	                case 3:
	                    display(stmt);
	                    break;
	                case 4:
	                    break;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
}
}
