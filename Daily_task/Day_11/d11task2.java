package day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_task2 {
	public static void insert(Statement stmt) throws SQLException {
		String quary="INSERT INTO student (id,name,mark,class_name) VALUES"+
	"(1,'gowdham',90,'Bsc cs'),"+
	"(2,'gowthaman',80,'Bsc cs'),"+
	"(3,'Nandagopal',70,'Bsc cs');";
		int n=stmt.executeUpdate(quary);
		System.out.println("insert element:"+n);

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/sample";
	String username="root";
	String password="";
	Connection con=DriverManager.getConnection(url,username,password);
	Statement stmt=con.createStatement();
	insert(stmt);
	
}
}